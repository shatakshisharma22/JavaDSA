package main.A3.Intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
