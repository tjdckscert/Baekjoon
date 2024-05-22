package org.boj11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n, m, count;
    static ArrayList<Integer>[] map;


    static boolean visit[][];
    static boolean visit2[];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] readLine = bufferedReader.readLine().split(" ");
        n = Integer.parseInt(readLine[0]);
        m = Integer.parseInt(readLine[1]);
        map = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            map[i] = new ArrayList<Integer>();
        }
        visit = new boolean[n + 1][n + 1];
        visit2 = new boolean[n + 1];
        count = 0;
        for (int i = 0; i < m; i++) {
            String[] newLine = bufferedReader.readLine().split(" ");
            int u = Integer.parseInt(newLine[0]);
            int v = Integer.parseInt(newLine[1]);
            map[u].add(v);
            map[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (visit2[i]) continue;
            bfs(map[i], i);
            count++;
//            System.out.println(i + "   " + count);
        }
        System.out.println(count);
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(visit[i][j]);
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= n; i++) {
//            System.out.println(visit2[i]);
//        }

    }


    public static void bfs(ArrayList<Integer> m, int i) {
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.add(m);
        visit2[i]=true;
        while (!queue.isEmpty()) {
            ArrayList<Integer> root = queue.poll();
            for (int number : root) {
                if (visit[i][number] || visit[number][i]) continue;
                queue.add(map[number]);
                visit[i][number] = true;
                visit2[number] = true;
                visit[number][i] = true;

            }

        }
    }

}