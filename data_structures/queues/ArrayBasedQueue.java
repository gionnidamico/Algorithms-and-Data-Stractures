package data_structures.queues;
import data_structures.queues.interfaces;

//implementing a queue using an array as a support structure
public class ArrayBasedQueue<T> implements TQueue<T>{

        //this is the array used as a base structure for the queue
        public T[] content;
        //counts the number of elements currently in the queue
        public int nOfElements = 0;
        //index of the current element at the front of the queue
        public int frontIndex = 0;
       

        //constructor which creates a new array-based queue with the max size of 'capacity'
        public ArrayBasedQueue(int capacity){
                content = (T[]) new Object[capacity];
        }

        //returns the number of elements that are currently in the queue(aka:getter of the queue size)
        public int size(){
                return nOfElements;
        }

        //returns whether the queue is empty
        public boolean isEmpty(){
                return (nOfElements == 0);
        }

        
        //returns the element at the front of the queue without removing it
        public T first(){
                if (isEmpty())
                        return null;                            //if the queue is empty there are no elements to return
                else 
                        return content[frontIndex];
        }

        //removes the element at the front of the queue
       // public void dequeue()
}