public class ListStack implements Stack{
    int size;
    Node top;

    public ListStack(){
        size = 0;
        top = null;
    }

    /*
    The number of items on the stack.
    */

    public int size(){
        int len = 0;
        for(Node n = top; n != null; n = n.next)
            len++;
        return len;
    }

    /*
    Returns true if the stack is empty.
    */

    public boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }

    /*
    Pushes the new item on the stack, throwing the
    StackOverflowException if the stack is at maximum capacity.
    It does not throw an exception for an "unbounded" stack, which
    dynamically adjusts capacity as needed.
    */

    public void push(Object e) {
        Node n = new Node(e, null);
        n.next = top;
        top = n;
        size++;

        // Since the stack is based on an unbounded linked list,
        // invoking an exception is unnecessary here. 

    }

    /*
    Pops the item on the top of the stack, throwing the
    StackUnderflowException if the stack is empty.
    */

    public Object pop() throws StackUnderflowException {
        if(size > 0){
            Object value = top.val;
            top = top.next;
            size--;
            return value;
        }
        else throw new StackUnderflowException();
    }

    /*
    Peeks at the item on the top of the stack, throwing
    StackUnderflowExcepion if the stack is empty.
    */

    public Object peek() throws StackUnderflowException {
        if(size > 0){
            Object value = top.val;
            return value;
        }
        else throw new StackUnderflowException();
    }

    /*
    Returns a textual representation of items on the stack, in the
    format "[ x y z ]", where x and z are items on top and bottom
    of the stack respectively. 
    */

    public String toString(){
        String s = "";
        for( Node n = top; n != null; n = n.next)
            s = s + " " + n.val;
        s = "[" + s + "]";
        return s;
    }

    /*
    Returns an array with items on the stack, with the item on top
    of the stack in the first slot, and bottom in the last slot
    */

    public Object[] toArray(){
        Node n = top;
        Object[] array = new Object[size];
        for(int i = 0; i < size; i++){
            array[i] = n.val;
            n = n.next;
        }
        return array;
    }

    /* 
    Searches for the given item on the stack, returning the
    offset from top of the stack if item is found, or -1 otherwise.
    */
    public int search(Object e){
        int offset = 0;
        for( Node n = top; n!= null; n = n.next){
            if(e.equals(n.val))
                return offset;
            offset++;
        }
        return -1;
    }


}