public class FreeFormQuestion implements TriviaQuestion {

    private String prompt;
    private String answer;

    

    public FreeFormQuestion(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    @Override
    public void askQuestion() {
        System.out.println(prompt);
        
    }

    @Override
    public boolean isRight(String userAnswer) {
       return userAnswer.equals(answer);
    }
    
}
