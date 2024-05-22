package org.boj2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       String word = bufferedReader.readLine();

       word = word.replace("lj","a").replace("c=","a").replace("dz=","a").replace("d-","a").replace("c-","a").replace("nj","a").replace("s=","a").replace("z=","a");
//        System.out.println(word);
       System.out.println(word.length());

    }
}
