import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++) {
            pq.offer(new int[]{nums[i],i});
        }
      /*  while(!pq.isEmpty()) {
            int[] array = pq.poll();
            System.out.print(Arrays.toString(array)+" ");
        }*/
        System.out.println(pq.peek()[0]+" "+pq.peek()[1]);
        long score = 0;
        while(!pq.isEmpty() && k>0) {
            score+=nums[pq.peek()[1]];
            //System.out.println(score);
            double newvalue1 = Math.ceil(pq.peek()[0]/3.0);
            //System.out.println(newvalue1);
            int newvalue = (int)newvalue1;
            //System.out.println(newvalue);
            int index = pq.peek()[1];
            //System.out.println(index);
            nums[pq.peek()[1]] = newvalue;
            pq.remove();
            pq.offer(new int[]{newvalue,index});
            k--;
        }
        System.out.println(score);
    }
}
