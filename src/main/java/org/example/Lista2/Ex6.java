package org.example.Lista2;
import java.util.Scanner;
import java.util.Random;
public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int interval = 101;
        int randomNum = random.nextInt(interval);
        //System.out.println(randomNum);

        System.out.println("Type a number: ");
        int kick = scanner.nextInt();
        int userTry = 1;


        if (kick == randomNum) {
            System.out.println("Congratulations! You guessed it right!");
        } else {
            while (userTry <= 3) {
                System.out.println("Sorry, better luck next time... :(");
                System.out.println("Type a number: ");
                scanner.nextInt();
                userTry++;

                if (userTry == 3) {
                    System.out.println("It's over...");
                    break;
                }
            }
        }



    }
}
