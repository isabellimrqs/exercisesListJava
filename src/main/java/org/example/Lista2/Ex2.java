package org.example.Lista2;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! You're in the... ");
        System.out.println(
                "███████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n" +
                "█░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░█░░░░░░░░░░░░░░████░░░░░░██████████░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░███░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
                "█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░░░░░░░░░░░░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                "█░░░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█░░░░░░█░░▄▀░░░░░░░░░░████░░▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█░░░░░░▄▀░░░░░░█\n" +
                "███░░▄▀░░███░░▄▀░░█████████░░▄▀░░██░░▄▀░░█████░░█░░▄▀░░████████████░░▄▀░░░░░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░████░░▄▀░░███░░▄▀░░██░░▄▀░░███░░▄▀░░█████████████░░▄▀░░█████\n" +
                "███░░▄▀░░███░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░████████░░▄▀░░░░░░░░░░████░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░░░░░█████░░▄▀░░█████\n" +
                "███░░▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░████████░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░██░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░█████\n" +
                "███░░▄▀░░███░░░░░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░████████░░░░░░░░░░▄▀░░████░░▄▀░░██░░░░░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░░░███░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░░░░░█████░░▄▀░░█████\n" +
                "███░░▄▀░░███████████░░▄▀░░█░░▄▀░░██░░▄▀░░████████████████░░▄▀░░████░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█████░░▄▀░░██░░▄▀░░███░░▄▀░░█████████████░░▄▀░░█████\n" +
                "█░░░░▄▀░░░░█░░░░░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░████████░░░░░░░░░░▄▀░░████░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░░░░░█░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█████░░▄▀░░█████\n" +
                "█░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░████████░░▄▀▄▀▄▀▄▀▄▀░░████░░▄▀░░██████████░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░█████\n" +
                "█░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░████████░░░░░░░░░░░░░░████░░░░░░██████████░░░░░░█░░░░░░██░░░░░░█░░░░░░██░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█████░░░░░░█████\n" +
                "███████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");

        System.out.println("What is the product that you want to buy today?");
        String productName =  scanner.nextLine();

        System.out.println("What is the value of the "+ productName + "? ");
        double productValue = scanner.nextDouble();

        System.out.println("What is the amount of " + productName + " that you want to buy? ");
        double productAmount = scanner.nextDouble();

        double discountPercent = 10.0 / 100.0;
        double productWithDiscount = (productValue * productAmount) - ((productValue * productAmount) * discountPercent);

        if (productAmount >=1 & productAmount <= 12){
            System.out.println("You have to pay R$" + productValue * productAmount);
        } else {
            System.out.println("Congratulations! You earned an 10% discount, instead of paying R$" + (productValue * productAmount) + " you're goint to " +
                    "pay just R$" + productWithDiscount);
        }














    }

}
