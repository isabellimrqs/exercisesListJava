package org.example.Lista3;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Enter an increment:");
        int increment = scanner.nextInt();

        System.out.println("Here is the sequence with the increment:");

        for (int i = 0; i <= number; i += increment) {
            System.out.print(i);
            if (i != number) {
                System.out.print(", ");
            }
        }
    }
}
