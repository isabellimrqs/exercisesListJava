package org.example.Lista1;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play a surprise game! （っ＾▿＾）");

        System.out.println("Please, type a number: ");
        int n1 = scanner.nextInt();

        System.out.println("The number is: " + n1 );
        System.out.println("The number after that is: " + (n1 + 1));
        System.out.println("The number before that is: " + (n1 - 1));


    }
}
