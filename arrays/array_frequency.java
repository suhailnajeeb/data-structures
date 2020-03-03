class array_frequency{
    public static void main(String args[]){
		int[] A = new int[] {1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4};
		Frequency(A);
    }

    public static void Frequency(int A[]){
		// lets create an array of only the unique numbers:
			
		int maxSize = A.length;
		int[] accumulator = new int[maxSize];
		int counter = 0;
		
		for (int i: A)
			if(!isDuplicated(accumulator, counter, i))
				accumulator[counter++] = i;
		
		int[] unique = new int[counter];
		
		for(int i = 0; i<counter; i++)
			unique[i] = accumulator[i];
		
		for(int i: unique)
			System.out.println("Frequency of the element " + i + " : " + countElement(A,i));

	}
	
	public static int countElement(int A[], int x){
		int count = 0;
		for( int i : A)
			if(i == x)
				count++;
		return count;
    }
    
    public static boolean isDuplicated(int[] array, int counter, int value){
		for(int i = 0; i < counter; i++)
			if(array[i] == value)
				return true;
		return false;
	}
}