package org.boj14501;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Main {
    static int[] t, p;
    static int n;
    static int sum, max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = new int[n];
        p = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
            sc.nextLine();
        }
        max = 0;
        check(0, 0);
        System.out.println(max);
    }

    public static void check(int i, int s) {
        System.out.println("day : " +i);
        if (i >= n) {
            max = Math.max(s, max);
            return;
        }
        if (i + t[i] <= n) {
            check(i + t[i], s +p[i]);
        } else {
            check(i + t[i], s);
        }

        check(i + 1, s);
    }
}
