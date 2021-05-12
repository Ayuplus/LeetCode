package com.zhouhao;

import java.util.ArrayList;

/**
 * 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的全部四种操作（push、top、pop 和 empty）。
 *
 * 实现 MyStack 类：
 *
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 *
 *
 * 注意：
 *
 * 你只能使用队列的基本操作 —— 也就是push to back、peek/pop from front、size 和is empty这些操作。
 * 你所使用的语言也许不支持队列。你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列, 只要是标准的队列操作即可。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-stack-using-queues
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MyStack {
    private final ArrayList<Integer> stackFrame = new ArrayList<>();
    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        stackFrame.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(stackFrame.size() != 0) {
            int i = stackFrame.get(stackFrame.size()-1);
            stackFrame.remove(stackFrame.size()-1);
            return i;
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if(stackFrame.size() != 0) return stackFrame.get(stackFrame.size()-1);
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return stackFrame.size() == 0;
    }
}
