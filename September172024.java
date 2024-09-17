import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] s1array = s1.split(" ");
        String[] s2array = s2.split(" ");
        for(int i=0;i<s1array.length;i++) {
            System.out.print(s1array[i]+" ");
        }
        System.out.println();
        for(int i=0;i<s2array.length;i++) {
            System.out.print(s2array[i]+" ");
        }
        System.out.println();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s1array.length;i++) {
            map.put(s1array[i],map.getOrDefault(s1array[i],0)+1);
        }
        System.out.println(map);
        for(int i=0;i<s2array.length;i++) {
            map.put(s2array[i],map.getOrDefault(s2array[i],0)+1);
        }
        System.out.println(map);
        int count = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                count++;
            }
        }
        System.out.println(count);
        int k = 0;
        String[] result = new String[count];
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                result[k++] = entry.getKey();
            }
        }
        for(int i=0;i<count;i++) {
            System.out.print(result[i]+" ");
        }
    }
}
