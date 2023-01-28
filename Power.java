package main.A3.Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int pow = 1;
        for (int i = 0; i < n; i++)
        {
            pow *= x;
        }
        System.out.println(pow);

        //or
        int pow2 = (int) Math.pow(x, n);
        System.out.println(pow2);
    }
}
