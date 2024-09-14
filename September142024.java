import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int n = nums.length;
        int maxand = 0;
        int count=0,maxcount=0;
        for(int i=0;i<n;i++) {
            if(nums[i]>=maxand) {
                maxand = nums[i];
            }
        }
        for(int i=0;i<n;i++) {
            if(nums[i]==maxand) {
                count++;
            }
            else {
                maxcount = Math.max(maxcount,count);
                count = 0;
            }
        }
        maxcount = Math.max(maxcount,count);
        if(maxcount == 0) {
            return 1;
        }
        return maxcount;
    }
}
