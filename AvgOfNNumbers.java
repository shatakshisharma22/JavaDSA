package main.A3.Intermediate;

import java.util.Scanner;

public class AvgOfNNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nums = 0;
        for (int i = 0; i < n; i++) {
            nums = nums + scn.nextInt();
        }
        System.out.println(nums / n);
    }
}
