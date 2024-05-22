package org.boj2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static String line;
    public static int rule;

    public static void main(String[] args) throws IOException {
        int sum=0;
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String[] test = bufferedReader.readLine().split(" ");
       line = test[0];
       rule = Integer.parseInt(test[1]);
        StringBuilder stringBuilder = new StringBuilder(line);
        line = stringBuilder.reverse().toString();
       char[] sp = line.toCharArray();

       for (int i =0; i<sp.length;i++){
           char c = sp[i];
           if (c>64)sum+= ((c-64)+9) * (long) Math.pow(rule,i);
           else sum+= Integer.parseInt(String.valueOf(c))*(Math.pow(rule,i));
       }
        System.out.println(sum);

    }
}
