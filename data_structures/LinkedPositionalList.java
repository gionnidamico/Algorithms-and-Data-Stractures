package data_structures.lists;
import data_structures.interfaces.*;

//positional list implemented with the logic of a doublylinked list (from interface)
public class LinkedPositionalList<T> implements PositionalList<T>{

    //inner class Node which usesthe Position interface as a base
    private class Node<T> implements Position<T>{

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
                currentNode = cursor;                                   //update the current node pointer
                cursor = cursor.next() //to fix     
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