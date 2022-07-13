public class LegacyTriviaQuizAdaptor implements TriviaQuiz {

    private LegacyTriviaGame legacyTriviaGame;

    public LegacyTriviaQuizAdaptor(LegacyTriviaGame legacyTriviaGame) {
        // We need to adapt this legacyTriviaGame to the TriviaQuiz interface
        this.legacyTriviaGame = legacyTriviaGame;
    }

    @Override
    public boolean hasNextQuestion() {

        return false;
    }

    @Override
    public TriviaQuestion getNextQuestion() {

        return null;
    }

    @Override
    public void addPoints(int points) {
        
    }

    @Override
    public int getTotalScore() {

        return 0;
    }
    
}
