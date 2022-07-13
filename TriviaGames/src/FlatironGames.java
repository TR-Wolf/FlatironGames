import java.util.Scanner;

public class FlatironGames {
    public static void main(String[] args) {
        //On my end of things,
        TriviaQuizFactory myFactory = new TriviaQuizFactory();

        boolean playingGames = true;
        Scanner sc = new Scanner(System.in);
        while (playingGames) {
            TriviaQuiz chosenQuiz = myFactory.getQuiz(sc);
            if (chosenQuiz == null) {
                playingGames = false;
            } else {
                //While the chosen quiz has a next question available
                while (chosenQuiz.hasNextQuestion()) {
                    //Get the next question from the quiz
                    TriviaQuestion thisQuestion = chosenQuiz.getNextQuestion();
                    //Ask this question
                    thisQuestion.askQuestion();
                    //get an answer from the user
                    String answer = sc.nextLine();
                    //If this question is right for this answer then add 1 point
                    if (thisQuestion.isRight(answer)) {
                        chosenQuiz.addPoints(1);
                    }
                }
                System.out.println("You received " + chosenQuiz.getTotalScore() + " points!");
            }

        }
    }
}

// TODO implement a FreeFormTriviaQuestion class

// TODO each member of your team should add an implementation of src.TriviaQuiz
// Try NOT to consult each other when making your implementation of src.TriviaQuiz
// (the point is each src.TriviaQuiz implementation may work differently under the hood but the code above interacts with them all in the same way)
// Example: AbdellaTriviaQuiz, ThomasTriviaQuiz
