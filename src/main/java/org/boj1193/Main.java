package org.boj1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int result;
    public static int sum;
    public static String me, not;
    public static void main(String[] args) throws IOException {
        result=0;
        sum=0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int x;
        for(int a = 1; a<1000000;a++) {
            x=a;
            findX(x);
            if (x == 1) me= "1/1";
            else {
                if (result % 2 == 0) me =(result + sum) + "/" + (1 - sum);
                else me = (1 - sum) + "/" + (result + sum);
            }
//        System.out.println(sum+" "+result);
            findNew(x);
            System.out.println(me.equals(not));
        }

    }
    public static void findX(int x){
        int i=0;
        while(x>0){
            x-=i;
            i++;
        }
        sum=x;
        if (x<0) result = i-1;
        else result =i-1;
    }
    public static void findNew(int x){
        int cross_count = 1, prev_count_sum = 0;

        while (true) {


            if (x <= prev_count_sum + cross_count) {

                if (cross_count % 2 == 1) {

                    not=(cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum);
                    break;
                }

                else {

                    not=((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}

