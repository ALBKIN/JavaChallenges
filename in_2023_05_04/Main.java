// BUILD BASIC ANDROID APPS WITH JAVA / Game Logic Pt. II

package in_2023_05_04;

import in_2023_04_28.MainActivity;

public class Main {
    public static void main(String[] args) {
        MainActivity mainActivity = new MainActivity();
        mainActivity.startNewGame();
        System.out.println("Questions remaining: " + mainActivity.totalQuestions);
        Question currentQuestion = mainActivity.getCurrentQuestion();
        printQuestion(currentQuestion);
        // Play the game!
        mainActivity.onAnswerSubmission();
    }

    static void printQuestion(Question question) {
        System.out.println("Question: " + question.questionText);
        System.out.println("Option 1: " + question.answer0);
        System.out.println("Option 2: " + question.answer1);
        System.out.println("Option 3: " + question.answer2);
        System.out.println("Option 4: " + question.answer3);
    }
}
