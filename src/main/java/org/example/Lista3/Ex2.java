package org.example.Lista3;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        double countAge = 0, countHeight = 0, countWeight = 0;
        double peopleAge, peopleHeight, peopleWeight;

        for (int i = 1; i < 3; i++) {
            System.out.println(i + "º - Please, type your age: ");
            peopleAge = scanner.nextDouble();
            System.out.println("Type your height: ");
            peopleHeight = scanner.nextDouble();
            System.out.println("Type your weight: ");
            peopleWeight = scanner.nextDouble();

            if (peopleAge >= 50) {
                countAge++;
            }

            if (peopleHeight >= (1.60)) {
                countHeight++;
            }
            if (peopleWeight <= 80) {
                countWeight++;
            }
        }
        System.out.println("Getting data...");
        Thread.sleep(1000);
        System.out.println("Let's see what we got :D");
        Thread.sleep(1000);
        System.out.println("This is the amount of people above their 50's: " + countAge);
        System.out.println("This is the amount of people higher than 1.60m: " + countHeight);
        System.out.println("And this is the amount of people who weight less than 80kg: " + countWeight);


    }
}
