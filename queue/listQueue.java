public class listQueue implements Queue{
    Node head;
    int size;

    public listQueue(){
        head = Null;
        size = 0;
    }

    public int size(){
        return size;
    }

    boolean isEmpty() {
        if(size == 0)
            return true;
        else
            return false;
    }

    void enqueue(Object x){
        Node n = new Node(x, null);
        n.next = head;
        head = n;
        size++;
    }

    Object pop() throws QueueUnderflowException{
        if(size > 0){
            Node n = head;
            for(int i = 0; i < size; i++)
                n = n.next;
            Object value = n.val;
            n = null;
            size--;
            return value;
        }
        else throw new QueueUnderflowException();
    }

    Object peek() throws QueueUnderflowException{
        if(size > 0){
            Node n = head;
            for(int i = 0; i < size; i++)
                n = n.next;
            return n.val;
        }
        else throw new QueueUnderflowException();
    }

    String toString(){
        String s = "[";
        for( Node n = head; n != null; n = n.next)
            s = s + " " + n.val;
        s = s + " ]";
        return s;
    }

    Object[] toArray(){
        Node n = head;
        Object[] array = new Object[size];
        for(int i = 0; i < size; i++){
            array[i] = n.val;
            n = n.next;
        }
        return array;
    }

    int search(Object o){
        int offset = 0;
        for(Node n = head; n != null; n = n.next){
            if(o.equals(n.val))
                return offset;
            offset++;
        }
        return -1;
    }

}