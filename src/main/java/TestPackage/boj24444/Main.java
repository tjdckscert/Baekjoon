package TestPackage.boj24444;

import java.util.*;

public class Main {
    static int n;
    static int m;
    static int r;
    static Vector<Integer>[] vector;
    static boolean[] visit;
    static int[] count;
    static int result = 1;
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m=sc.nextInt();
        r=sc.nextInt();
        vector = new Vector[n+1];
        visit = new boolean[n+1];
        count = new int[n+1];
        for (int i = 0; i <= n; i++) vector[i] = new Vector<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            vector[x].add(y);
            vector[y].add(x);
        }
        for (int i = 0; i <= n; i++) {
            Collections.sort(vector[i]);
        }

        bfs();
        for (int i = 1; i <= n; i++) {
            System.out.println(count[i]);
        }

    }
    static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(r);
        visit[r] = true;
        count[r]=1;
        while(!queue.isEmpty()){
            r = queue.poll();
            for(int i : vector[r]){
                if (!visit[i]) {
                    queue.add(i);
                    visit[i]=true;
                    count[i]=++result;
                }
            }
        }
    }
}
