package org.example.Lista1;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey! Welcome to my own calculating system! \uD83D\uDC4D( ͡❛ ͜ʖ ͡❛\uD83D\uDC4D)");

        System.out.println("Please, type the first number: ");
        float n1 = scanner.nextFloat();

        System.out.println("Please, type the second number: ");
        float n2 = scanner.nextFloat();

        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Subtraction: " + (n1 - n2));
        System.out.println("Multiplication: " + (n1 * n2));

        if (n2 != 0) {
            System.out.println("Divison: " + (n1/n2));
        } else{
            System.out.println("The division cant be made.");
        }

        System.out.println("Potentiation: " + Math.pow(n1, n2));
        System.out.println("Rest of divison: " + (n1 % n2));














    }
}
