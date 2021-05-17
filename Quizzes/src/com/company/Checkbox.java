package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{
    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;

    public Checkbox(String text, Integer pointValue, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(text, pointValue);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
        setPointValue(this.correctAnswers.size());
    }

    public int checkAnswer(ArrayList<Integer> check) {
        int answerCorrect = 0;
        for (int i = 0; i < check.size(); i++){
            if (correctAnswers.contains(check.get(i))){
                answerCorrect++;
            }
        }
        return answerCorrect;
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
    public int getAnswers(){
        ArrayList<Integer> userAnswers = new ArrayList<>();
        System.out.println("For this question, there are multiple correct answers. To begin answering the question. enter 'y'.");
        Scanner userContinue = new Scanner(System.in);
        String goingToContinue = userContinue.nextLine();
        while (goingToContinue.indexOf('y') >= 0 && userAnswers.size() <= possibleAnswers.size()) {
            System.out.println("What will your answer be? Enter selection of then option you believe is correct. For example, to select the first option, enter 1");
            Scanner userAnswer = new Scanner(System.in);
            String answer = userAnswer.nextLine();
            int option = Integer.parseInt(answer);
            userAnswers.add(option);

            System.out.println("For this question there are multiple answers. To continue answering the question, enter 'y'.");
            goingToContinue = userContinue.nextLine();
        }


        return checkAnswer(userAnswers);
    }
    }


