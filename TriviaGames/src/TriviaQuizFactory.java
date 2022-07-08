import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TriviaQuizFactory {
    private Map<String, TriviaQuiz> quizzes;
    //Constructor to make our factory
    public TriviaQuizFactory() {
        quizzes = new HashMap<>();
        // Add each person's game like this:
        // TriviaQuiz personsGame = new PersonsTriviaQuiz();
        // quizzes.put("person", personsTriviaQuiz); // Add each persons quiz like this
        TriviaQuiz seansGame = new SeansTriviaQuiz();
        quizzes.put("Sean", seansGame); // Add each person's quiz like this
    }


    TriviaQuiz getQuiz(Scanner scanner) {
        try {
            System.out.println("Type \"quit\" to quit playing quizzes.");
            boolean gettingInput = true;
            //While we are getting input
            while (gettingInput) {
                System.out.println("Whose quiz do you want to play? " + quizzes.keySet());
                //Get a choice from the user
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("quit")){
                    return null;
                } else {
                    //If we have the chosen quiz, return it.
                    TriviaQuiz chosenQuiz = quizzes.get(choice);
                    if (chosenQuiz != null) {
                        return chosenQuiz;
                    } else {
                        System.out.println("Invalid input, try again!");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Received invalid input");
            scanner.next();
            System.out.println("try again?");
            return getQuiz(scanner);
        }
        //We should never get here.
        return null;
    }
}
