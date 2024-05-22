package org.boj16173;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int map[][];

    static int moveX[] = {1,0};
    static int moveY[] = {0,1};
    static boolean visit[][];
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n+1][n+1];
        visit = new boolean[n+1][n+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)  visit[i][j]=false;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)  map[i][j]=sc.nextInt();
        bfs();
    }

    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0});
        visit[0][0]=true;
        while(!queue.isEmpty()){
            int point[] = queue.poll();
            int x= point[0];
            int y= point[1];
            if (map[x][y]==-1) break;
            int newmoveX[] = {map[x][y],0};
            int newmoveY[] = {0,map[x][y]};
            for (int q = 0; q < 2; q++) {
                int newX = x+newmoveX[q];
                int newY = y+newmoveY[q];
                if (newX<0||newY<0||newX>=n||newY>=n) continue;
                if (visit[newX][newY]) continue;
                queue.add(new int[]{newX, newY});
//                System.out.println("x = "+newX+", y = "+newY+", newmoveX = "+newmoveX[q]+", newmoveY = "+newmoveY[q]);
                visit[newX][newY] = true;
//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) System.out.print(visit[i][j]+" ");
//                    System.out.println(" ");
//                }
//                System.out.println(" ");
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) System.out.print(visit[i][j]);
//            System.out.println(" ");
//        }
        if (visit[n-1][n-1]) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }
}