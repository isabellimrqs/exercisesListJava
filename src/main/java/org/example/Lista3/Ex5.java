package org.example.Lista3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countBalance = 0;
        double balance;

        while (true) {
            System.out.println("Please, enter your balance: ");
            balance = scanner.nextDouble();

            System.out.println("Do you want to inform another balance? (Y/N): ");
            String again = scanner.next().toUpperCase();
            if (again.equals("N")) {
                break;
            }
            countBalance++;

        }

        double countBalancePercent = countBalance / 100;
        if (countBalancePercent >= 0.50 & balance > 0) {
            System.out.println("No risk!");
        } else {
            System.out.println("Risk to the bank! \uD83D\uDE28");
        }


    }
}
