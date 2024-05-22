package org.boj2563;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean[][] map;
    public static int max;
    public static int t;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        map = new boolean[101][101];
        t = sc.nextInt();
        max = 0;
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
//            System.out.println(x+" "+y);
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y+10; j++) {
                    if (!map[i][j]) max++;
                    map[i][j] = true;
                }
            }
            t--;

       }
        System.out.println(max);

    }
}
