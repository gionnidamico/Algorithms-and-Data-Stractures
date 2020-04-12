package data_structures.lists;

//Single Linked List of generic nodes, with a nested cclass Node. 
//T is the generic type the list will contain.
public class SingleLinkedList<T>{

    //head is the starting node of the list
    private Node<T> head = null;
    //tail is the last node of the list
    private Node<T> tail = null;
    //size counts how many elements the list contains
    private int size = 0;

    //method which returns whether the list is empty
    public Boolean isEmpty(){
        return size==0;
    }




    
    //nested class
    class Node<T>{}
}