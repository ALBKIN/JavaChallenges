// BUILD BASIC ANDROID APPS WITH JAVA / Game Logic Pt. II

package in_2023_05_04;

import java.util.ArrayList;

public class MainActivity {

    // TODO #1: add integer member variables here
    int currentQuestionIndex;
    int totalCorrect;
    int totalQuestions;

    // TODO #2: add ArrayList member variable here
    ArrayList<Question> questions;

    // TODO #3: add startNewGame() here
    public void startNewGame() {
        questions = new ArrayList<>();

        Question Pierwsze = new Question(11111, "What is best in life?", "The open steppe", "Wind in your hair", "Women, wine and song", "To crush your enemies!", 3);
        Question Drugie = new Question(22222, "Who's the mightiest of them all?", "Lord Allbert", "Paź Artur", "Dr. Zoidberg", "Gorlock the Destroyer", 3);
        Question Trzecie = new Question(333333, "66...?", "6", "7", "6", "6", 3);

        questions.add(Pierwsze);
        questions.add(Drugie);
        questions.add(Trzecie);

        totalCorrect = 0;
        totalQuestions = questions.size();
        // displayQuestion(firstQuestion);
        // displayQuestionsRemaining(questions.size());
    }

    // TODO #4: add chooseNewQuestion() here
    public Question chooseNewQuestion() {
        int nrPytania = generateRandomNumber(questions.size());
        // może tak zamiast next: currentQuestionIndex = questions.indexOf(nrPytania);
        currentQuestionIndex = nrPytania;
        return questions.get(currentQuestionIndex);
    }

    // TODO #5: add getCurrentQuestion() here
    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    // TODO #6: add onAnswerSubmission() here
    public void onAnswerSubmission() {
        if (getCurrentQuestion().isCorrect()) {
            totalCorrect++;
        }
        questions.remove(currentQuestionIndex);
        // displayQuestionsRemaining(questions.size());
        if (questions.size() == 0) {
            System.out.println(getGameOverMessage(totalCorrect, totalQuestions));
            startNewGame();
        } else {
            chooseNewQuestion();
            // TODO: uncomment after implementing displayQuestion()
            // displayQeustion(getCurrentQuestion());
        }
    }

    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    String getGameOverMessage(int totalCorrect, int totalQuestions) {
        if (totalCorrect == totalQuestions) {
            return "You got all " + totalQuestions + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalQuestions + ". Better luck next time!";
        }
    }
}
