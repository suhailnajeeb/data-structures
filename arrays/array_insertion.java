// You are given a sorted array A and a number m. You are supposed to insert m into the array A such that the array remains sorted.


public class array_insertion{

    public static void main(String args[]){
		int[] x = new int[20];
		int i = 0;
		while (i<10){
			x[i] = i;
			i++;
		}
		
		sortedInsert(x,5);
		printArray(x);
		
    }
	
	public static int[] sortedInsert(int A[], int m){
		int index = A.length;
		for(int i = 0; i<A.length; i++){
			if(A[i]>m){
				index = i;
				break;
			}
		}
		
		for(int i = A.length - 1; i>index; i--)
			A[i] = A[i-1];
		
		A[index] = m;

		return A;
	}
	
	/* This method is broken
	public static void insert(int array[], int elem, int index){
		for (int i = index; i < 10; i++)
			array[i + 1] = array[i];
		array[index] = elem;
	}
	*/
	
	public static void printArray(int A[]){
		for (int x : A)
			System.out.println(x);
	}

}
