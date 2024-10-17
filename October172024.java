import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String temp = Integer.toString(num);
        char nums[] = temp.toCharArray();
        int n = temp.length();
        int maxindex=-1,swap1=-1,swap2=-1;
        for(int i=n-1;i>=0;i--) {
            if(maxindex==-1 || nums[i]>nums[maxindex]) {
                maxindex = i;
            }
            else if (nums[i]<nums[maxindex]) {
                swap1 = i;
                swap2 = maxindex;
            }
        }
        if(swap1!=-1 && swap2!=-1) {
            char temp3 = nums[swap1];
            nums[swap1] = nums[swap2];
            nums[swap2] = temp3;
        }
        System.out.println(Integer.parseInt(new String(nums)));
    }
}
