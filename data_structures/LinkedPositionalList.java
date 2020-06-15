package data_structures.lists;
import data_structures.interfaces.*;

//positional list implemented with the logic of a doublylinked list (from interface)
public class LinkedPositionalList<T> implements PositionalList<T>{

    //inner class Node which usesthe Position interface as a base
    private class Node<T> implements Position<T>{

    }

    //inner class used as Iterator object of the class
    private class PositionIterator<T> implements Iterator<T>{

        //inner class of the inner class;used in sinergy with PositionIterator to make the list an Iterable collection
        private class PositionIterable<T> implements Iterable<T>{

        }
    }
    //iterable object used for rhe for-each construct, is based on returning an instance of the PositionIterator class
    public Iterable<T> positions(){}


}