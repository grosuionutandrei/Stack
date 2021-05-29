package com.company.StackImplementation;
public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack();
        stack.push("Ana");
        stack.push("Maria");

        System.out.println();
        System.out.println(stack);
        System.out.println(stack.getStackMemory().size());
        System.out.println();
        stack.pop();
        System.out.println();

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.getStackMemory().size());
        System.out.println(stack.isEmpty());
        stack.push("Ana");
        stack.push("Maria");

        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains("Ana"));
        System.out.println(stack.contains("Ion"));




    }
}
