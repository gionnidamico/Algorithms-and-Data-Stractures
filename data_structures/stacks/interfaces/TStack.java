package data_structures.stacks.interfaces;

//interface for a generic stack with common methods to all versions 
public interface Tstack<T>{

     //function which returns the stack size
     public int size();
     //returns whether the stack is empty
     public boolean isEmpty();

     //returns the element at the top of the stack without removing it
     public T top();
     //removes (and returns it) the element at the top of the stack
     public T pop();
     //addes the element 'newElement' to the stack at the top (i.e.: a 'top()' or 'pop()' call will now return this element)
     public void push(newElement);


}