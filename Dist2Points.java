package main.A3.Intermediate;

import java.util.Scanner;

public class Dist2Points {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y1 = scn.nextInt();
        int y2 = scn.nextInt();
        float ans = (float) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Distance bw 2 points : "  + ans);
    }
}
