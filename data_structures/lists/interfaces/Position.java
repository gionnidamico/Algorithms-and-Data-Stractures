package data_structures.interfaces;

//this is the core of the nodes wrapping the T elements in the Positional List
public interface Position<T>{
    //returns the element stored, and throws an error if the position is not valid (or not valid anymore)
    public T getElement() throws IllegalStateException;
}