package org.boj5585;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int n,sum;
    public static int[] number = {500,100,50,10,5,1};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n =1000- sc.nextInt();
        sum=0;
        for (int i = 0; i <= number.length-1; i++) {
            sum+= n/number[i];
            n%=number[i];
        }
        System.out.println(sum);
    }
}