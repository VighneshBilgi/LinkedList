package com.bridgelabz.linkedlist;

public class LinkedList<E extends Comparable<E>> {

     Node<E> head;
     Node<E> tail;


    public void push(E data) {
        Node<E> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void display(){
        Node<E> temp = head;

        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public void append(E data){
        Node<E> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insert(E data) {
        Node<E> newNode = new Node<>(data);
        head.next = newNode;
        newNode.next = tail;
    }

    public void pop() {
        E data = head.data;
        head = head.next;
    }

    public void popLast() {
        Node<E> poppedNode = new Node<>(tail.data);
        Node<E> temp = head;
        Node<E> prev = null;
        while (temp.data != null) {
            if (temp.data == tail.data) {
                prev.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public boolean search(E searchData) {
        Node<E> temp = head;
        Node<E> searchedData = null;

        while (temp != null) {
            if (temp.data == searchData) {
                searchedData = temp;
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    public void insertAfter(E searchData,E insertData) {
        Node<E> insertNode=new Node<>(insertData);
        Node<E> searchedNode=new Node<>(searchData);
        Node<E> temp=head;
        while(temp!=null){
            if(temp.data==searchData){
                searchedNode=temp;
                insertNode.next=searchedNode.next;
                searchedNode.next=insertNode;
                break;
            }
            temp=temp.next;
        }
    }

    public void deleteElement(E searchData) {
        Node<E> searchedNode = new Node<>(searchData);
        Node<E> temp = head;
        Node<E> prev = null;
        while (temp != null) {
            if (temp.data == searchedNode.data) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void size(){
        Node<E> temp = head;
        Integer count =0;

        while(temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println("Size of the linked list is: "+ count);
    }




    }
