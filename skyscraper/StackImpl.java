package com.greatlearning.skyscraper;

public class StackImpl
{
    static int size_of_stack;
    int current_pointer;
    int a[];

    StackImpl(int max_size)
    {
        this.size_of_stack = max_size;
        current_pointer = -1;
        a = new int[size_of_stack];
    }

    public boolean isEmpty(){
        if(current_pointer == -1)
            return true;
        return false;
    }
    boolean push(int data)
    {
        if(current_pointer >= size_of_stack-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++current_pointer] = data;
            return true;
        }
    }

    int pop()
    {
        if(current_pointer < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int data = a[current_pointer--];
            return data;
        }
    }

    void printStack()
    {
        for(int i=current_pointer;i>=0;i++){
            System.out.println(" " + a[i]);
        }
    }
}
