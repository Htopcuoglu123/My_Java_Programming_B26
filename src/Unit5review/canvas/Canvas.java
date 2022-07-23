package Unit5review.canvas;

import Unit5review.quiz.Quiz;

import java.util.ArrayList;

public class Canvas {
    /*
    create a class Canvas

  instance variables:
   - topic (String)
   - quizzes (ArrayList of Quiz objects)
   - modules (ArrayList of Module objects)

  constructor:
   - initialize topic
    -> create empty ArrayList objects for quizzes and modules
   - overload to accept the ArrayList of Quizzes and ArrayList of Module
    + chain the constructors
     */
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

public Canvas(String topic){
    this.topic = topic;
    quizzes=new ArrayList<>();
    modules=new ArrayList<>();
}
public Canvas(String topic,ArrayList<Quiz>quizzes,ArrayList<Module>modules){
    this(topic);
    this.quizzes.addAll(quizzes);
    this.modules.addAll(modules);
}

    @Override
    public String toString() {
        return "Canvas{" +
                "topic='" + topic + '\'' +
                ", quizzes=" + quizzes +
                ", modules=" + modules +
                '}';
    }
}

