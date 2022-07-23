package Unit5review.canvas;

import Unit5review.quiz.File;
import Unit5review.quiz.Quiz;

public class UsingCanvas {
    /*
    Create a class UsingCanvas

  create an object of the Canvas and verify all the fields and methods can be
accessed and used

     */
    public static void main(String[] args) {
        Canvas canvas=new Canvas("Soft Skills");
        System.out.println(canvas);
        System.out.println(canvas.topic);
        System.out.println(canvas.quizzes);

        System.out.println();

        Quiz quiz=new Quiz("Agile",20,100);
        System.out.println(quiz);
        quiz.takeQuiz();

        System.out.println();

        File file=new File("Java",3.0);
        File file2=new File("Selenium",4.00);

        System.out.println();


    }

}
