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
        public void dequeue() throws IllegalStateException{
                if (isEmpty()){
                        throw new IllegalStateException();                              //if the queue is empty there is nothing to return
                }
                else{
                        //T result = content[frontIndex];
                        frontIndex = (nOfElements + 1) % content.lenght();              //modular arithmetic: given the array of lenght 'content.lenght', we start at 'nOfElements + 1' index (because we consider thge next element) and then with the modulo operator, if this quantity is bigger than the lenght of the array we simply restart at the zero index and select the first available slot as the new front index
                        nOfElements--;                                                  //we have removed an element, so we update the number of them in the queue
                }

        }

        //add an element at the rear of the queue
        public void enqueue(T newElement) throws IllegalStateException{
                if (content.lenght() = nOfElements){
                        throw new IllegalStateException();                                      //if the queue is full we cannot add another element, so an exception is throwm
                }
                else{
                        int rearIndex = (nOfElements + frontIndex) % content.lenght();          //calculates the rear of the queue where the element will be added (in a similiar way we do in dequeue())
                        content[rearIndex] = newElement;                                        //enqueues the new element
                        nOfElements++;                                                          //updates the size of the queue
                }
        }
}