package data_structures.lists;

//Single Linked List of generic nodes, with a nested class Node. 
//T is the generic type the list will contain.
public class SingleLinkedList<T>{

      //head is the starting node of the list
      private Node<T> head = null;
      //tail is the last node of the list
      private Node<T> tail = null;
      //size counts how many elements the list contains
       private int size = 0;

      //constructors to build the list:one without arguments, one with the head and one with head and tail
      public SingleLinkedList();
      public SingleLinkedList(Node<T> first){
          head = first;
      }
      public SingleLinkedList(Node<T> first, Node<T> last){
          head = first;
          tail = last;
      }

      //method which returns whether the list is empty
      public boolean IsEmpty(){
          return size==0;
      }

     //getter of the list size
      public int Size(){
           return size;
      }




    
    //nested Node class
    class Node<T>{
        //element contained in this node
        private T content;
        //next element in the list (pointer to)
        private Node<T> nextNode;

        //constructor, takes in input the element to store in the node and the pointed next node
        public Node(T element, Node<T> next){
            content = element;
            nextNode = next;
        }

        //element getter
        public T GetElement(){
            return content;
        }

        //getter of next element in the list (pointed by this node)
        public Node<T> getNext(){
            return nextNode;
        }

        //setter of the next element in the list (pointed by this node)
        public void setNext(Node<T> newPointer){
            nextNode = newPointer;
        }
    }
}