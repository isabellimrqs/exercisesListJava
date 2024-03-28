package org.example.Lista3;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String tabuada = "";

        for (int count = 1; count <= 10; count++) {
            System.out.println(tabuada += num + " x " + count + " = " + (num * count) + "\n");

        }

    }
}
