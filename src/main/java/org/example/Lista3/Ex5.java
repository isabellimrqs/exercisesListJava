package org.example.Lista3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        while (true) {
            System.out.println("Please, enter your balance (type 0 to exit): ");
            double balance = scanner.nextDouble();

            if (balance == 0) {
                break;
            }

            if (balance > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        int totalCustomers = positiveCount + negativeCount;
        double positivePercentage = (double) positiveCount / totalCustomers * 100;

        if (positivePercentage >= 50) {
            System.out.println("No risk!");
        } else {
            System.out.println("Risk to the bank! \uD83D\uDE28");
        }
    }
}
