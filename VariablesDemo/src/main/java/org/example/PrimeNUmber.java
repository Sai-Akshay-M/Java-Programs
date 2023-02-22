package org.example;

import java.util.Scanner;

class PrimeNUmber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number to check if it is prime or not : ");
            int number = sc.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
