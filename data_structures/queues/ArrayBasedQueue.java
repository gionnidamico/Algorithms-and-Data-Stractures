package data_structures.queues;
import data_structures.queues.interfaces;

//implementing a queue using an array as a support structure
public class ArrayBasedQueue<T> implements TQueue<T>{

        //counts the number of elements currently in the queue
        public int nOfElements = 0;
        //this is the array used as a base structure for the queue
        public T[] content;

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
}