package in_2023_04_27;

public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
        Question Pierwsze = new Question(111111, "What is best in life?", "The open steppe", "Wind in your hair", "Women, wine and song", "To crush your enemies!", 3);
        Question Drugie = new Question(222222, "Who's the mightiest of them all?", "Lord Allbert", "Paź Artur", "Dr. Zoidberg", "Gorlock the Destroyer", 0);
        Question Trzecie = new Question(333333, "66...?", "6", "7", "6", "6", 1);

        System.out.println("Question 1: " + Pierwsze.questionText);
        System.out.println("Question 1 Correct Answer: " + Pierwsze.correctAnswer);
        System.out.println("Question 2, answer0: " + Drugie.answer0);
        System.out.println("Question 3, answer3: " + Trzecie.answer3);
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
    }
}

