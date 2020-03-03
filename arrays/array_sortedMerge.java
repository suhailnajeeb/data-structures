class array_sortedMerge{
    public static void main(String args[]){
        int[] A = new int[] {1,3,5,7,8,9,10,12};
		int[] B = new int[] {2,4,6,11};
		
		int[] C = mergeSorted(A,B);
		printArray(C);
    }

	public static int[] mergeSorted(int A[], int B[]){
		int lenA = A.length;
		int lenB = B.length;
		
		int[] C = new int[lenA + lenB];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < lenA && j < lenB){
			if(A[i]<B[j])
				C[k++] = A[i++];
			else
				C[k++] = B[j++];
		}
		
		while(i < lenA)
			C[k++] = A[i++];
		
		while(i < lenB)
			C[k++] = B[j++];
		
		return C;
		
    }
    
	public static void printArray(int[] array){
		for(int i : array)
			System.out.println(i);
	}
}