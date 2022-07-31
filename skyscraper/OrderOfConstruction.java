package com.greatlearning.skyscraper;

public class OrderOfConstruction {
    public void orderOfConstruction(QueueImpl queue, int target, StackImpl stack) {
        for (int i = 0; i < queue.arr.length; i++)
        {
            StackImpl stack1;
            System.out.println("Day " + (i + 1) + ": ");
            int data = queue.dequeue();
            if (target == data)
            {
                System.out.print(data + " ");
                target--;
                stack1 = new StackImpl(stack.a.length);
                while(!stack.isEmpty())
                {
                    data = stack.pop();
                    if(target == data)
                    {
                        System.out.print(data + " ");
                        target--;
                    }
                    else
                    {
                        stack1.push(data);
                    }
                }
                while(!stack1.isEmpty())
                {
                    stack.push(stack1.pop());
                }
            }
            else
            {
                stack.push(data);
            }
            System.out.println("");
        }
    }
}
