package org.example.Lista2;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        double baseValue = 3000;

        double maceioWithLunch = baseValue * 2;
        double maceioNoLunchPercent = 0.85;
        double maceioNoLunchTotal = baseValue + (maceioNoLunchPercent * baseValue);

        double portoWithLunchPercent = 0.60;
        double portoNoLunchPercent = 0.45;
        double portoNoLunchTotal = baseValue + (portoNoLunchPercent * baseValue);
        double portoWithLunchTotal = baseValue + (portoWithLunchPercent * baseValue);

        System.out.println("What is best than vacation...? ");
        Thread.sleep(1000);
        System.out.println("Planning a vacation trip with ");
        Thread.sleep(500);
        System.out.println("Ｉｓａ＇ｓ");
        Thread.sleep(500);
        System.out.println("ｖａｃａｔｉｏｎ");
        Thread.sleep(500);
        System.out.println("ｄｒｅａｍ （っ＾▿＾）");

        System.out.println("Where do you want to spend your vacation? \n 1 - Maceió \n 2 - Porto de Galinhas");
        int placeOption = scanner.nextInt();

        switch (placeOption){
            case 1 -> {
                System.out.println("Great! You're going to Maceió! Do you want to include lunch and dinner in the package? (Y/N): ");
                String confirmation = scanner.next().toUpperCase();
                if (confirmation.equals("Y")){
                    System.out.println("You are going to pay R$" + maceioWithLunch);
                } else if (confirmation.equals("N")) {
                    System.out.println("You are going to pay R$" + maceioNoLunchTotal);
                } else {
                    System.out.println("Sorry, i don't understand, please answer 'Y' for YES and 'N' for NO. ");
                }
            } case 2 -> {
                System.out.println("Great! You're going to Porto de Galinhas! Do you want to include lunch and dinner in the package? (Y/N): ");
                String confirmation = scanner.next().toUpperCase();
                    if (confirmation.equals("Y")) {
                        System.out.println("You are going to pay R$" + portoWithLunchTotal);

                    } else if (confirmation.equals("N")) {
                        System.out.println("You are going to pay R$" + portoNoLunchTotal);
                    } else  {
                        System.out.println("Sorry, i don't understand, please answer 'Y' for YES and 'N' for NO. ");
                        scanner.next();
                    }

            } // case 2
        } // switch










    }
}
