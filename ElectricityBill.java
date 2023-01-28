package main.A3.Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int units = scn.nextInt();
        int bill = 0;

        if (units < 100)
            bill = units * 2;
        else if (units < 300)
            bill = 100 * 2 + (units - 100) * 4;
        else if (units > 300)
            bill = 100 * 2 + 200 * 4 + (units - 300) * 6;

        System.out.println("Total electricity bill : " + bill);
    }
}
