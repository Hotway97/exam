package Biletreverswhakf;

import java.util.Stack;
import java.lang.System;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] queue = {1, 8, 7, 2, 9, 18, 12, 0};
        Stack<Integer> tempStack = new Stack<Integer>();

        for (int i = 0; i < queue.length; i++) {
            if (i%2 == 1)
                tempStack.add(queue[i]);
        }

        for (int i = 0; i < queue.length; i++) {
            if (i%2 == 1) {
                queue[i] = tempStack.lastElement();
                tempStack.pop();
            }
        }

        System.out.println(Arrays.toString(queue));

    }
}


