package org.boj10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int n=Integer.parseInt(strArr[0]);
        int m=Integer.parseInt(strArr[1]);
        int[] arr = new int [n];
        for (int j =0; j<n;j++){
            arr[j]=0;
        }
        for (int i =0; i<m;i++){
            String[] number = br.readLine().split(" ");
            for (int j =Integer.parseInt(number[0])-1; j<=Integer.parseInt(number[1])-1;j++){
                arr[j]=Integer.parseInt(number[2]);
            }
        }
        for (int j =0; j<n;j++){
            System.out.print(arr[j]+" ");

        }
    }
}