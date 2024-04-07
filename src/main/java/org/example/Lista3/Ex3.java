package org.example.Lista3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rating;
        int countGreat = 0, countGood = 0, countBad = 0;
        int totalRating = 0;

        System.out.println("Hey there to my FRIENDS lovers <3");
        System.out.println("Today we're going to make a rating of our Friends Reunion (>‿◠)✌ ");

        while (true) {
            System.out.println("So, give us your opinion!! \n Please type: \n 1 - Great ⭐⭐⭐ \n 2 - Good ⭐⭐ \n 3 - Bad ⭐");
            rating = scanner.nextInt();

            totalRating++;

            switch (rating) {
                case 1:
                    countGreat++;
                    break;
                case 2:
                    countGood++;
                    break;
                case 3:
                    countBad++;
                    break;
                default:
                    System.out.println("Invalid input! Please enter 1, 2, or 3.");
                    totalRating--;
                    break;
            }

            System.out.println("Do you want to make another evaluation? (Y/N):  ");
            String again = scanner.next().toUpperCase();
            if (again.equals("N")) {
                break;
            }
        }

        double percentGreat = (double) countGreat / totalRating * 100;
        double percentGood = (double) countGood / totalRating * 100;
        double percentBad = (double) countBad / totalRating * 100;

        System.out.println("a. Number of 'Great' responses: " + countGreat + " (" + percentGreat + "% of total)");
        System.out.println("b. Number of 'Good' responses: " + countGood + " (" + percentGood + "% of total)");
        System.out.println("c. Number of 'Bad' responses: " + countBad + " (" + percentBad + "% of total)");
        System.out.println("d. Total number of responses: " + totalRating);

        double averageRating = (countGreat * 1 + countGood * 2 + countBad * 3) / (double) totalRating;
        System.out.println("e. Average rating of the movie: " + averageRating);
    }
}
