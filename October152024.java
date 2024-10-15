import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] array = s.toCharArray();
        int right = array.length-1;
        long zero=0,one=0;
        long swap = 0;
        while(right>=0) {
            if(zero==0 && array[right]=='1') {
                right--;
            }
            else if(array[right]=='0') {
                zero++;
                //System.out.println(zero);
                right--;
            }
            else if(zero>0 && array[right]=='1') {
                swap = swap+zero;
               // System.out.println(one);
                right--;
            }
        }
        System.out.println(swap);
    }
}
