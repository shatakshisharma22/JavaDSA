package main.A3.Intermediate;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char str = scn.next().charAt(0);
        if(str == 'a' || str == 'A' || str == 'e' || str == 'E' || str == 'i' || str == 'I' || str == 'o' || str == 'O' || str == 'u' || str == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonent");

    }
}
