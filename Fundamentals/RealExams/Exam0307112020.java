package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam0307112020 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();
        String typeOfPriceRatings = scanner.nextLine();

        switch (typeOfItems) {
            case "cheap":
                int leftSum = 0;
                int rightSum = 0;

                if (typeOfPriceRatings.equals("positive")) {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) > 0 && priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) > 0 && priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }
                    }

                } else if (typeOfPriceRatings.equals("negative")) {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) < 0 && priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) < 0 && priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }
                    }

                } else {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) < priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }
                    }

                }
                if (leftSum >= rightSum) {
                    System.out.printf("Left - %d", leftSum);
                } else {
                    System.out.printf("Right - %d", rightSum);
                }

                break;
            case "expensive":
                leftSum = 0;
                rightSum = 0;

                if (typeOfPriceRatings.equals("positive")) {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) > 0 && priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) > 0 && priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }

                    }

                } else if (typeOfPriceRatings.equals("negative")) {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) < 0 && priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) < 0 && priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }

                    }

                } else {

                    for (int i = 0; i < entryPoint; i++) {

                        if (priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            leftSum += priceRatings.get(i);
                        }

                    }
                    for (int i = priceRatings.size() - 1; i > entryPoint; i--) {

                        if (priceRatings.get(i) >= priceRatings.get(entryPoint)) {
                            rightSum += priceRatings.get(i);
                        }

                    }

                }


                if (leftSum >= rightSum) {
                    System.out.printf("Left - %d", leftSum);
                } else {
                    System.out.printf("Right - %d", rightSum);
                }

                break;
        }

    }
}
