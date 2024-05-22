package org.boj5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i =1;i<=30;i++) arrayList.add(i);
        for (int i =0;i<28;i++) {
            arrayList.remove((Integer) Integer.parseInt(br.readLine()));
        };
        for (int i : arrayList){
            System.out.println(i);
        }
    }
}