package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();
        int id = 1;
        System.out.println("TO_DO");
        System.out.println("\n1. Add a task");
        System.out.println("2. Show all tasks");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\nEnter the name of the task: ");
                String task = in.nextLine();
                map.put(id, task);
                System.out.println("\nEnter the id of the task: " + id);
                id++;
            case 2:
                if (map.isEmpty()) {
                    System.out.println("No task yet ");
                } else {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }
            case 3:
                System.out.println("Goodbye!");
                return;
        }


    }

    }
