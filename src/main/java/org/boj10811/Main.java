package org.boj10811;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n=  sc.nextInt();
        int m =  sc.nextInt();
        int[] array = new int[n+1];
        for (int i=1; i<=n;i++) array[i]=i;
        for (int k=0; k<m;k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (; i<=j; i++){
                int nn = j--;
                int tmp = array[i];
                array[i] = array[nn];
                array[nn] = tmp;
            }
        }
        for (int i=1; i<=n; i++) System.out.print(array[i]+" ");
    }
}