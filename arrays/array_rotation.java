
// Write a function that takes an array A and an integer n. It rotates an array n times to the right direction and returns it. 

public class array_rotation{

    public static void main(String args[]){
		int[] x = new int[20];

        for (int i = 0; i < 20; i++)
            x[i] = i;
		
		rotate(x, 5);
		
		printArray(x);
		       
    }
	
	public static void printArray(int A[]){
		for (int x : A)
			System.out.println(x);
	}
		
	public static void rotateRight(int array[]){
		int lastElement = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--)
			array[i] = array[i-1];
		array[0] = lastElement;
	}
	
	public static int[] rotate(int A[], int n){
		for (int i = 0; i < n; i++)
			rotateRight(A)	;
		return A;
	}
		
}



