import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static HashMap<String, List<Integer>> map = new HashMap<>();
    public static List<Integer> computeresult(String expression) {
        if(map.containsKey(expression)) {
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        if(!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            result.add(Integer.parseInt(expression));
            return result;
        }
        for(int i=0;i<expression.length();i++) {
            System.out.println("index->" +i);
            char current = expression.charAt(i);
            if(current=='-' || current=='+' || current=='*') {
                List<Integer> left = computeresult(expression.substring(0,i));
                System.out.println("left result:" +left);
                List<Integer> right = computeresult(expression.substring(i+1));
                System.out.println("right result:" +right);
                
                for(int leftno : left) {
                    for(int rightno : right) {
                        if(current == '+') {
                            result.add(leftno+rightno);
                        }
                        else if(current == '-') {
                            result.add(leftno-rightno);
                        }
                        else if(current == '*') {
                            result.add(leftno*rightno);
                        }
                    }
                }
            }
        }
        map.put(expression,result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        List<Integer> results = computeresult(expression);
        System.out.println(results);
    }
}
