package org.launchcode.java.Quizzes;

import java.util.HashMap;

public class Multiple extends Question {

    private HashMap <String, String> multiAnswer1;
    private HashMap <String, String> multiAnswer2;
    private HashMap <String, String> multiAnswer3;

    public Multiple(String aQuestionType, String aQuestion, HashMap <String, String> aMultiAnswer1, HashMap<String, String> aMultiAnswer2, HashMap <String, String> aMultiAnswer3, String anAnswer) {
        super(aQuestionType, aQuestion, anAnswer);
        this.multiAnswer1 = multiAnswer1.put(aMultiAnswer1);
        this.multiAnswer2 = aMultiAnswer2;
        this.multiAnswer3 = aMultiAnswer3;
    }
}
