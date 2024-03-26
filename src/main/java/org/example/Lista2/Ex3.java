package org.example.Lista2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many goals did team A score?");
        int goalsATeam = scanner.nextInt();

        System.out.println("How many goals did team B score?");
        int goalsBTeam = scanner.nextInt();

        if (goalsATeam > goalsBTeam){
            System.out.println("Team A won! \uD83C\uDF89");
        } else if (goalsATeam < goalsBTeam) {
            System.out.println("Team A won! \uD83C\uDF89");
        } else {
            System.out.println("It's a tie! ( ˘︹˘ ) ");
        }


    }
}
