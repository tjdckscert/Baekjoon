package org.Algorithms;

import java.util.Scanner;

public class KMP {
    static int[] pi;
    static String s,a;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         s= sc.nextLine();
         a = sc.nextLine();
        pi = new int[a.length()];
        getpi();
        for (int i :pi){
            System.out.println(i);
        }
    }

    private static void getpi() {
        int j = 0;
        for(int i = 1; i<a.length();i++){
            while (j>0&& a.charAt(i)!= a.charAt(j)){
                j = pi[j-1];
            }
            if( a.charAt(i)== a.charAt(j)){
                pi[i] =++j;
            }
        }
    }

    public static void findString(String s, String a){
        int n = s.length();
        int b = a.length();

    }
}
