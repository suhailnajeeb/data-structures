public interface Queue{
    int size();
    boolean isEmpty();
    void enqueue(Object o) throws QueueOverflowException;
    Object pop() throws QueueUnderflowException;
    Object peek() throws QueueUnderflowException;
    String toString();
    Object[] toArray();
    int search(Object o);
}
