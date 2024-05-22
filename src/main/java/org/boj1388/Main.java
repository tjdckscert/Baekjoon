package org.boj1388;

import java.util.Scanner;

public class Main {

    static int n, m;
    static boolean[][] visit;
    static char[][] tile;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count=0;
        n = sc.nextInt();
        m = sc.nextInt();
        tile = new char[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];
        String space = sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            tile[i] = line.toCharArray();
//            System.out.println(Arrays.toString(tile[i]) +""+i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(i, j, tile[i][j]);
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x, int y, char t){
//        Stack<int[]> stack = new Stack<>();
//        System.out.println("x = "+x+",y = "+y+", count = "+count+"   ");
        if (visit[x][y]){
//            System.out.println("already visit");
            return;}
//        if (x==n-1 ||y==m-1){
//            count++;
//            System.out.println("tile[x][y] = "+tile[x][y]+", t = "+t);
//            return;
//        }
        if (tile[x][y]!=t) {
            count++;
//            System.out.println("tile[x][y] = "+tile[x][y]+", t = "+t);
        }
        else if (tile[x][y]==('-')){
            visit[x][y]=true;
            if (y<m-1) {
                if(visit[x][y+1]) count++;
                else dfs(x,y+1,tile[x][y]);
            }
            else count++;
        }
        else if (tile[x][y]==('|')){
            visit[x][y]=true;
//            System.out.println("visit x="+x+", y = "+y);
            if (x<n-1) {
                if(visit[x+1][y]) count++;
                else dfs(x+1,y,tile[x][y]);
            }
            else count++;
        }
    }
}
