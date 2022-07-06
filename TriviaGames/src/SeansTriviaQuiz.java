public class SeansTriviaQuiz implements TriviaQuiz{

    //Constructor to initialize all the questions, point tracker and question tracker
    public SeansTriviaQuiz () {
        //add MC Questions to my list of questions
//        TriviaQuestion questionOne = new MultipleChoiceTriviaQuestion("How many continents are there in the world?", {"5", "6", "7", "8"}, 3);
//        TriviaQuestion questionTwo = new MultipleChoiceTriviaQuestion("What measurement scale is used to determine wind speed?", {"Beaufort scale", "Richter scale", "Synoptic scale", "Gusting scale"}, 1);
//        TriviaQuestion questionThree = new MultipleChoiceTriviaQuestion("The human body is made up of approximately how much water?", {"40%", "50%", "60%", "70%"}, 3);
//        TriviaQuestion questionFour = new MultipleChoiceTriviaQuestion("What is the world’s fastest species of bird?", {"Golden eagle", "Peregrine falcon", "Frigatebird", "Penguin"}, 2);
//        TriviaQuestion questionFive = new MultipleChoiceTriviaQuestion("Which artist famously cut off his own ear?", {"Vincent Van Gogh", "Claude Monet", "Salvador Dali", "Pablo Picasso"}, 1)
//        TriviaQuestion questionSix = new MultipleChoiceTriviaQuestion("What was the first country to use tanks in combat during World War I?", {"France", "Japan", "Britain", "Germany"}, 3)
//        TriviaQuestion questionSeven = new MultipleChoiceTriviaQuestion("Which of the following animals can run the fastest?", {"Cheetah", "Leopard", "Tiger", "Lion"}, 1)
//        TriviaQuestion questionEight = new MultipleChoiceTriviaQuestion("The two biggest exporters of beers in Europe are Germany and …", {"Spain", "France", "Italy", "Belgium"}, 4)
//        TriviaQuestion questionNine = new MultipleChoiceTriviaQuestion("What does the term \“SOS\" commonly stand for?", {"Save Our Sheep", "Save Our Ship", "Save Our Seal", "Save Our Souls"}, 4)
//        TriviaQuestion questionTen = new MultipleChoiceTriviaQuestion("We often use sodium bicarbonate in the kitchen. What is its other name?", {"Vinegar", "Sugar", "Salt", "Baking soda"}, 4)
//        TriviaQuestion questionEleven = new MultipleChoiceTriviaQuestion("Which was the first film by Disney to be produced in colour?", {"Toy Story", " Sleeping Beauty", "Snow White and the Seven Dwarfs", "Cinderella"}, 3)
//        TriviaQuestion questionTwelve = new MultipleChoiceTriviaQuestion("How many time zones are there in total in the world?", {"8", "16", "24", "32"}, 3)
//        TriviaQuestion questionThirteen = new MultipleChoiceTriviaQuestion("What is the rarest type of blood in the human body?", {"AB negative", "O positive", "B negative", "A positive"}, 1)
//        TriviaQuestion questionFourteen = new MultipleChoiceTriviaQuestion("The fear of insects is known as what?", {"Arachnophobia", "Ailurophobia", "Entomophobia", "Clastophobia"}, 3)
//        TriviaQuestion questionFifteen = new MultipleChoiceTriviaQuestion("Which state is the smallest state in the US?", {"Delaware", "Washington DC", "Rhode Island", "Connecticut"}, 3)
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
