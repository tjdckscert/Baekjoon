package org.boj1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split("-");
        int sum=0;
        int result=0;
        String[] zeroLine = line[0].split("\\+");
        for (int j =0; j<zeroLine.length;j++){
            sum+=Integer.parseInt(zeroLine[j]);
        }
        for (int i=1; i<line.length;i++){
            String[] nLine = line[i].split("\\+");
            result=0;
            for (int j =0; j<nLine.length;j++){
                result+=Integer.parseInt(nLine[j]);
            }
            if (nLine.length ==1) {
                sum-=result;
                continue;
            }
                sum-=result;
        }
        System.out.println(sum);

    }
}
