// LEARN JAVA // ARRAYS / Get Element By Index

package in_2023_03_12;

import java.util.Arrays;

public class Newsfeed2 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    // constructor method?
    public Newsfeed2() {
    }

    // get topics method
    public String[] getTopics() {
        return topics;
    }

    // get Top Topic method
    public String getTopTopic() {
        return topics[0];
    }

    // count views of the topic method
    public void viewTopic(int topicIndex) {
        views[topicIndex] = views[topicIndex] + 1;
    }

    // main method
    public static void main(String[] args) {
        Newsfeed2 sampleFeed = new Newsfeed2();

        System.out.println("The top topic is " + sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
    }
}
