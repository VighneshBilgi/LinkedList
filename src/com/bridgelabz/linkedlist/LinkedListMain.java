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

        if(linkedList5.search(30))
        {
            System.out.println("Element 30 exists in the list");
            System.out.println("Inserting 40 after 30 in the list");
            linkedList5.insertAfter(30,40);
        }
        else System.out.println("Element 30 doesn't exist in the list");

        linkedList5.display();
        System.out.println();
        System.out.println("Searching for 40 in the list:");

        if(linkedList5.search(40))
        {
            System.out.println("Element 40 exists in the list");
            System.out.println("Deleting 40 from the list");
            linkedList5.deleteElement(40);
        }
        else System.out.println("Element 30 doesn't exist in the list");

        linkedList5.display();
        linkedList5.size();
        System.out.println();

        SortedLinkedList <Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(70);
        sortedLinkedList.add(40);
        sortedLinkedList.add(30);
        sortedLinkedList.add(56);
        System.out.println("Elements of List before sorting:");
        sortedLinkedList.display();
        sortedLinkedList.sorting();
        System.out.println("Elements of List after sorting:");
        sortedLinkedList.display();

    }
}
