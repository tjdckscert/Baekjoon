package org.boj4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int w,h;
    static int[][] map;

    static int[] moveX = {1,0,-1};
    static int[] moveY = {1,0,-1};
    static int count;
    static boolean[][] visit;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            count=0;
            String[] line = bufferedReader.readLine().split(" ");
            w = Integer.parseInt(line[0]);
            h= Integer.parseInt(line[1]);
            if (w==0&&h==0) break;
            map = new int[h+1][w+1];
            visit = new boolean[h+1][w+1];

            for (int i =0; i<h;i++){
                String[] value = bufferedReader.readLine().split(" ");
                for(int j = 0; j<w;j++){
                    map[i][j] = Integer.parseInt(value[j]);
                }
            }

            for (int i =0; i<h;i++){
                for(int j = 0; j<w;j++){
                    if (visit[i][j]) continue;
                    if (map[i][j]==0) continue;
                    dfs(i,j);
//                    System.out.println(i+"   "+j);
                    count++;
                }
            }
            System.out.println(count);
        }

    }

    public static void dfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        while (!queue.isEmpty()){
            int [] now = queue.poll();
            for(int i : moveX){
                for (int j : moveY){
                    int newX = now[0] +i;
                    int newY = now[1] +j;
                    if (newX>=h||newY>=w||newX<0||newY<0) continue;
                    if (visit[newX][newY]) continue;
                    if (map[newX][newY]==0) continue;
                    queue.add(new int[]{newX,newY});
                    visit[newX][newY]=true;
                }
            }
        }

    }
}
