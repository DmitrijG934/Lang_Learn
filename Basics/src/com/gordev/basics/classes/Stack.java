package com.gordev.basics.classes;

import java.util.Arrays;
import java.util.Random;

class Stack {

    private int[] stack = new int[10];
    private int topOfStack;

    private Stack() {
        topOfStack = -1;
    }

    private void push(int val) {
        if(topOfStack == 9)
            System.out.println("Stack Overflow!");
        else
            stack[++topOfStack] = val;
    }

    private int pop() {
        if(topOfStack < 0) {
            System.out.println("Stack isn\'t overflowed!");
            return 0;
        } else {
            return stack[topOfStack--];
        }

    }

    static void start() {

        Stack stack = new Stack();
        Stack stack1 = new Stack();

        for (int i = 0; i < 10; i++) stack.push(i);
        for (int i = 10; i < 20; i++) stack1.push(i);

        System.out.println("Stack 1");
        for (int i = 0; i < 10; i++) System.out.println(stack.pop());
        System.out.println("Stack 2");
        for (int i = 0; i < 10; i++) System.out.println(stack1.pop());

    }

    private static int maximumValueInList(int length) {

        int[] arr = new int[length];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }

        for (int x: arr) {
            System.out.println(x);
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) max = Math.max(max, arr[i]);

        return max;

    }

    private static int minimumValueInList(int length) {
        int[] arr = new int[length];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }

        for (int x: arr) {
            System.out.println(x);
        }

        Arrays.sort(arr);
        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minNumber < arr[i]) minNumber = minNumber;
            else minNumber = arr[i];
        }

        return minNumber;

    }

    public static void main(String[] args) {
        //start();
        int min, x = 1;
        while (x <= 10) {
            min = minimumValueInList(x);
            System.out.println("Min value: " + min);
            x++;
        }
    }

}
