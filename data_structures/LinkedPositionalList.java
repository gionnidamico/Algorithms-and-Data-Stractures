package data_structures.lists;
import data_structures.interfaces.*;

//positional list implemented with the logic of a doublylinked list (from interface)
public class LinkedPositionalList<T> implements PositionalList<T>{



    //inner class Node which usesthe Position interface as a base
    private class Node<T> implements Position<T>{

                //stores the element of the T type
                private T element;
                //pointer to the next node
                private Node<T> nextNode;
                //pointer to the previous node
                private Node<T> previousNode;


                //constructor which just fills the parameters of the Node
                public Node(T newElement, Node<T> next, Node<T> previous){
                    element = newElement;
                    nextNode = next;
                    previousNode = previous;
                }

                //getter of the element contained in the node; conventionally, a 'null' element is a flag to an invalid position
                public T getElement() throws IllegalStateException{
                    if (element == null)                                //if the element is null and therefore the position invalid, throws an Exception 
                        throw new IllegalStateException();
                    else
                        return element;                                 //else, simply returns the element
                }

                //setter of the element contained in the node
                public void setElement(T newElement){
                    element = newElement;
                }

                //getter of the node after this
                public Node<T> getNext(){
                    return nextNode;
                }

                //setter of the node after thus
                public void setNext(Node<T> newNext){
                    nextNode = newNext;
                }

                //getter of the node before this
                public Node<T> getPrevious(){
                    return previousNode;
                }

                //setter of the node before this
                public void setPrevious(Node<T> newPrevious){
                    previousNode = newPrevious;
                }

    }

    //inner class used as Iterator object of the class;it implements Iterator interface, it has three methods: next(), hasNext(), remove()
    private class PositionIterator<T> implements Iterator<T>{
        
        //this variable stores the Position of the element of the list like a cursor;obvously it starts at the first element of the list
        private Position<T> cursor = first();
        //this variable stores the most recent Position analyzed
        private Position<T> currentNode = null;

        //returns whether the list is terminated or not (if the cursor points to null it means it's the last element on the list)
        public boolean hasNext(){   
            return (!cursor == null);
        }

        //used to update the list pointers and return the current element pointed 
        public Position<T> next() throws NoSuchElementException{
            if (cursor == null){
                throw new NoSuchElementException();                     //if the list is ended there is no element after the current one
            }
            else{
                currentNode = cursor;                                   //updates the current node pointer
                cursor = cursor.getNext();                              //updates the cursor to point at the next Position (Node)     
            }

            return currentNode;                                         //returns the current node pointed

        }

        //inner class of the inner class;used in sinergy with PositionIterator to make the list an Iterable collection
        private class PositionIterable<T> implements Iterable<T>{
                return new PositionIterator();
        }
    }
    //iterable object used for rhe for-each construct, is based on returning an instance of the PositionIterator class
    public Iterable<T> positions(){
        return new PositionIterable();
    }


}