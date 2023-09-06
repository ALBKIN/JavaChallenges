// JAVA THREADING SYNCHRONIZATION PRACTICE

package in_2023_09_06;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private int c = 0;

    public int getCount() {
        return this.c;
    };

    public void setCount(int c) {
        this.c = c;
    };

    public synchronized void increment() {
        this.setCount(this.getCount() + 1);
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        List<Thread> threads = new ArrayList<>();

        Thread a = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread b = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread d = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                c.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        // Add pre-defined threads to the list
        threads.add(a);
        threads.add(b);
        threads.add(d);

        // Create and add more threads dynamically
        for (int j = 0; j < 5; j++) {
            int count = 100 * (j + 1);  // Just an example; this can be any value
            Thread newThread = new Thread(() -> {
                for (int i = 0; i < count; i++) {
                    c.increment();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            });
            threads.add(newThread);
        }

        // Optionally, start the threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Join both threads here
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter: " + c.getCount());
    }
}
