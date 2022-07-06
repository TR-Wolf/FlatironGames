package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlatironGames {
    public static void main(String[] args) {
        Map<String, TriviaQuiz> quizzes = new HashMap<>(); // TODO proper type parameters

        // Add each person's game like this:
        // TriviaQuiz personsGame = new PersonsTriviaQuiz();
        // quizzes.put("person", personsTriviaQuiz); // Add each persons quiz like this
        TriviaQuiz seansGame = new SeansTriviaQuiz();
        quizzes.put("Sean", seansGame); // Add each person's quiz like this

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type \"quit\" to quit playing quizzes.");
            while(true) {
                System.out.println("Whose quiz do you want to play? " + quizzes.keySet());
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("quit")){
                    scanner.close();
                    System.exit(0);
                }
                TriviaQuiz chosenQuiz = quizzes.get(choice);
                if (chosenQuiz != null) {
                    while (chosenQuiz.hasNextQuestion()) {
                        TriviaQuestion thisQuestion = chosenQuiz.getNextQuestion();
                        thisQuestion.askQuestion();
                        String answer = scanner.nextLine();
                        if (thisQuestion.isRight(answer)){
                            chosenQuiz.addPoints(1);
                        }
                    }
                    System.out.println("In " + choice + "'s quiz game, you recieved " + chosenQuiz.getTotalScore() + " points!");
                    System.out.println("Play another quiz?");
                }
            }
        }
    }
}

// TODO implement a FreeFormTriviaQuestion class

// TODO each member of your team should add an implementation of src.TriviaQuiz
// Try NOT to consult each other when making your implementation of src.TriviaQuiz
// (the point is each src.TriviaQuiz implementation may work differently under the hood but the code above interacts with them all in the same way)
// Example: AbdellaTriviaQuiz, ThomasTriviaQuiz
