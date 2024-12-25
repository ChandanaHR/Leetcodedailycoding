import java.io.*;
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node left,right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Main {
    public static Node insertleft(Node node,int elem) {
        node.left = new Node(elem);
        return node.left;
    }
    public static Node insertright(Node node,int elem) {
        node.right = new Node(elem);
        return node.right;
    }
    public static void display(Node node) {
        Node temp = node;
        Queue<Node> q = new LinkedList<>();
        q.add(temp);
        System.out.print(temp.data+" ");
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr.left!=null) {
                q.add(curr.left);
                System.out.print(curr.left.data+" ");
            }
            if(curr.right!=null) {
                q.add(curr.right);
                System.out.print(curr.right.data+" ");
            }
        }
    }
    public static int cycledecomposition(List<Integer> list) {
        List<Integer> sorted = new ArrayList<>(list);
        System.out.println(sorted);
        Collections.sort(sorted);
        System.out.println(sorted);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sorted.size();i++) {
            map.put(sorted.get(i),i);
        }
        System.out.println(map);
        boolean visited[] = new boolean[sorted.size()];
        int swaps = 0;
        for(int i=0;i<sorted.size();i++) {
            if(visited[i] || map.get(list.get(i))==i) {
                continue;
            }
            int cs = 0;
            int x = i;
            while(!visited[x]) {
                visited[x] = true;
                x = map.get(list.get(x));
                cs++;
            }
            if(cs>1) {
                swaps+=cs-1;
            }
        }
        return swaps;
    }
    public static void displaylevel(Node root) {
        int sum = 0;
        Queue<Node> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for(int i=qu.size();i>0;i--) {
                Node current = qu.remove();
                list.add(current.data);
                if(current.left != null) {
                    qu.add(current.left);
                }
                if(current.right != null) {
                    qu.add(current.right);
                }
            }
            int val = cycledecomposition(list);
            System.out.println(val);
            sum = sum+val;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of root data");
        int rootdata = sc.nextInt();
        Node root = new Node(rootdata);
        insertleft(root,4);
        insertright(root,3);
        insertleft(root.left,7);
        insertright(root.left,6);
        insertleft(root.right,8);
        insertright(root.right,5);
        insertleft(root.right.left,9);
        insertleft(root.right.right,10);
        
        display(root);
        displaylevel(root);
    }
}
