import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++) {
            map.put(list.get(i),i+1);
        }
        System.out.println(map);
        int[] res = new int[n];
        for(int i=0;i<n;i++) {
            res[i] = map.get(arr[i]);
        }
        for(int i=0;i<n;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
