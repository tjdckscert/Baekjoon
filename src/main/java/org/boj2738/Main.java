package org.boj2738;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int[][] a,b;
    public static int n,m;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];
        for (int i =0; i<n; i++){
            for (int j =0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i =0; i<n; i++){
            for (int j =0; j<m; j++){
                b[i][j] = sc.nextInt()+a[i][j];
            }
        }

        for (int i =0; i<n; i++){
            for (int j =0; j<m; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
