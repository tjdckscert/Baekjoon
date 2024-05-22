package org.boj2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] moveX = {-1,1,0,0};
    static boolean[][] visit;
    static int[] moveY = {0,0,-1,1};
    static int n;
    static int m;
    static  int[][] root;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = sc.nextInt();
        m = sc.nextInt();
        visit = new boolean[n][m];
        root = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)visit[i][j] = false;

        for(int i = 0 ; i < n ; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();

            for(int j = 0 ; j < ch.length ; j++) {
                root[i][j] = Character.getNumericValue(ch[j]);
            }
        }
        visit[0][0] = true;
        bfs();
        System.out.println(root[n-1][m-1]);
    }

    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int x = point[0];
            int y = point[1];
            for (int i = 0; i<4; i++){
                int newX = x + moveX[i];
                int newY = y + moveY[i];
                if (newX < 0 || newY < 0 || newX >= n || newY >= m)
                    continue;
                if (root[newX][newY]==0|| visit[newX][newY])
                    continue;

                queue.add(new int[]{newX,newY});
                root[newX][newY] = root[x][y]+1;
                visit[newX][newY]=true;
            }
        }
    }
}
