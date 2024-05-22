package org.boj16916;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static String s,p;
    static int table[];
    static  int answer;
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s= br.readLine();
        p = br.readLine();
        table = new int[p.length()];
        answer=0;
        getTable();
        KMP();
        System.out.println(answer);
    }

    private static void KMP() {
        int j = 0;
        for(int i = 0;i<s.length(); i++){
            while(j>0 && s.charAt(i)!= p.charAt(j)){
                j = table[j-1];
            }
            if(s.charAt(i)==p.charAt(j)){

                if(j == p.length()-1) {
                    answer=1;
                    return;
                }
                else j++;
            }
        }
    }

    private static void getTable() {
        int j = 0;
        for(int i = 1;i<p.length(); i++){
            while(j>0 && p.charAt(i)!= p.charAt(j)){
                j = table[j-1];
            }
            if(p.charAt(i)==p.charAt(j)){
                table[i] = ++j;
            }
        }
    }
}
