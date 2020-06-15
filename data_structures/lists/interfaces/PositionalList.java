package data_structures.lists.interfaces;
import data_structures.lists.interfaces.Position;

//standard interface for a Positional List (extends iterable interface)
public interface PositionalList<T> extends Iterable<T>{

    //returns the number of elements in the list
    public int size();
    //returns whether the list is empty
    public boolean isEmpty();

    //returns the first element in the list
    public Position<T> first();
    //returns the last element in the list
    public Position<T> last();
    //returns the element before the 'element' parameter; throws an exception if the position considered is not valid
    public Position<T> elementBefore(Position<T> element) throws IllegalArgumentException;
     //returns the element after the 'element' parameter; throws an exception if the position considered is not valid
    public Position<T> elementAfter(Position<T> element) throws IllegalArgumentException;

    //adds as the first element of the list the 'newElement' parameter
    public Position<T> addAsFirst(T newElement);
     //adds as the last element of the list the 'newElement' parameter
    public Position<T> addAsLast(T newElement);

    //adds a new element 'newElement' after a specified element 'element'; throws an exception if the Position is not valid
    public void addAfter(Position<T> element, T newElement) throws IllegalArgumentException;
    //adds a new element 'newElement' before a specified element 'element'; throws an exception if the Position is not valid
    public void addBefore(Position<T> element, T newElement) throws IllegalArgumentException;

    //setter of a position 'position' of the list as 'newElement'; throws an exception if the position is not valid
    public void set(Position<T> position, T newElement) throws IllegalArgumentException;
    //removes and returns the element at a Position 'position' in the list
    public T remove(Position<T> position) throws IllegalArgumentException;

    //methods used to get an Iterable collection;inherited from Iterable interface
    public Iterable<Position<T>> positions;
    public Iterator<T> iterator();


}