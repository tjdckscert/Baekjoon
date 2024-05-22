package org.boj1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int n;
    public static int[] a,b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a= new int[n];
        b= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);

        int sum =0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n-(i+1)];
        }
        System.out.println(sum);

    }


}
