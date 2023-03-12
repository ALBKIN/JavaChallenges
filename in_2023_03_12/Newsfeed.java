// LEARN JAVA // ARRAYS / Creating an Array Explicitly

package in_2023_03_12;

public class Newsfeed {

    // constructor method (empty for now)
    public Newsfeed() {
    }

    // get topic method
    public String[] getTopics() {
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    // main method
    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();

        String[] topics = sampleFeed.getTopics();
        System.out.println(topics);
    }
}
