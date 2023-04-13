package thetestingacademy.collections.list;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 =  sc.nextLine();
        char[] ch = s1.toCharArray();

        stack.push(String.valueOf(ch[0]));
        stack.push(String.valueOf(ch[1]));
        stack.push(String.valueOf(ch[2]));

        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());

        // ABC -> CBA - Stack - Reverse with the forloop extra, Collection Framework
        // Stack Legacy to do it.




        // EmptyStack Exception
        //String Q = stack.pop();
        //System.out.println(Q);







    }
}
