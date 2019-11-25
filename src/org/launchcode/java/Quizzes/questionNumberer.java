package org.launchcode.java.Quizzes;

public class questionNumberer {
    static int questionNum = 0;

    static int setQuestionNum() {
        return questionNum++;
    }
}
