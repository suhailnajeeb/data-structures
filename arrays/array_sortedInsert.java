class array_sortedInsert{
    public static void main(String args[]){
		int[] A = new int[] {1,4,7,9,12,15,17};		
        int[] B = SortedInsertion2(A, A.length, 10);
        printArray(B);
    }

	public static int[] SortedInsertion(int A[], int n, int m){
		
		// Returns the same array with size n
		
		int idx = A.length -1;
		
		for(int i = 0; i<n; i++){
			if(A[i]>m){
				idx = i;
				break;
			}
		}
		
		for(int i = A.length -1; i>idx; i--)
			A[i] = A[i-1];
		
		A[idx] = m;
		
		return A;
	}
	

	public static int[] SortedInsertion2(int A[], int n, int m){
		
		// Returns a different array of size n+1
		
		int[] B = new int[n+1];
		
		int idx = A.length;
	
		for(int i = 0; i<n; i++){
			if(A[i] > m){
				idx = i;
				break;
			}
		}
		
		for(int i = 0; i<idx; i++)
			B[i] = A[i];
		
		B[idx] = m;
		
		for(int i = idx; i<n; i++)
			B[i+1] = A[i];
						
		return B;
	}


    public static void printArray(int[] array){
		for(int i : array)
			System.out.println(i);
	}
}