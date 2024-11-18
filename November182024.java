import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] code = new int[n];
        for(int i=0;i<n;i++) {
            code[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = new int[n];
        for(int i=0;i<n;i++) {
            int sum = 0;
            if(k>0) {
                int index = 1;
                for(int j=0;j<k;j++) {
                    sum = sum+code[(i+(index++))%n];
                }
                res[i] = sum;
            }
            else if(k<0) {
                int index = 1;
                for(int j=0;j<Math.abs(k);j++) {
                    sum = sum+code[((i-(index++)+n))%n];
                }
                res[i] = sum;
            }
            else if(k==0) {
                Arrays.fill(res,0);
            }
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
