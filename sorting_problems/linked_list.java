
public class linked_list{

    public static void main(String args[]){
		
		Node head = new Node("head", null);
		
		/*
		Node n1 = new Node("node1", null);
		head.next = n1;
				
		Node n2 = new Node("node2", null);
		n1.next = n2;
		*/
		Node oldNode = head;
		
		for(int i = 0; i < 5; i++){
			Node newNode = new Node("node" + i, null);
			oldNode.next = newNode;
			oldNode = newNode;
		}
		
		for(Node n = head; n!= null; n = n.next)
			System.out.println(n.element);
        
    }
}

class Node{
	public Object element;
	public Node next;
	
	public Node(Object e, Node n){
		element = e;
		next = n;
	}
	
}



