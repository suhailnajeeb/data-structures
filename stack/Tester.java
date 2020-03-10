import java.util.Scanner;
public class Tester{
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);

        Stack stack;

        stack = new ListStack();

        for(int x = 1; x <=12 ; x+=2){
            try{
                stack.push(x);
            } catch(StackOverflowException e){
                System.err.println("Stack Full\n" + e);
            }
        }

        System.out.println("toString Output: " + stack.toString());
        Object[] array = stack.toArray();

        for(int i = 0; i<array.length; i++)
            System.out.println("=> " + array[i]);
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Distance of '1' from the top: " + stack.search(1));
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Distance of '1' from the top: " + stack.search(1));

        array = stack.toArray();
        for(int i = 0; i<array.length; i++)
            System.out.println("=>" + array[i]);

        try{
            System.out.println("Peeked: " + stack.peek());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        System.out.println("toString Output: " + stack.toString());
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        try{
            System.out.println("Popped: " + stack.pop());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        try{
            System.out.println("Peeked: " + stack.peek());
        } catch(StackUnderflowException e){
            System.err.println("Stack Empty\n" + e);
        }
        array = stack.toArray();
        for(int i = 0; i<array.length; i++)
            System.out.println("=>" + array[i]);
        System.out.println("toString Output: " + stack.toString());
        System.out.println("size: " + stack.size());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Disstance of '1' from the top: " + stack.search(1));


    }
}