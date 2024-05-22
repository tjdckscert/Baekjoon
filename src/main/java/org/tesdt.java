//package org;
//
//import java.util.*;
//
//class Solution {
//
//    static int[] number;
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        pair[] number = new pair[priorities.length];
//        for(int i = 0; i< priorities.length;i++){
//            number[i] = new pair();
//            number[i].key = priorities[i];
//            number[i].value = i+1;
//            if (location == i) location = number[i].value;
//        }
//        Arrays.sort(number,new Comparator<pair>(){
//            @Override
//            public int compare(pair o1, pair o2) {
//                if(o1.key == o2.key){
//                    return o2.value - o1.value;
//                }
//                return o2.key-o1.key;
//            }
//        });
//        Arrays.sort(number,new Comparator<pair>(){
//            @Override
//            public int compare(pair o1, pair o2) {
//                if(o1.key == o2.key){
//                    return o2.value - o1.value;
//                }
//                return o2.key-o1.key;
//            }
//        });
//        int last= 0;
//        int count = 0;
//        for (int i = 0; i<number.length-1;i++){
//            if (number[i].key!=number[i+1].key) {
//                last = number[i].value;
//                count++;
//            }
//            if (number[i].key==number[i+1].key) {
//                if (number.length-number[i+1].value>0)  count++;
//            }
////            if (number[i].value == location){
////                System.out.println(count);
////                break;
////            }
//            System.out.println(number[i].key+" "+number[i].value);
//        }
//        return answer;
//    }
//}
//
//class pair{
//    int key;
//    int value;
//    pair(){
//
//    }
//    pair(int key, int value){
//        this.key = key;
//        this.value= value;
//    }
//
//}
//
//
//public class tesdt {
//    static Set<Integer> set = new HashSet<>();
//    static String numbers;
//    static Vector<pair>[] vector = new Vector[100];
//    static ArrayList<pair>arrayLists = new ArrayList<>();
//    public static void main(String[] args) {
//        int[] priorities = {1, 2, 2, 1, 7, 6, 5};
//        int location = 3;
//
//        for (int i=0; i < priorities.length;i++ ){
//            arrayLists.add(new pair(priorities[i],i));
//            if (location == i) location = i;
//        }
//        String s="asdasd";
//
//        if(s. =="s")
////        int max = arrayLists.get(0).key;
//        for (int j = 0; j < arrayLists.size();j++ ) {
//            int max = arrayLists.get(j).key;
//            for (int i = j; i < arrayLists.size(); i++) {
////                System.out.println("++++++++++++"+max+"++++++++++++++++");
////                for (pair y : arrayLists) {
////                    System.out.println(y.key + " " + y.value);
////                }
//                if (arrayLists.get(i).key <= max) continue;
//                if (arrayLists.get(i).key > max) {
//                    max = arrayLists.get(i).key;
//                    int tmp = j;
//                    for (int k = 0; k < i-j; k++) {
//                        arrayLists.add(arrayLists.get(tmp));
//                        arrayLists.remove(tmp);
//                    }
//                    i-=2;
//                }
////                System.out.println("+++++++++++++change "+max+"+++++++++++++++");
////                for (pair y : arrayLists) {
////                    System.out.println(y.key + " " + y.value);
////                }
//            }
//        }
//        int count = 0;
//        for(pair p : arrayLists ){
//            count++;
//            if(p.value == location) {
//                System.out.println("anser "+count);
//                break;
//            }
//        }
//        System.out.println("location = "+location+", where = "+count);
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////        List<Integer> arrayList = set.stream().toList();
////        arrayList.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o2-o1;
////            }
////        });
//
//        for (pair i : arrayLists){
//            System.out.println(i.key +" "+i.value);
//        }
//
////        s.solution(a,0);
//    }
//
//}
//
//
