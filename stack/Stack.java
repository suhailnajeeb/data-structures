public interface Stack{
    public int size();
    public boolean isEmpty();
    public void push(Object e) throws StackOverflowException;
    public Object pop() throws StackUnderflowException;
    public Object peek() throws StackUnderflowException;
    public String toString();
    public Object[] toArray();
    public int search(Object e);
}