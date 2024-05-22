package org.boj10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static String[] word;
//    public static Vector<String>[] arrayList;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        arrayList = new Vector[15];
        StringBuilder[]  stringBuilder = new StringBuilder[15];
//        for (int i =0; i<15; i++) arrayList[i]= new Vector<>();
        for (int i =0; i<15; i++) stringBuilder[i]= new StringBuilder();
        word = new String[5];
        for (int i =0; i<5; i++) word[i] = bufferedReader.readLine();
        for (int i =0; i<5; i++){
            String line = word[i];
            for (int j =0; j<line.length();j++){
//                arrayList[j].add(String.valueOf(line.charAt(j)));
                stringBuilder[j].append(String.valueOf(line.charAt(j)));
            }
        }


//        for (int i =0; i<15; i++) System.out.println(arrayList[i]);
        for (int i =0; i<15; i++) {
            if (stringBuilder.length==0) continue;
            System.out.print(stringBuilder[i].toString());
        }



    }
}
