package org.example;

import java.util.Scanner;

class LoopDemo {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int number = sc.nextInt();

            /*
             * for (int i = 1; i < number; i++) {
             * if (i % 10 == 0)
             * continue;
             * if (i > 100)
             * break;
             * System.out.println(i);
             * }
             */

            int i = 1;
            while (i <= number) {

                if (i % 10 == 0)
                    continue;
                if (i > 100)
                    break;
                System.out.println(i++);
            }
        }

    }
}
