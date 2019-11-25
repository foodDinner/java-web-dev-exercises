package org.launchcode.java.Quizzes;

import java.util.HashMap;

public class Multiple extends Question {

    HashMap <String, String> multiAnswer1;
    HashMap <String, String> multiAnswer2;
    HashMap <String, String> multiAnswer3;

    public Multiple(String aQuestionType, String aQuestion, HashMap <String, String>(aMultiAnswer1A, aMultiAnswer1B), HashMap aMultiAnswer2, HashMap aMultiAnswer3, String anAnswer) {
        super(aQuestionType, aQuestion, anAnswer);
        this.multiAnswer1 = multiAnswer1.put(aMultiAnswer1A, aMultiAnswer1B);
        this.multiAnswer2 = aMultiAnswer2;
        this.multiAnswer3 = aMultiAnswer3;
    }
}
