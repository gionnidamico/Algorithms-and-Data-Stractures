package data_structures.trees;
import data_structures.trees.interafaces.*;

//class of a generic tree, with each node containing any number of children
public class GenericTree() implements Tree{


        //inner class node, which contains the element at a determined place of the tree
        private class Node implements Position<T>{
                //the element stored in the node
                private T element;
                //the position of the parent node
                private Position<T> parent;
                //a list of the children od this node
                private ArrayList<Position<T>> children;

                //basic constructor
                public Node(T newElement, Node<T> parentNode){
                        element = newElement;
                        parent = parentNode;
                        children = new ArrayList<T>();
                }

                //getter of the element stored in the node
                public T getElement(){
                    return element;
                }
                //getter of the node's parent
                public Node<T> getParent(){
                    return parent;
                }

                //setter of the element stored
                public void setElement(T newElement){
                    element = newElement;
                }
                //setter of the parent
                public void setParent(Node<T> newParent){
                    parent = newParent;
                }
        }
}