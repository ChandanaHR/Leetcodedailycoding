import java.io.*;
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int item) {
        data = item;
        next = null;
    }
}

public class Main {
    static Node head = null;
    public static void create(int element) {
        Node newnode = new Node(element);
        if(head == null) {
            head = newnode;
            return;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public static void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static int gcd(int a,int b) {
        while(a>0 && b>0) {
            if(a>=b) {
                a = a%b;
            }
            else if(b>a) {
                b = b%a;
            }
        }
        if(a==0) {
            return b;
        }
        return a;
    }
    public static Node insertGreatestCommonDivisors() {
        if(head.next==null) {
            return head;
        }
        else {
            Node prev = head;
            Node curr = head.next;
            while(curr != null) {
                int gcdres = gcd(prev.data,curr.data);
                Node newnode = new Node(gcdres);
                prev.next = newnode;
                newnode.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch(choice) {
                case 1 : System.out.println("Enter the element");
                         int element = sc.nextInt();
                         create(element);
                         break;
                case 2 : display();
                         break;
                case 3 : Node result = insertGreatestCommonDivisors();
                         break;
                case 4 : System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }
}
