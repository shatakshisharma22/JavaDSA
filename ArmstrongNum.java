package main.A3.Intermediate;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arm = 0;
        int num = n;
        while (num > 0)
        {
            int rem = num % 10;
            arm = arm + (rem * rem * rem);
            num /= 10;
        }

        if (arm == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
