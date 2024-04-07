package org.example.Lista3;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String heaviestPersonName = "";
        double heaviestPersonWeight = Double.MIN_VALUE;
        String tallestPersonName = "";
        double tallestPersonHeight = Double.MIN_VALUE;

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + "º person, please type your name: ");
            String personName = scanner.next();

            System.out.println("Type your weight:");
            double personWeight = scanner.nextDouble();

            System.out.println("Type your height:");
            double personHeight = scanner.nextDouble();

            if (personWeight > heaviestPersonWeight) {
                heaviestPersonName = personName;
                heaviestPersonWeight = personWeight;
            }

            if (personHeight > tallestPersonHeight) {
                tallestPersonName = personName;
                tallestPersonHeight = personHeight;
            }
        }

        System.out.println("The heaviest person is " + heaviestPersonName + " with weight " + heaviestPersonWeight);
        System.out.println("The tallest person is " + tallestPersonName + " with height " + tallestPersonHeight);
    }
}
