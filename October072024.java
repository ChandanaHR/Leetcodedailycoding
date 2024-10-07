import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='B' && stack.peek()=='A'){
                stack.pop();
            }
            else if(s.charAt(i)=='D' && stack.peek()=='C') {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack.size());
    }
}
