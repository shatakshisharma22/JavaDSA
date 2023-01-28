package main.A3.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int sum = 0;
        for (int i = 1; i <= (num / 2); i++)
        {
            if (num % i == 0)
            {
                sum += i;
            }
        }

        if (sum == num)
            System.out.println(sum + " is a perfect number");
    }
}
