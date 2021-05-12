package com.zhouhao;

/**
 * See Also:MyStack
 */
public class Question01 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int top = myStack.top();// 返回 2
        System.out.println(top);
        int pop = myStack.pop();// 返回 2
        System.out.println(pop);
        boolean empty = myStack.empty();// 返回 False
        System.out.println(empty);

    }
}
