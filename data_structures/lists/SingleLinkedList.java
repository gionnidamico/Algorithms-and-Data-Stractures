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

      //getter of the head of the list
      public Node<T> getHead(){
          return head;
      }

      //getter of the tail of the list
      public Node<T> getTail(){
          return tail;
      }


      //add a specified node at the head of the list
      public void addAtHead(T newHeadElement){
            Node<T> temp = new Node<T>(newHeadElement, head);       //creates a new node to contain the element
            head = temp;                                            //allocates the head

            if (IsEmpty())                                          //if the list was empty, the new node is both the head and the tail
                tail = head;
            
            size++;                                                 //updates the size attribute 
            
      }


      //add a specified node at the tail of the list
      public void addAtTail(T newTailElement){
          Node<T> temp = new Node<T>(newTailElement, null);         //allocates the node to contain the new element

          if (IsEmpty())                                            //if the list is empty,  the only node is the head too
                head = temp;
          else
                tail.setNext(temp);                                 //if not, set the dependencies (ex-last element points to the new tail)

          tail = temp;                                              //anyway, update the tail to be the new node
                       
          size++;                                                   //updates the size attribute
      }


    //removes the head node and returns it
    public T removeHead(){
        if (IsEmpty())                                              //if the list is empty there is nothing to remove
            return null;
        
        Node<T> temp = head.GetElement();                           //stores the head element (will be retrieved at the end of the function)
        head = head.getNext();                                      //updates the head of the list

        size--;                                                     //updates the size attribute

        if (IsEmpty())                                              //if the list is now empty(there was a single element in the list) remember to deallocate the tail pointer (aka delete tail reference)
            tail = null;

        return temp;                                                //as described, returns the ex head 
        

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