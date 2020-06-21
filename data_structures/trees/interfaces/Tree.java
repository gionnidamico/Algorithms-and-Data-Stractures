package data_structures.trees.interfaces;

//Generic interface for any tree data structure (particularly, one with any number of children)
public interface Tree<T>  extends Iterable<T>{

        //the node at level 0
        public Position<T> root;
        //returns the parent of a Node in the tree (null if it's the root)
        public Position<T> parent(Position<T> node) throws IllegalStateException;

        //returns the size of the tree
        public int size();
        //return whether the tree is empty 
        public boolean isEmpty();

        //returns an iterable collection with the node's children
        public Iterable<Position<T>> children(Position<T> node) throws IllegalStateException;
        //returns the number of the children of a defined node
        public int nOfChildren(Position<T> node) throws IllegalStateException;

        //returns whether the node is the root
        public isRoot(Position<T> node);
        //return whether the node is internal (it has children)
        public boolean isInternal(Position<T> node);
        //returns whether the node is a leaf
        public boolean isExternal(Position<T> node);
        
        //methods used to use the tree as an iterable collection
        public Iterable<Position<T>> positions();
        public Iterator<T> iterator();

}