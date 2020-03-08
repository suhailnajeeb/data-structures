
public class linked_sort{

    public static void main(String args[]){
		
		int[] A = new int[] {3,7,4,8,5};
		
		// Array to linked list conversion
		
		Node head = new Node(A[0],null);
		
		Node oldNode = head;
		
		for(int i = 1; i < A.length; i++){
			Node newNode = new Node(A[i],null);
			oldNode.next = newNode;
			oldNode = newNode;
		}
		
		// Sorting the linked list
		
		for(Node a = head; a!= null; a = a.next){
			Node min_node = a;
			for(Node b = a.next; b!= null; b = b.next){
				if(b.element < min_node.element)
					min_node = b;
			
			int temp = a.element;
			a.element = min_node.element;
			min_node.element = temp;
			
			}
		}
		
		
		// Printing the sorted linked list
		
				
		for(Node n = head; n!=null; n = n.next)
			System.out.println(n.element);

        
    }
	
	
	
}

class Node{
	int element;
	Node next;
	
	public Node(int e, Node n){
		element = e;
		next = n;
	}
}


