package org.example.Lista1;
import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Converting hours to seconds!!!! (̶◉͛‿◉̶)");

        System.out.println("Type the number of hours: ");
        int hours = scanner.nextInt();
        int hourToSec = hours * 3600;

        System.out.println("Type the number of minutes: ");
        int minutes = scanner.nextInt();
        int minToSec = minutes * 60;

        System.out.println("Type the number of seconds: ");
        int seconds = scanner.nextInt();

        System.out.println("Total in seconds: " + (hourToSec + minToSec + seconds));


    }
}
