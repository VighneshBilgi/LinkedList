package com.bridgelabz.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void sorting()
    {

        Node<T> current = head;
        Node<T>  index = null;

        T temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if ( current.data.compareTo(index.data) >0 ) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display(){
        Node<T> temp = head;

        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

}
