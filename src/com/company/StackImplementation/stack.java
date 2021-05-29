package com.company.StackImplementation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Stack<T> {
    private int head;
    private List<T> stackMemory;
    public Stack() {
        stackMemory = new LinkedList();
        head = -1;
    }
    public void push(T t) {
        ++head;
        stackMemory.add(t);
    }
    public T pop() {
        T t = stackMemory.get(head);
        stackMemory.remove(head);
        --head;
        return t;
    }
    public boolean isEmpty() {
        if (stackMemory.size() == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        for (Object obj : stackMemory) {
            if (obj.hashCode() == o.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public List getStackMemory() {
        return stackMemory;
    }

    public void setStackMemory(List stackMemory) {
        this.stackMemory = stackMemory;
    }

    @Override
    public String toString() {
        return "Atack{" +
                "stackMemory=" + stackMemory +
                '}';
    }

}

