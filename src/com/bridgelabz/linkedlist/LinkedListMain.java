package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program");
        System.out.println();

        System.out.println("Adding elements into list");
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Displaying the list of elements :");
        linkedList.display();
        System.out.println();

        System.out.println("Appending elements into list");
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        System.out.println("Displaying the list of elements :");
        linkedList1.display();
        System.out.println();

        System.out.println("Inserting an element into list:");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.push(56);
        linkedList2.push(70);
        System.out.println("Before insertion: ");
        linkedList2.display();
        linkedList2.insert(30);
        System.out.println("After insertion: ");
        linkedList2.display();
        System.out.println();

        System.out.println("Popping first element from the list:");
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.push(70);
        linkedList3.push(30);
        linkedList3.push(56);
        System.out.println("Before Popping: ");
        linkedList3.display();
        linkedList3.pop();
        System.out.println("After Popping: ");
        linkedList3.display();
        System.out.println();

        System.out.println("Popping last element from the list:");
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.push(70);
        linkedList4.push(30);
        linkedList4.push(56);
        System.out.println("Before PopLast: ");
        linkedList4.display();
        linkedList4.popLast();
        System.out.println("After PopLast: ");
        linkedList4.display();
        System.out.println();

        LinkedList <Integer> linkedList5 = new LinkedList<>();
        linkedList5.push(70);
        linkedList5.push(30);
        linkedList5.push(56);
        System.out.println("Searching for 30 in the list:");

        if(linkedList3.search(30))
        {
            System.out.println("Element exists in the list");
        }
        else System.out.println("Element doesn't exist in the list");
        System.out.println();



    }
}
