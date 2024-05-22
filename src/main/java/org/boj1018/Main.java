package org.boj1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    static int x1, x2, y1, y2, cx, cy, r;
    static int count, n, m,min;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        n = scanner.nextInt();
        m = scanner.nextInt();
        map = new char[n][m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
                map[i]= scanner.nextLine().toCharArray();
        }
        min=33;
        count=0;
        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
//                System.out.println(i+" "+j);
                check(j,i);
                if (count < min)min = count;
                count=0;
            }
        }
        System.out.println(min);
    }

    public static void check(int x, int y) {
//        System.out.println(x+" "+y);
//        System.out.println(map[y][x]);
        int ct1=0;
        for (int i = y; i < y+8; i+=2) {

            for (int j = x; j < x+8; j+=2) {
                if (map[i][j]!=map[y][x]) ct1++;

            }
            for (int j = x+1; j < x+8; j+=2) {
                if (map[i][j]==map[y][x]) ct1++;
            }
        }

        for (int i = y+1; i < y+8; i+=2) {
            for (int j = x; j < x+8; j+=2) {
                if (map[i][j]==map[y][x]) ct1++;

            }
            for (int j = x+1; j < x+8; j+=2) {
                if (map[i][j]!=map[y][x]) ct1++;
            }
        }
//        System.out.println(ct1);

        int ct2=0;
        for (int i = y; i < y+8; i+=2) {

            for (int j = x; j < x+8; j+=2) {
                if (map[i][j]==map[y][x]) ct2++;

            }
            for (int j = x+1; j < x+8; j+=2) {
                if (map[i][j]!=map[y][x]) ct2++;
            }
        }

        for (int i = y+1; i < y+8; i+=2) {
            for (int j = x; j < x+8; j+=2) {
                if (map[i][j]!=map[y][x]) ct2++;

            }
            for (int j = x+1; j < x+8; j+=2) {
                if (map[i][j]==map[y][x]) ct2++;
            }
        }
//        System.out.println(ct1);
        count = (ct1 - ct2 > 0) ? ct2 : ct1;
    }
}
