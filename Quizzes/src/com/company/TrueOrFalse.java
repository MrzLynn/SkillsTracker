package com.company;

import java.util.Scanner;

public class TrueOrFalse extends Question {
    private boolean correctAnswer;

    public TrueOrFalse(String question, Integer pointValue, boolean correctAnswer) {
        super(question, pointValue);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void calculateAnswer() {

    }

    @Override
    public void displayAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getAnwsers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for True or 'f' for False");
        String userAnswer = answer.nextLine();
        if (userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public int getAnwser() {
        return 0;
    }

    @Override
    public int getAnswers() {
        return 0;
    }


    public boolean isCorrectAnswer(boolean possibleAnswer){
        if(possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }
}
