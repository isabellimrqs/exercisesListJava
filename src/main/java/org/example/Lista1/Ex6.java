package org.example.Lista1;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Today we're programming the weighted student average: ");

        System.out.println("Please, type the first grade: ");
        double grade1 = scanner.nextDouble();

        System.out.println("Please, type the second grade: ");
        double grade2 = scanner.nextDouble();

        double firstGradeWeight = grade1 * 0.40;
        double secondGradeWeight = grade2 * 0.60;

        double averageWeight = ((grade1 + firstGradeWeight + grade2 + secondGradeWeight) / (firstGradeWeight + secondGradeWeight));
        System.out.println("The weighted student average is:" + averageWeight);
    }
}
