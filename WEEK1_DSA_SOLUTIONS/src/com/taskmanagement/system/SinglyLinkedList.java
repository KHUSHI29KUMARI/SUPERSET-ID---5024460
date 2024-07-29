package com.taskmanagement.system;

public class SinglyLinkedList {
    private Node head;

    // Inner class Node
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    // Method to add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to search for a task by ID
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Method to delete a task by ID
    public void deleteTask(String taskId) {
        if (head == null) return;

        // Special case: delete the head node
        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        // If the node to delete is found
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Task not found.");
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Creating tasks
        Task task1 = new Task("T001", "Task 1", "Pending");
        Task task2 = new Task("T002", "Task 2", "In Progress");
        Task task3 = new Task("T003", "Task 3", "Completed");

        // Adding tasks
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Traversing and displaying tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for Task T002:");
        Task found = taskList.searchTask("T002");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting Task T001:");
        taskList.deleteTask("T001");
        System.out.println("Tasks after deletion:");
        taskList.traverseTasks();
    }
}
