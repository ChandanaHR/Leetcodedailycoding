import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        int[] remainder = new int[n];
        for(int i=0;i<n;i++) {
            remainder[i] = ((arr[i]%k)+k)%k;
        }
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(remainder[i]+" ");
        }
        int countremainder[] = new int[k];
        for(int i=0;i<n;i++) {
            countremainder[remainder[i]]++;
        }
        System.out.println();
        for(int i=0;i<k;i++) {
            System.out.print(countremainder[i]+" ");
        }
        for(int i=1;i<k;i++) {
            if(countremainder[i]!=countremainder[k-i]) {
                System.out.println("False");
            }
        }
        if(countremainder[0]%2 == 0) {
            System.out.println("true");
        }
       /* int rem = n%k;
        System.out.println(rem);*/
    }
}
