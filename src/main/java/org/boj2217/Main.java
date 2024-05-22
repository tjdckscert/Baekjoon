package org.boj2217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n;
    public static Integer number[];
    public static int sum;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        number = new Integer[n];
        sum = 0;
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(number, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            sum = Math.max(sum, number[i] * (i + 1));
        }
        System.out.println(sum);
    }
}
