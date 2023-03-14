// LEARN JAVA // ARRAYS / Length
package in_2023_03_14;

import java.util.Arrays;

public class Newsfeed4 {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    // constructor method
    public Newsfeed4() {

    }

    // get topics list method
    public String[] getTopics() {
        return topics;
    }

    // get length of topic table - method
    public int getNumTopics() {
        return topics.length;
    }

    // main method
    public static void main(String[] args) {
        Newsfeed4 sampleFeed = new Newsfeed4();

        System.out.println("The number of topics is " + sampleFeed.getNumTopics());
    }

}
