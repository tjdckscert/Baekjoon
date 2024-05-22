package org.boj24887;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long a=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        long day = Long.parseLong(strArr[0]);
        long totalWork = Long.parseLong(strArr[1]);
        String[] strArr2 = br.readLine().split(" ");
        long[] dayWork = new long[strArr2.length];
        long sum =totalWork;
        int max = 1;
        for (int i =0 ;i <dayWork.length; i++){
            dayWork[i] = Integer.parseInt(strArr2[i]);
            sum-=dayWork[i];
            if (dayWork[i]>=totalWork) {
                max=9;
                break;
            }
        }
        if (max==9) System.out.println("Free!");
        else if (sum>0)System.out.println("-1");
        else{
            for (long onDay =0 ;onDay <dayWork.length; onDay++){
                for (long offDay =a;offDay+onDay <day; offDay++){
                    cal(dayWork,offDay,onDay,0,0,day,totalWork);
                }
            }
            System.out.println(a);
        }
    }


    public static void cal(long[] dayWork, long offDay, long onDay, long sum, long correction,long day,long totalWork){
        if (onDay==day-1||offDay+onDay==day-1){
            sum+=dayWork[(int) onDay];
            if (sum >= totalWork)
                if (a < offDay) {
                    a = offDay;
                }
        }
        else if(onDay+offDay+1>day){
            sum += dayWork[(int) onDay];
            if (sum >= totalWork) {
                if (a < offDay) {
                    a = offDay;
                }
            }
            else cal(dayWork, offDay, onDay+1, sum-dayWork[(int) onDay], correction, day,totalWork);
        }
        else {
            sum += dayWork[(int) onDay];
            onDay += offDay + 1;
            if (sum >= totalWork) {
                if (a < offDay) {
                    a = offDay;
                }
            }
            else cal(dayWork, offDay, onDay, sum, correction, day, totalWork);
        }
    }
}
