// LEARN JAVA // ARRAYS / String[] args

package in_2023_03_14;

import java.util.Arrays;

public class Newsfeed5 {
    String[] topics;

    // constructor method
    public Newsfeed5(String[] initialTopics) {
        topics = initialTopics;
    }

    // main method
    public static void main(String[] args) {
        Newsfeed5 feed;
        if (args[0].equals("Human")) {
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new Newsfeed5(humanTopics);

        } else if (args[0].equals("Robot")) {
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new Newsfeed5(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new Newsfeed5(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
