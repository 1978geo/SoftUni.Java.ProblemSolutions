package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L0107MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < items.size(); i++) {
            queue.offer(items.get(i));
        }

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            if (IsPrime(cycle))
            {
                System.out.println("Prime " + queue.peek());
            }
            else
            {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }

        String lastName = queue.poll();
        System.out.println("Last is " + lastName);

    }
    private static boolean IsPrime(int n)
    {
        boolean primeCheck = true;
        if (n == 0 || n == 1)
        {
            primeCheck = false;
            return primeCheck;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    primeCheck = false;
                }
            }
            return primeCheck;
        }
    }
}


