// LEARN JAVA // ARRAYS / Creating an Empty Array

package in_2023_03_14;

import java.util.Arrays;

public class Newsfeed3 {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    // constructor method
    public Newsfeed3() {
        // Initialize favoriteArticles here:
        favoriteArticles = new String[10];
    }

    // set favorite article method
    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }

    // main method
    public static void main(String[] args) {
        Newsfeed3 sampleFeed = new Newsfeed3();

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
