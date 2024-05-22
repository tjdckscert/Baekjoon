package org.boj1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean [] count;
    public static int test, result;
    public static String word;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        test = Integer.parseInt(bufferedReader.readLine());
        char as= 'a';//97

        int a = as;
//        System.out.println(a);
        result = test;
        while(test>0){
            test--;
            count = new boolean[27];
            word = bufferedReader.readLine();
            char[] n = word.toCharArray();
            char preChar =n[0];
            for (char i : n){
                if (!count[i-97])count[i-97] = true;
                else{
                    if (preChar!=i){
                        result--;
                        break;
                    }
                }
                preChar=i;
            }
        }
        System.out.println(result);
    }



}
