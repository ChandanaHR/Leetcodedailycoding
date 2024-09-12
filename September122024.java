import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allowed = sc.nextLine();
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++) {
            System.out.println(i);
            words[i] = sc.next();
        }
        for(String word : words) {
            System.out.print(word+" ");
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++) {
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String subpart : words) {
            int len = subpart.length();
            int flag = 0;
            for(int i=0;i<len;i++) {
                if(!set.contains(subpart.charAt(i))) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
        }
        System.out.println(set);
        System.out.println(count);
    }
}
