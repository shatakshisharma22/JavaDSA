package main.A3.Intermediate;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        //n!
        int factn = 1;
        int i = 1;
        while (i <= n)
        {
            factn *= i;
            i++;
        }

        //r!
        int factr = 1;
        int j = 1;
        while (j <= r)
        {
            factr *= j;
            j++;
        }

        //(n-r)!
        int factnr = 1;
        int k = 1;
        while (k <= (n - r))
        {
            factnr *= k;
            k++;
        }

        System.out.println("n! : " + factn);
        System.out.println("r! : " + factr);
        System.out.println("n - r : " + factnr);
//        Permutation
        System.out.println("nCr : " + (factn / (factr * factnr)));
//        Combination
        System.out.println("nPr : " + (factn / factnr));
    }
}
