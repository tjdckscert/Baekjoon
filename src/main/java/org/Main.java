package org;

import java.net.CookieHandler;
import java.util.*;
import java.io.FileInputStream;

class Main {
    static boolean visit[][];
    static int map[][];
    static int n,count,k;
    static int moveX[] = {1,0,-1,0};
    static int moveY[] = {0,1,0,-1};
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            k = sc.nextInt();
            count=0;
            visit = new boolean[n][n];
            map = new int[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j <n;j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<n; i++){
                for(int j = 0; j <n;j++) {
                    if(map[i][j]==0) continue;
                    dfs(j,i,0);
                }
            }
//            dfs(0,0,0);
            System.out.println(count);
        }
    }
    public static void dfs(int x,int y,int deep){
        int cx=0;


        for(int i =x; i<n;i++){
            if(map[y][i]==0) break;
            cx++;
        }
        if(cx== k ) {
            if(x>=1 && map[y][x-1]!=1) count++;
            if(x == 0) count++;
        }

        int cy=0;
        for(int i =y; i<n;i++){
            if(map[i][x]==0 || cy > k) break;
            cy++;
        }
        if(cy== k ) {
            if(y>=1 && map[y-1][x] !=1)count++;
            if(y == 0) count++;
        }
//        System.out.println("x = "+x +" y = "+y+" cx = "+cx+" cy = " + cy);

//        if(!visit[y][x] || deep <=k ){
//            visit[y][x] = true;
//            for(int i : moveY){
//                for(int j : moveX){
//                    if(j+x <0 || j+x >=n || i+y<0 || i+y>=n) continue;
//                    if(visit[y+i][x+j]) continue;
//                    if(map[y+i][x+j]==0) continue;
//                    dfs(x+j,y+i,deep+1);
//                }
//            }
//            if(deep ==k) count++;
//        }
    }
}

//    public static void dfs(int number, int point, int deep) {
//        System.out.println("number = " + number + " deep = " + deep);
//        //System.out.print("number = " + number + " numbers[i] = " + numbers[i]);System.out.println(" number = " + number + " deep " + deep);
//        if(deep == n) {
//            arr.add(number);
//            return;
//        }
//        for (int i = point; i < 4; i++) {
//                dfs(number+numbers[i],i, deep+1);
//        }
//    }
