class array_union{
    public static void main(String args[]){
        int[] A = new int[] {1,2,2,5,8};
        int[] B = new int[] {1,3,4,6,8};
        
        int[] C = Union(A, B);
        printArray(C);

    }

	public static int[] Union(int A[], int B[]){
		int maxSize = A.length + B.length;
		int counter = 0;
		int[] accumulator = new int[maxSize];
		
		for(int i : A)
			if(!isDuplicated(accumulator, counter, i))
				accumulator[counter++] = i;
				
		for(int i : B)
			if(!isDuplicated(accumulator, counter, i))
				accumulator[counter++] = i;
		
		int[] union = new int[counter];
		
		for(int i = 0; i < counter; i++)
			union[i] = accumulator[i];
		
		return union;
	}

    public static boolean isDuplicated(int[] array, int counter, int value){
		for(int i = 0; i < counter; i++)
			if(array[i] == value)
				return true;
		return false;
	}

	public static void printArray(int[] array){
		for(int i : array)
			System.out.println(i);
	}
    
}