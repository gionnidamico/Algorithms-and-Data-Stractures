package data_structures.stacks;
import data_structures.stacks.interfaces;

//implementing a stack class based on the TStack interface, using an array as a base structure
//note that this implementations makes the size of a new stack not changeable during his lifespan
public class ArrayBasedStack<T> implements TStack<T>{

    //data in the stack is stored in this array, but not directly accessible from it
    private T[] dataStored;
    //index of the element at the top of the array;also not accessible from outside the class 
    private int topIndex = -1;                       //-1 flags that the stack is empty, and is therefore initialized so

    //constructor which simply creates space where inserting the elements
    public ArrayBasedStack(int capacity){
        dataStored = (T[]) new Object[capacity];       //creates an array of generic Objects and then downcastes to be an array of T elements be--cause T is a generic    
    }  


    //returns the number of elements stacked in the stack
    public int size(){
        return topIndex + 1;                                   //exploits the rule that arrays start at zero and deduces the stack size (note:it works even for empty ones: -1+1=0)
    }

    //returns whether the stack is empty
    public boolean isEmpty(){
        return topIndex = -1;                                   //by definition, if empty the stack has the 'topIndex' attribute equal to -1
    }


    //returns the top element of the stack without removing it
    public T top(){
        if (isEmpty())
            return null;                            //if the stack is empty, returns null because there are no elements
        else
            return dataStored[topIndex];
    }  

    //removes the top element from the stack and returns it; generates an exception if there aren't elements in the stack
    public T pop() throws IllegalStateException{
        if (isEmpty())
            throw IllegalStateException;                //throws an exception if empty
        else
            return dataStored[topIndex--];              //returns the element at the 'top Index' and updates the pointer of the array; note that the data is not destroyed but simply ignored and put 'outside' the stack bonds  
    }

    //addes a new element to the top of the stack;generates an exception if the stack is full
    public void push(T newElement) throws IllegalStateException{
        if (size() == dataStored.lenght())               //if the size of the stack has already reached the maximum lenght the stack is full, therefore any new attempt to push a new element at the top generates an exception
            throw IllegalStateException;
        else 
            dataStored[++topIndex] = newElement;         //pushes the newElement at the top (previous topIndex+1) and updates the size
    }
} 