package org.boj1931;

import java.io.IOException;
import java.util.*;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<AbstractMap.SimpleEntry<Integer, Integer>> list = new ArrayList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new AbstractMap.SimpleEntry<>(sc.nextInt(), sc.nextInt()));
        }
        list.sort(new Comparator<AbstractMap.SimpleEntry<Integer, Integer>>() {
            @Override
            public int compare(AbstractMap.SimpleEntry<Integer, Integer> o1, AbstractMap.SimpleEntry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return o1.getKey() - o2.getKey();
                }
                return o1.getValue() - o2.getValue() ;
            }
        });
        int sum = 0;
        int preTime = 0;
        for (int i = 0; i < n; i++) {
            if (preTime <= list.get(i).getKey()) {
                preTime = list.get(i).getValue();
                sum++;
            }
        }
        System.out.println(sum);

    }
}
