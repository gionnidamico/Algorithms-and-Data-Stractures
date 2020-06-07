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
        dataStored = T[] new Object[capacity];       //creates an array of generic Objects and then downcastes to be an array of T elements be--cause T is a generic    
    }  


    //returns the number of elements stacked in the stack
    public int size(){
        return topIndex + 1;                                   //exploits the rule that arrays start at zero and deduces the stack size (note:it works even for empty ones: -1+1=0)
    }

    //returns whether the stack is empty
    public boolean isEmpty(){
        return topIndex = -1;                                   //by definition, if empty the stack has the 'topIndex' attribute equal to -1
    }

    
} 