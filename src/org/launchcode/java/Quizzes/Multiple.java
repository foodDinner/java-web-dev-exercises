package org.launchcode.java.Quizzes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Multiple extends Question {

    private HashMap <String, String> multiAnswer = new HashMap<>();

    public Multiple(String aQuestionType, String aQuestion) {
        super(aQuestionType, aQuestion);
    }

    public void addMultiAnswer (String mcLetter, String mcQuestion) {
        multiAnswer.put(mcLetter, mcQuestion);
    }

    public Set getKeys() {
        return multiAnswer.keySet();
    }

    public Collection getAnswers() {
        return multiAnswer.values();
    }

    public boolean isCorrect (String answer) {
        return multiAnswer.containsKey(answer);
    }
}
