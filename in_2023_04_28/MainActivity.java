// BUILD BASIC ANDROID APPS WITH JAVA / Game Logic Pt. I

package in_2023_04_28;

public class MainActivity {

    // Add generateRandomNumber() here
    public int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double randomQuestionNo = randomNumber * max;
        int askQuestionNo = (int) randomQuestionNo;
        return askQuestionNo;
    }

    // Add getGameOverMessage() here
    public String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            String youWon = "You got all " + totalQuestions + " right! You won!";
            return youWon;
        } else {
            String tryAgain = "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
            return tryAgain;
        }
    }
}