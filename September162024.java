import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> timePoints = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            String hour = sc.next();
            timePoints.add(hour);
        }
        int[] minutes = new int[n];
        for(int i=0;i<n;i++) {
            int a=0,b=0;
            String[] splitted = timePoints.get(i).split(":");
            System.out.print(splitted[0]+" "+splitted[1]+" ");
            a = Integer.parseInt(splitted[0]);
            b = Integer.parseInt(splitted[1]);
            int sum = a*60+b;
            minutes[i] = sum;
        }
        System.out.println(timePoints);
        for(int i=0;i<n;i++) {
            System.out.print(minutes[i]+" ");
        }
        Arrays.sort(minutes);
        System.out.println();
        for(int i=0;i<n;i++) {
            System.out.print(minutes[i]+" ");
        }
        int min = 0;
        for(int i=1;i<n;i++) {
            int ans = minutes[i]-minutes[i-1];
            if(ans<=min) {
                min = ans;
            }
        }
        if((24*60+minutes[n-1]-minutes[0])<=min) {
            min = 24*60+minutes[n-1]-minutes[0];
        }
        System.out.println(min);
    }
}
