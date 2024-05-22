package org.Algorithms;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int t= sc.nextInt();
        Boolean visit[] = new Boolean[n+1];
        Vector<Integer>[] rood = new Vector[n+1];
        for (int i =0; i<=n;i++) visit[i] = false;
        for (int i =0; i<=n;i++) rood[i] = new Vector<Integer>();

        for (int i =0; i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
//            System.out.println(i);
            rood[a].add(b);
            rood[b].add(a);
        }
        bfs(1,visit,rood);

    }


    public static void bfs(int point, Boolean[] visit, Vector<Integer>[] rood){
        Queue<Integer> queue = new LinkedList<>();
        visit[point] = true;
        queue.add(point);
        int count=-1;

        while (!queue.isEmpty()){
            point = queue.poll();
            count++;
            for (int i=0;i<rood[point].size();i++){
                int newNumber =rood[point].get(i);
                if (!visit[newNumber]) {
                    queue.add(newNumber);
                    visit[newNumber]=true;
                }
            }

        }
        System.out.println(count);

    }

}
