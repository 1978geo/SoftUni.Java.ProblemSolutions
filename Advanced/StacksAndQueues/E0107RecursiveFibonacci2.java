package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.Scanner;

public class E0107RecursiveFibonacci2 {

    static int[] fibMemo;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

//
        long[] fibSeries = fibSum(num);
        long sum = 0;
        for (int i = 0; i < fibSeries.length; i++) {
            sum += fibSeries[i];
        }
        System.out.println(sum);

//
//            System.out.println("By Using Recursion");
//            Long startTimeRecursion = System.nanoTime();
//            // uses recursion
//            int fibSeriesRec[] = fibByRec(num);
//            int recSum = 0;
//            for (int i = 0; i < fibSeriesRec.length; i++) {
//                recSum+=fibSeriesRec[i];
//            }
//
//            System.out.println(recSum);
//            Long stopTimeRecursion = System.nanoTime();
//            System.out.println("");
//            System.out.println("Recursion Time:" + (stopTimeRecursion - startTimeRecursion));


//            System.out.println("By Using Memoization Technique");
//            Long startTimeMemo = System.nanoTime();
//            // uses memoization
//            fibMemo = new int[num];
//            fibByRecMemo(num - 1);
//            int finalSum = 0;
//            for (int i = 0; i < fibMemo.length; i++) {
//                finalSum += fibMemo[i];
////                System.out.print(" " + fibMemo[i] + " ");
//            }
//
//            System.out.println(finalSum + 1);
//            Long stopTimeMemo = System.nanoTime();
//            System.out.println("");
//            System.out.println("Memoization Time:" + (stopTimeMemo - startTimeMemo));

    }

//        public static int fibByRecMemo(int num) {
//
//            if (num == 0) {
//                fibMemo[0] = 1;
//                return 1;
//            }
//
//            if (num == 1 || num == 2) {
//                fibMemo[num] = 1;
//                return 1;
//            }
//
//            if (fibMemo[num] == 0) {
//                fibMemo[num] = fibByRecMemo(num - 1) + fibByRecMemo(num - 2);
//                return fibMemo[num];
//            } else {
//                return fibMemo[num];
//            }
//
//        }
//
//        public static int[] fibByRec(int num) {
//            int fib[] = new int[num];
//
//            for (int i = 0; i < num; i++) {
//                fib[i] = fibRec(i);
//            }
//
//            return fib;
//        }
//
//        public static int fibRec(int num) {
//            if (num == 0) {
//                return 1;
//            } else if (num == 1 || num == 2) {
//                return 1;
//            } else {
//                return fibRec(num - 1) + fibRec(num - 2);
//            }
//        }

    public static long[] fibSum (long num) {
        long[] fibSum = new long[Math.toIntExact(num)];
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                fibSum[i] = 1;
                continue;
            }

            if (i == 1 || i == 2) {
                fibSum[i] = 1;
                continue;
            }

            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];

        }
        return fibSum;
    }
}

