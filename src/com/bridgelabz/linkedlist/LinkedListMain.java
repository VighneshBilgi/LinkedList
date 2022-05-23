package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program");

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Displaying the list of elements :");
        linkedList.display();

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        System.out.println("Displaying the list of elements :");
        linkedList.display();
    }
}
