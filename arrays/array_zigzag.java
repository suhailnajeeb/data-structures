class array_zigzag{
    public static void main(String args[]){
        int[] A = new int[] {1,3,5,7};
        int[] B = new int[] {2,4,6,8};
        
        printArray(ZigZag(A,B));
    }

	public static int[] ZigZag(int A[], int B[]){
		int C[] = new int[A.length+B.length];
		int count = 0;
		
		for(int i = 0; i<A.length; i++){
			C[count++] = A[i];
			C[count++] = B[i];
		}
		
		return C;
		
    }
    
    public static void printArray(int[] array){
		for(int i : array)
			System.out.println(i);
	}

}