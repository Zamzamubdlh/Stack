package com.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private final LinkedList<DataMhs> stack;

    public LinkedStack(){
        stack = new LinkedList<DataMhs>();
    }

    public void push (DataMhs dataMhs){
        stack.push(dataMhs);
    }

    public DataMhs pop(){
        return stack.pop();
    }

    public DataMhs peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        ListIterator<DataMhs> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
