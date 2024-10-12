import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                intervals[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        System.out.println();
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(intervals[0][1]);
        for(int i=1;i<n;i++) {
            if(queue.peek()>=intervals[i][0]) {
                queue.offer(intervals[i][1]);
            }
            else if(queue.peek()<intervals[i][0]) {
                queue.remove();
                queue.offer(intervals[i][1]);
            }
        }
        System.out.println(queue.size());
    }
}
