package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("Garfield","Salem","Cheshire","Tom"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
        Checkbox newQuestions1 = new Checkbox("Who is the best cat in the world?",2,possAns1,correctAns1);
        myQuiz.addQuestion(newQuestions1);

        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Doc", "Tillie", "Gizmo", "Benji", "Nala"));
        MultipleChoice newQuestion2 = new MultipleChoice("Who won the Halloween Costume Contest",1,possAns2,3);
        myQuiz.addQuestion(newQuestion2);

        TrueOrFalse newQuestion3 = new TrueOrFalse("Are all dogs the best?",1,true);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();
        myQuiz.gradeQuiz();
    }
}
