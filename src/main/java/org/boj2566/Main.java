package org.boj2566;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int[][] a;
    public static int max;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       a = new int[9][9];
       int h=0;
       int w=0;
       max=0;
       for (int i =0 ;i <9;i++){
           for (int j =0 ;j <9;j++){
               a[i][j] = sc.nextInt();
               if (a[i][j] > max) {
                   max = a[i][j];
                   w = i;
                   h=j;
               }
           }
       }
        System.out.println(max);
        System.out.println((w+1)+" "+(h+1));
    }
}
