package org.example.Lista2;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the current amount of the product in the stock? ");
        int currentAmount = scanner.nextInt();

        System.out.println("What's the highest amount of this product that i can have in my stock? ");
        int highestAmount = scanner.nextInt();

        System.out.println("What's the lowest amount of this product that i can have in my stock? ");
        int lowestAmount = scanner.nextInt();

        int average = ((highestAmount + lowestAmount) / 2);

        if (currentAmount >= average){
            System.out.println("Do not make the purchase");
        } else {
            System.out.println("Make the purchase");
        }








    }
}
