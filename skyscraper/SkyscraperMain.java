package com.greatlearning.skyscraper;

import java.util.Scanner;

public class SkyscraperMain {
    static int totalNumberOfFloors;
    public static void main(String[] args)
    {
        OrderOfConstruction driver = new OrderOfConstruction();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of floors in the building:");
        totalNumberOfFloors = sc.nextInt();

        //Using queue to store the floor sizes given on each day
        QueueImpl queue = new QueueImpl(totalNumberOfFloors);

        for (int i = 0; i < totalNumberOfFloors; i++) {
            System.out.println("Enter the floor size given on day: " + (i + 1));
            queue.enqueue(sc.nextInt());
        }

        StackImpl stack = new StackImpl(totalNumberOfFloors);
        int target = totalNumberOfFloors;

        System.out.println("The order of construction is as follows: ");
        driver.orderOfConstruction(queue,target,stack);
        sc.close();
    }
}
