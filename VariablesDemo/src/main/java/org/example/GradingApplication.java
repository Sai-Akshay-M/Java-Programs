package org.example;

public class GradingApplication {

    public static void main(String[] args) {

        int maths = 90;
        int physics = 94;
        int chemistry = 75;

        float average = (maths + physics + chemistry) / 3;
        {
            if (average <= 59) {
                System.out.println("Obtained Grade is 'c'");
            } else if (average <= 69) {
                System.out.println("Obtained grade is 'B'");
            } else {
                System.out.println("Obtained grade is 'A'");
            }
        }
        System.out.println("Average in three subjects is " + average);
        {

            if (maths <= 35) {
                System.out.println("Failed in the maths subject");
            } else {
                System.out.println("Passed in the  maths subject");
            }
            if (physics <= 35) {
                System.out.println("Failed in the Physics subject");
            } else {
                System.out.println("Passed in the physics subject");
            }
            if (chemistry <= 35) {
                System.out.println("Failed in the Chemistry subject");
            } else {
                System.out.println("Passed in the chemistry subject");
            }
        }

    }
}