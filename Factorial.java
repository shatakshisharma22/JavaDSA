package main.A3.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = 1;

        for(int i = num; i > 0; i--)
        {
            ans = ans * i;
        }

        System.out.println(ans);
    }
}
