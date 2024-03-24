package org.example.Lista1;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currentSalary = 1500;
        double comissionPerCar =  350;
        double percentTotalSales = 0.00001;

        System.out.println("Please enter the name of the employee: ");
        String salesPersonName = scanner.nextLine();

        System.out.println("Current month: ");
        String currentMonth = scanner.nextLine();

        System.out.println("Number of cars sold by " + salesPersonName + ":");
        double numberOfCarSold = scanner.nextDouble();

        System.out.println("Total value of sales in " + currentMonth + ":" );
        double totalSales = scanner.nextDouble();

        double totalSalary = (comissionPerCar * numberOfCarSold) + (totalSales * percentTotalSales) + currentSalary;
        System.out.println("The salary of " + salesPersonName + " in " + currentMonth + " will be: " + totalSalary);




    }
}
