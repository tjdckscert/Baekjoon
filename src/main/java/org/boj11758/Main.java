package org.boj11758;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[3];
        double[] y = new double[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
            sc.nextLine();
        }
        double s1 = (x[0]*y[1] + x[1]*y[2] + x[2]*y[0]);
        double s2 = (y[0]*x[1] + y[1]*x[2] + y[2]*x[0]);
        if (s1-s2>0) System.out.println("1");
        else if (s1-s2<0) System.out.println("-1");
        else System.out.println(0);
    }
}