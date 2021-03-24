package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());

        double totalTournamentProfit = 0;
        int countAllDaysWin = 0;
        int countAllDaysLost = 0;

        for (int i = 1; i <= tournamentDays; i++) {

            String typeGame = scanner.nextLine();

            double dailyProfit = 0;
            int dailyGamesWon = 0;
            int dailyGamesLost = 0;

            while (!typeGame.equals("Finish")) {
                String gameResult = scanner.nextLine();
                if (gameResult.equals("win")) {
                    dailyProfit = dailyProfit + 20;
                    dailyGamesWon++;
                } else {
                    dailyGamesLost++;
                }

                typeGame = scanner.nextLine();
            }

            if (dailyGamesWon > dailyGamesLost) {
                dailyProfit = dailyProfit * 1.10;
                countAllDaysWin++;
            } else {
                countAllDaysLost++;
            }
            totalTournamentProfit = totalTournamentProfit + dailyProfit;

        }
        if (countAllDaysWin > countAllDaysLost) {
            totalTournamentProfit = totalTournamentProfit * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalTournamentProfit);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalTournamentProfit);
        }
    }
}
