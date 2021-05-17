package com.company;

public abstract class Question {

    public String question;
    public int pointValue;


    public Question(String question, Integer pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public void displayQuestion(){
        System.out.println(question);
    }

    public abstract void calculateAnswer();

    public void setPointValue(int x){
       this.pointValue = x;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public abstract void displayAnswers();

    public abstract int getAnwsers();

    public abstract int getAnwser();

    public abstract int getAnswers();
}
