// LEARN JAVA / LOOPS / break and continue

package in_2023_03_14;

class Numbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // add your code here
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
