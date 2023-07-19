package in_2023_07_19;

import in_2023_07_16.Vertex;
import in_2023_07_18.Queue;

public class QueueObject implements Comparable<QueueObject> {
    public Vertex vertex;
    public int priority;

    public QueueObject(Vertex v, int p) {
        this.vertex = v;
        this.priority = p;
    }

    @Override
    public int compareTo(QueueObject o) {
        if (this.priority == o.priority) {
            return 0;
        } else if (this.priority > o.priority) {
            return 1;
        } else {
            return -1;
        }
    }
}
