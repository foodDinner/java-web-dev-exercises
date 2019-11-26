package org.launchcode.java.Quizzes;

public class QuizRunner {
    public static void main(String[] args) {
        Multiple questionOne = new Multiple("Multi", "Name the closet star to the planet Earth.");

        System.out.println(questionOne.getQuestionNum());
        questionOne.addMultiAnswer("A","Sun");
        questionOne.addMultiAnswer("B","Moon");

        System.out.println(questionOne.getKeys());
        System.out.println(questionOne.getAnswers());

        Multiple questionTwo = new Multiple("Multi", "Name the closet star to the planet Earth.");
        System.out.println(questionTwo.getQuestionNum());

        String damnAnswer = "A";

        if (questionOne.isCorrect(damnAnswer)) {
            System.out.print("LOL it worked");
        } else {System.out.println("GTFO");}
    }
}
