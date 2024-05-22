package org.boj1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int x1, x2, y1, y2, cx, cy, r;
    static int count;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {

            String[] point = bufferedReader.readLine().split(" ");

            x1 = Integer.parseInt(point[0]);
            y1 = Integer.parseInt(point[1]);
            x2 = Integer.parseInt(point[2]);
            y2 = Integer.parseInt(point[3]);

            count = 0;

            int n = Integer.parseInt(bufferedReader.readLine());

            for (int k = 0;k<n; k++){
                String[] planet = bufferedReader.readLine().split(" ");
                cx = Integer.parseInt(planet[0]);
                cy = Integer.parseInt(planet[1]);
                r = Integer.parseInt(planet[2]);

                boolean ch1 = check(x1, y1, cx, cy, r);
                boolean ch2 = check(x2, y2, cx, cy, r);

                if (!(ch1 && ch2) && (ch1 || ch2)) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    public static boolean check(int x, int y, int cx, int cy, int r) {
        return Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2)) < r;
    }
}
