package Unit5review.quiz;

public class Quiz {
    /*
    create a class Quiz

  instance variables:
   - topic (String)
   - total number of questions (int)
   - total points (double)

  constructor:
   - initialize all variables

  methods:
   - toString: print all the quiz information
   - takeQuiz(): print: Taking the $topic quiz
     */
    String topic;
    int totalNumOfQuestions;
    double totalPoints;

    public Quiz(String topic, int totalNumOfQuestions, double totalPoints) {
        this.topic = topic;
        this.totalNumOfQuestions = totalNumOfQuestions;
        this.totalPoints = totalPoints;
    }
    public void takeQuiz(){
        System.out.println("Taking the "+topic+" quiz");
    }


    public String toString(Quiz quiz) {
        return quiz.toString();
    }
}
