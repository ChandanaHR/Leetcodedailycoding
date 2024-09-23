import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String[] dictionary = new String[n];
        for(int i=0;i<n;i++) {
            dictionary[i] = sc.next();
        }
        int[] result = new int[s.length()+1];
        result[0] = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(dictionary[i]);
        }
        for(int i=1;i<s.length()+1;i++) {
            result[i] = result[i-1]+1;
            for(int j=0;j<i;j++) {
                if(set.contains(s.substring(j,i)) && result[j]<result[i]) {
                    result[i] = result[j];
                }
            }
        }
        System.out.println(result[s.length()]);
    }
}
