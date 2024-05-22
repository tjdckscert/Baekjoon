package org.boj11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int n;
    public static int p[];
    public static int sum;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bufferedReader.readLine());
        p = new int[n];
        sum=0;
        String[] line = bufferedReader.readLine().split(" ");
        for(int i=0; i<n;i++){
            p[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(p);

        for (int i=0;i<n;i++){
            sum+=p[i]*(n-i);
        }
        System.out.println(sum);
    }

}