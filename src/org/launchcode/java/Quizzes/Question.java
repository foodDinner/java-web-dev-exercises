package org.launchcode.java.Quizzes;

import java.util.Arrays;

public abstract class Question {
    private String questionType;
    private String question;
    private String answer;
    private int questionNumber;

    public Question(String aQuestionType, String aQuestion, String anAnswer) {
        this.questionType = aQuestionType;
        this.question = aQuestion;
        this.answer = anAnswer;
        this.questionNumber = questionNumberer.setQuestionNum();
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getQuestionNum() {
        return questionNumber;
    }

    public void setQuestion(String aQuestion) {
        question = aQuestion;
    }

    public void setAnswer(String theAnswer) {
        answer = theAnswer;
    }
}
