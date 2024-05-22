package org.boj2444;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i =0; i < number; i++){
            for (int j=1; j<number-i;j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for  (int i =number-2; i >=0; i--) {
            for (int j=1; j<number-i;j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            if ( i!=0) System.out.println();
        }
    }
}
