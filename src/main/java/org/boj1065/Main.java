package org.boj1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word= bufferedReader.readLine();
        count=99;
        if (Integer.parseInt(word) < 100) System.out.println(Integer.parseInt(word));
        else{
            for (int i = 111;i<=Integer.parseInt(word);i++){
                check(i);
            }
            System.out.println(count);
        }

    }
    public static void check(int n){
        char[] number = String.valueOf(n).toCharArray();
        int result = Integer.parseInt(String.valueOf(number[1])) - Integer.parseInt(String.valueOf(number[0]));
        int ct1=0;
        for (int i = 0; i < number.length-1;i++){
            if(Integer.parseInt(String.valueOf(number[i+1])) - Integer.parseInt(String.valueOf(number[i])) == result){
                ct1++;
            }
            else{
                break;
            }
        }
        if (ct1 == number.length-1) count++;
    }
}
