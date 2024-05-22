package org.boj11047;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int n,k;
    public static int[] number;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        number = new int[n];
        for (int i = 0; i < n; i++) {
            number [i] = sc.nextInt();
        }
        int sum=0;
        for (int i = n-1; i >= 0; i--) {
            sum+= k/number[i];
            k%=number[i];
        }
        System.out.println(sum);
    }
}