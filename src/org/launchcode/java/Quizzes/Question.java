package org.launchcode.java.Quizzes;

import java.util.Arrays;
import java.util.Set;

public abstract class Question {
    private String questionType;
    private String question;
    private int questionNumber;

    public Question(String aQuestionType, String aQuestion) {
        this.questionType = aQuestionType;
        this.question = aQuestion;
        this.questionNumber = questionNumberer.setQuestionNum();
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getQuestion() {
        return question;
    }

    public int getQuestionNum() {
        return questionNumber;
    }

    public void setQuestion(String aQuestion) {
        question = aQuestion;
    }
}
