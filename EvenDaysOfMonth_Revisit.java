package main.A3.Intermediate;

import java.util.Scanner;

public class EvenDaysOfMonth_Revisit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0;
        if (str == "January" || str == "March" || str == "May" || str == "July"
                || str == "August" || str == "October" || str == "December")
        {
            for (int i = 1; i <= 31; i++) {
                if (i % 2 == 1)
                    count++;
            }
        }
        else if(str == "April" || str == "June" || str == "September" || str == "November")
        {
            for (int i = 1; i <= 30; i++) {
                if (i % 2 == 1)
                    count++;
            }
        }
        else
        {
            for (int i = 1; i <= 28; i++) {
                if (i % 2 == 1)
                    count++;
            }
        }

        System.out.println("Number of Even Days : " + count);
    }
}
