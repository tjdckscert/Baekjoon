package org.boj2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int node;
    static int line;
    static int[][] map;
    static boolean[] visit;
    static Queue<Integer> queue = new LinkedList<Integer>();
    int result= 0;
    public static void bfs(int i){
        //queue.

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        line = sc.nextInt();
        map = new int[node + 1][node + 1];
        visit = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            map[n][m] = map[m][n] = 1;
        }
        bfs(1);

                sc.close();
//        Arrays.sort(list, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
//            }
//        });
    }
}
