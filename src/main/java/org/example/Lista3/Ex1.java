package org.example.Lista3;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countEven = 0, countUneven = 0, countNegative = 0, countPositive = 0;

        System.out.println("Let's make a quiz game! :D");


        for (int i = 1; i < 7; i++){
            System.out.printf("Type the %dº number: ", i );
            int numbers = scanner.nextInt();

            if (numbers % 2 == 0){
                countEven++;
            }

            if (numbers % 2 != 0){
                countUneven++;
            }

            if (numbers >= 0){
                countPositive++;
            }
            if (numbers < 0){
                countNegative++;
            }


        }

        System.out.println("Would you like to know: \n 1 - How many are even numbers? \n 2 - How many are uneven numbers? \n 3 - Hom many are positive numbers? \n 4 - How many are negative numbers? \n 5 - Leave the program");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 -> System.out.println(countEven + " of the numbers are even :0");
            case 2 -> System.out.println(countUneven + " of the numbers are uneven :0");
            case 3 -> System.out.println(countPositive + " of the numbers are positive :0");
            case 4 -> System.out.println(countNegative + " of the numbers are negative :0");
            case 5 -> {
                System.out.println("Leaving the program...");
                System.exit(5);
            }

        }














    }

}


