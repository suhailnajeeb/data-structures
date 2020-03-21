public class circularQueue implements Queue{
    int front;
    int size;
    int capacity = 100;

    int[] data;

    public circularQueue(){
        data = new int[capacity];
        front = 0;
        size = 0;
    }

    public int size(){
        return size;
    }

    boolean isEmpty(){
        if(size == 0)
            return true;
        else
            return false;
    }

    void enqueue(int x) throws QueueOverflowException{
        if(size == capacity)
            throw new QueueOverflowException();
        else{
            data[(front + size)%capacity] = x;
            size = (size + 1)%capacity;
        }
    }

    int pop() throws QueueUnderflowException{
        if(size > 0){
            int x = data[front];
            data[front] = 0;
            front++;
            return x;
        }
        else
            throw new QueueUnderflowException();
    }

    int peek() throws QueueUnderflowException{
        if(size > 0){
            int x = data[front];
            return x;
        }
        else
            throw new QueueUnderflowException();
    }

    String toString(){
        String s = "[";
        int j = front;
        for(int i = 0; i < size; i++){
            s = s + " " + data[j];
            j = (j+1)%capacity;
        }
        s = s + " ]";
        return s;
    }

    int[] toArray(){
        int[] array = new int[size];
        int j = front;
        for(int i = 0; i < size; i++){
            array[i] = data[j];
            j = (j+1)%capacity;
        }
    }

    int search(int x){
        int index = 0;
        int j = front;
        for(int i = 0; i < size; i++){
            if(x == data[j])
                return j;
            j = (j+1)%capacity;
        }
        return -1;
    }
    
}