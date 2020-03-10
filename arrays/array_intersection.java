import java.lang.Math;

class array_intersection{
    public static void main(String args[]){
        int[] A = new int[] {1,2,2,5,8};
        int[] B = new int[] {1,3,4,6,8};
        
        int[] C = Intersection(A, B);
        printArray(C);

    }

	public static int[] Intersection(int A[], int B[]){
		int maxSize = Math.min(A.length, B.length);
		int counter = 0;
		
		int[] accumulator = new int[maxSize];
		
		for(int i:A)
			if(isDuplicated(B, B.length, i))
				accumulator[counter++] = i;
		
		int[] intersection = new int[counter];
		
		for(int i = 0; i<counter; i++)
			intersection[i] = accumulator[i];
		
		return intersection;
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