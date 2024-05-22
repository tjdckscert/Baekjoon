package org.boj25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double sum;
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       sum=0;
       int count=0;
        for (int i =0; i<20; i++){
            String[] major = br.readLine().split(" ");
            float gradeNumber = Float.parseFloat(major[1]);
            String grade = major[2];
            switch (grade){
                case "A+":
                    sum += gradeNumber * 4.5;
                    count+=gradeNumber;
                    break;

                case "A0":
                    sum += gradeNumber * 4.0;
                    count+=gradeNumber;
                    break;

                case "B+":
                    sum += gradeNumber * 3.5;
                    count+=gradeNumber;
                    break;

                case "B0":
                    sum += gradeNumber * 3.0;
                    count+=gradeNumber;
                    break;

                case "C+":
                    sum += gradeNumber * 2.5;
                    count+=gradeNumber;
                    break;

                case "C0":
                    sum += gradeNumber * 2.0;
                    count+=gradeNumber;
                    break;

                case "D+":
                    sum += gradeNumber * 1.5;
                    count+=gradeNumber;
                    break;

                case "D0":
                    sum += gradeNumber * 1.0;
                    count+=gradeNumber;
                    break;

                case "F":
                    count+=gradeNumber;
                    break;

                case "P":
                    break;

            }
        }
        String num = String.format("%.6f",sum/count);
        System.out.println(num);
    }
}
