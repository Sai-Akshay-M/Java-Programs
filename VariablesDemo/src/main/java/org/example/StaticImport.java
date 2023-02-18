package org.example;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class StaticImport {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number" );
        double num = scanner.nextDouble();
        System.out.println(sqrt(num));
    }


}
