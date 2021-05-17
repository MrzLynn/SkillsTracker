package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(String question, Integer pointValue, ArrayList<String> possibleAnswers, int correctAnswer) {
        super(question, pointValue);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
        setPointValue(1);
    }


    @Override
    public void calculateAnswer() {

    }

    @Override
    public void displayAnswers() {
        for(int i = 0; i < possibleAnswers.size(); i++){
            System.out.println(possibleAnswers.get(i));
        }
    }

    @Override
    public int getAnwsers() {
        return 0;
    }

    @Override
    public int getAnwser() {
        return 0;
    }

    @Override
    public int getAnswers() {
        return 0;
    }

    public boolean isCorrectAnswer(int possibleAnswer)    {
        if(possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    public MultipleChoice(String question, Integer pointValue) {
        super(question, pointValue);
    }

    public int getAnswer() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter selection of then option you believe is correct. For example, to select the first option, enter 1");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if(isCorrectAnswer(result)){
            return 1;
        } else {
            return 0;
        }
    }
}
