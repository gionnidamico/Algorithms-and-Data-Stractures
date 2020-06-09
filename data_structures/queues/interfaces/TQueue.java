package data_structures.queues.interfaces;

//interface containing the common methods of all kind of queues
public interface TQueue<T> {
        //returns the number of the T elements in the queue
        public int size();
        //returns whethet the queue is empty or not
        public boolean isEmpty();

        //returns the first element of the queue (equivalent to the element with bigger priority) without removing it
        public T first();
        //enqueue an element newElement to the rear of the queue, throws an exception if the queue is full
        public T enque(T newElemenr) throws IllegalStateException;
        //removes the first element of the queue 
        public void deque() throws IllegalStateException;
}