import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();
        Stack<Integer> startstack = new Stack<>();
        Stack<Integer> goalstack = new Stack<>();
        while(start>0) {
            int startrem = start%2;
            startstack.push(startrem);
            start = start/2;
        }
        while(goal>0) {
            int goalrem = goal%2;
            goalstack.push(goalrem);
            goal = goal/2;
        }
        System.out.println(startstack);
        System.out.println(goalstack);
        System.out.println(startstack.peek());
        if(startstack.size()>goalstack.size()) {
            int finallengthg = startstack.size()-goalstack.size();
            while(finallengthg>0) {
                goalstack.push(0);
                finallengthg--;
            }
        }
        if(goalstack.size()>startstack.size()) {
            int finallengths = goalstack.size()-startstack.size();
            while(finallengths>0) {
                startstack.push(0);
                finallengths--;
            }
        }
        System.out.println(startstack);
        System.out.println(goalstack);
        int count = 0;
        while(!(startstack.isEmpty() && goalstack.isEmpty())) {
            if(startstack.peek()!=goalstack.peek()) {
                count++;
            }
            startstack.pop();
            goalstack.pop();
        }
        System.out.println(startstack);
        System.out.println(goalstack);
        System.out.println(count);
    }
}
