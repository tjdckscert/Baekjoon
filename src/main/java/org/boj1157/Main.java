package org.boj1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word= bufferedReader.readLine();
        word = word.toLowerCase();
        char[] n = word.toCharArray();
        Arrays.sort(n);
        int count = 0;
        int max = 0;
        char maxCh=n[0];
        boolean isDouble=false;
        char start = n[0];
        for (int i = 0; i<n.length; i++){
            char ch = n[i];
           if (ch == start){
               count++;
//               System.out.println(maxCh + " same "+count);
           }
           else{
                   if (count > max ){
                       max =count;
                       maxCh=start;
//                       System.out.println(maxCh + " up "+count);
                       isDouble = false;
                   }
                   else if (count == max){
//                       System.out.println("?");
                       isDouble = true;
//                       break;
                   }
                   count=1;
                   start = ch;
//               System.out.println(maxCh + "  "+count);
           }
        }
        if (max == count) System.out.println("?");
        else if  (count > max){
            System.out.println(String.valueOf(start).toUpperCase());
        }
        else if (!isDouble){
            System.out.println(String.valueOf(maxCh).toUpperCase());
        }
        else if (isDouble){
            System.out.println("?");
        }

    }
}
