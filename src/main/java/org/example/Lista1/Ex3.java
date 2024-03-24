package org.example.Lista1;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's do some shopping!!! (✿◠‿◠)  ");

        System.out.println("Please inform your purchase price: ");
        double purchasePrice = scanner.nextFloat();

        double purchasePercent = purchasePrice * 0.20;
        double purchaseTax = purchasePrice * 0.30;
        double purchaseTotal = purchasePrice + purchasePercent + purchaseTax;

        System.out.println("The total price of the purchase is: " + purchaseTotal);
        System.out.println("Value of the agent: " + purchasePercent);
        System.out.println("Value of the taxes: " + purchaseTax);



    }
}
