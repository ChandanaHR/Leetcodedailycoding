import java.io.*;
import java.util.*;
import java.lang.*;

class CustomStack {
    int n;
    ArrayList<Integer> list; 
    public CustomStack(int maxSize) {
        n = maxSize;
        list = new ArrayList<>(maxSize);
    }
    public void push(int element) {
        if(list.size()<n) {
            list.add(element);
        }
    }
    public int pop() {
        if(list.isEmpty()) {
            return -1;
        }
        return list.remove(list.size()-1);
    }
    public void increment(int k,int val) {
        int inc = 0;
        int index = 0;
        while(inc<k && index<list.size()) {
            int value = list.get(index);
            System.out.println(value);
            list.remove(index);
            list.add(index,value+val);
            inc++;
            index++;
        }
        System.out.println(list);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = sc.nextInt();
        CustomStack obj = new CustomStack(maxSize);
        while(true) {
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 : System.out.println("Enter the element to be pushed");
                         int element = sc.nextInt();
                         obj.push(element);
                         break;
                case 2 : int poppedelement = obj.pop();
                         System.out.println(poppedelement);
                         break;
                case 3 : System.out.println("Enter the k value");
                         int k = sc.nextInt();
                         System.out.println("Enter the value to be incremented");
                         int val = sc.nextInt();
                         obj.increment(k,val);
                         break;
                case 4 : System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }
}
