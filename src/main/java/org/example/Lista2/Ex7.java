package org.example.Lista2;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there! Let's make a quiz game! (✿ ͡❛ ͜ʖ ͡❛) ");

        System.out.println("Choose your question: \n 1 - Who was the first president of Brazil? \n 2 - Who was the first person to go to the moon? ");
        int question = scanner.nextInt();

        switch (question){
            case 1 -> {System.out.println("Here is your choices: \n a) Pedro álvares Cabral \n b) Deodoro da Fonseca \n c) Getúlio Vargas");
                       String choice = scanner.next().toLowerCase();
                       if (choice.equals("b")){
                           System.out.println("You're correct!! You can withdraw your bonus at Shostners and Shostners :D");
                       } else {
                           System.out.println("Sorry... Better luck next time :(");
                       }
            } case 2 -> {System.out.println("Here is your choices: \n a) Juliana Verneck \n b) Neil Armstrong \n c) Iuri Gagarin");
                         String choice = scanner.next().toLowerCase();
                        if (choice.equals("b")){
                            System.out.println("You're correct!! You can withdraw your bonus at Shostners and Shostners :D");
                        } else {
                            System.out.println("Sorry... Better luck next time :(");
                        }
            }
        }





    }
}
