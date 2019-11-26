package org.launchcode.java.Quizzes;

public class questionNumberer {
    static public int questionNum = 0;

    static int setQuestionNum() {
        return questionNum++;
    }
}
