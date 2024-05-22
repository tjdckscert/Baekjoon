package org.boj2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //1 7 19 37 61 > 6 12 18 24
        long sum=1;
        long count=1;
        while (true){
            if (sum>= n) break;
            else{
                sum+=count*6;
                count++;
            }
        }
        System.out.println(count);



    }
}
