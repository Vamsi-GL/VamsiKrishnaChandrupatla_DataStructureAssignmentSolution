package com.greatlearning.skyscraper;

public class QueueImpl {
    private int rear, front, max_size;
    int arr[];

    public QueueImpl(int sizeOfQueue) {
        this.max_size = sizeOfQueue;
        front = rear = -1;
        arr = new int[max_size];
    }

    public boolean isFull() {
        if (rear == max_size - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if (!isFull())
        {
            rear++;
            arr[rear] = data;
            if (front == -1) {
                front = 0;
            }
        }
        else
            System.out.println("Queue Overflow");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return 0;
        } else {
            int data = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else
                front++;
            return data;
        }
    }
}