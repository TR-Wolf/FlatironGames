package src;

// src.MultipleChoiceTriviaQuestion class
class MultipleChoiceTriviaQuestion implements TriviaQuestion {
    private String question = "";
    private String[] answers;
    private String correctAnswer;
    public MultipleChoiceTriviaQuestion(String question, String[] answers, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
    @Override
    public void askQuestion() {
        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            // String.format("%s. %s", i, answers[i])
            System.out.println(i + " " + answers[i]);
        }
    }
    @Override
    public boolean isRight(String userAnswer) {
        return correctAnswer.equalsIgnoreCase(userAnswer);
    }
}