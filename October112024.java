import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int[][] times = new int[r][2];
        for(int i=0;i<r;i++) {
            for(int j=0;j<2;j++) {
                times[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(times[i][j]+" ");
            }
            System.out.println();
        }
        int targetfriend = sc.nextInt();
        int[][] events = new int[r][3];
        PriorityQueue<Integer> availablechairs = new PriorityQueue<>();
        PriorityQueue<int[]> occupiedchairs = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<r;i++) {
            events[i] = new int[]{times[i][0],times[i][1],i};
            availablechairs.offer(i);
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(events[i][j]+" ");
            }
            System.out.println();
        }
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        System.out.println();
        for(int i=0;i<r;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(events[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] event : events) {
            int arrivaltime = event[0];
            int leavingtime = event[1];
            int userindex = event[2];
            
            while(!occupiedchairs.isEmpty() && arrivaltime>=occupiedchairs.peek()[0]) {
                availablechairs.offer(occupiedchairs.poll()[0]);
            }
            
            int assignedchair = availablechairs.poll();
            
            if(userindex==targetfriend) {
                System.out.println(assignedchair);
            }
            occupiedchairs.offer(new int[]{leavingtime,assignedchair});
        }
    }
}
