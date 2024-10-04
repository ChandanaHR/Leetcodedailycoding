import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if((arr.length%2) != 0) {
            System.out.println("Invalid");
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        long sum = arr[0]*arr[n-1];
        if(arr.length==2) {
            System.out.println(arr[0]*arr[1]);
        }
        else {
            long prev = arr[0]+arr[n-1];
            int left=1,right=n-2;
            while(left<right) {
                long current = arr[left]+arr[right];
                if(prev == current) {
                    sum = sum+(arr[left]*arr[right]);
                }
                if(prev != current) {
                    System.out.println("Not possible to make pairs");
                }
                prev = current;
                left++;
                right--;
            }
        }
        System.out.println(sum);
    }
}
