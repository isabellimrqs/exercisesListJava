package org.example.Lista1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============== Hello! Welcome to BJP, the Bosch Job Platform! ===============");
        Thread.sleep(1000);
        System.out.println("Let's start your application. \uD83D\uDE00");

        System.out.println("Please, type your name: ");
        String name = scanner.nextLine();

        System.out.println("Now, type your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Your birth date (Format: DD/MM/YYYY)");
        String birthDate = scanner.next();

        System.out.println("Your salary expectation (R$): ");
        float salaryExpectation = scanner.nextFloat();

        System.out.println("What is your educational background? (Completed or graduating):  \n 1 - High School \n 2 - Technical Education \n 3 - University Education ");
        int escolarityLevel = scanner.nextInt();

        System.out.println("Please, tell us your intended position: \n 1 - Manager \n 2 - Supervisor \n 3 - Analyst \n 4 - Assistant \n 5 - Intern \n 6 - Apprentice");
        int intendedPosition = scanner.nextInt();

        System.out.println("Do you have CNH (B)? (Y/N)");
        String hasCNH = scanner.next().toUpperCase();

        System.out.println("Please see the data entered below \uD83D\uDC47  ");
        System.out.println("Full Name: " + name + " " + lastName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Salary Expectation: R$" + salaryExpectation);

        switch (escolarityLevel){
            case 1 -> System.out.println("Escolarity Level: High School ");
            case 2 -> System.out.println("Escolarity Level: Technical Education ");
            case 3 -> System.out.println("Escolarity Level: University Education ");
        }

        switch (intendedPosition){
            case 1 -> System.out.println("Intended Position: Manager ");
            case 2 -> System.out.println("Intended Position: Supervisor ");
            case 3 -> System.out.println("Intended Position: Analyst ");
            case 4 -> System.out.println("Intended Position: Assistant ");
            case 5 -> System.out.println("Intended Position: Intern ");
            case 6 -> System.out.println("Intended Position: Apprentice ");
        }

        System.out.println("Has CNH (B): " + hasCNH);

        //System.out.println("Do you confirm this data? (Y/N)");
        //String confirmData =  scanner.next().toUpperCase();

        System.out.println("\n =============== Thank you for applying to Bosch! \uD83D\uDE00 ===============");












    }
}
