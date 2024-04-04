package org.example.Lista3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int rating = 1;
        int countGreat = 0, countGood = 0, countBad = 0;
        int totalRating =  1 +  countGreat + countGood + countBad;
        int percentTotal = (countGreat / totalRating) * 100;

        System.out.println("Hey there to my FRIENDS lovers <3");
        Thread.sleep(1000);
        System.out.println("Today we're going to make a rating of our Friends Reunion (>‿◠)✌ ");

        while (true) {
            System.out.println("So, give us your opinion!! \n Please type: \n 1 - Great ⭐⭐⭐ \n 2 - Good ⭐⭐ \n 3 - Bad ⭐");
            rating = scanner.nextInt();

            System.out.println("Do you want to make another evaluation? (Y/N):  ");
            String again = scanner.next().toUpperCase();
            if (again.equals("N")) {
                break;
            }
            if (rating == 1) {
                countGreat++;
            }
            if (rating == 2) {
                countGood++;
            }
            if (rating == 3) {
                countBad++;
            }
        }


        System.out.println(countGreat);
        System.out.println(countGood);
        System.out.println(countBad);
        System.out.println(totalRating);








}
}
