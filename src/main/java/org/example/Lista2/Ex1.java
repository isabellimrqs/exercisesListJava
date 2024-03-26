package org.example.Lista2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a age: ");
        int age = scanner.nextInt();

        if (age >= 0 & age <= 14){
            System.out.println("You're a kiddo ☜(ˆ▿ˆc)");
        } else if  (age >= 15 & age <=17) {
            System.out.println("You're a teen (>‿◠)✌");
        } else if (age >= 18 & age <= 30) {
            System.out.println("You're a young, cool, and responsible adult \uD83D\uDCAA ( ͡❛ ͜ʖ ͡❛) \uD83D\uDC4A");
        } else if (age >= 31) {
            System.out.println("You're just an adult... sorry (ㆆ_ㆆ)");
        }


    }
}
