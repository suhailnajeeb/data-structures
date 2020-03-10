class circular_array{

    public static void main(String args[]){
        int[] A = new int[] {4,5,1,2,3};
        int[] B = new int[] {3,4,2,5,6};
        //printArray(Union(A,2,B,2));
        //printArray(Intersection(A,2,B,2));
    }

    public static int[] Sort(int A[], int start){

        int n = A.length;
        
        int k = start;
        for(int i = 0; i < n-1; i++){

        }

        return A;
    }

    for( int i = 0, i < index; i ++)
        n = n.next

    public static int[] Intersection(int A[], int startA, int[] B, int startB){
        int maxSize = Math.min(A.length, B.length);
        int counter = 0;

        int[] accumulator = new int[maxSize];

        int j = startA;
        for(int i = 0; i < A.length; i++){
            if(!isDuplicated(accumulator, counter, A[j]))
                if(isDuplicated(B, B.length, A[j]))
                    accumulator[counter++] = A[j];
            j = (j+1)%A.length;
        }

        int[] intersection = new int[counter];

        for(int i = 0; i < counter; i++)
            intersection[i] = accumulator[i];

        return intersection;
    }
    
    public static int[] Union(int A[], int startA, int B[], int startB){
        int maxSize = A.length + B.length;
        int counter = 0;
        int[] accumulator = new int[maxSize];

        int j = startA;
        for(int i = 0; i<A.length; i++){
            if(!isDuplicated(accumulator, counter, A[j]))
                accumulator[counter++] = A[j];
            j = (j+1)%A.length;
        }

        int k = startB;
        for(int i = 0; i<A.length; i++){
            if(!isDuplicated(accumulator, counter, B[k]))
                accumulator[counter++] = B[k];
            k = (k+1)%B.length;
        }
        
        int[] union = new int[counter];

        for(int i = 0; i<counter; i++)
            union[i] = accumulator[i];

        return union;
    }
    


    public static boolean isDuplicated(int[] array, int counter, int value){
		for(int i = 0; i < counter; i++)
			if(array[i] == value)
				return true;
		return false;
	}

    public static void printCircularArray(int[] array, int start){
        int k = start;
        for(int i = 0; i<array.length; i++){
            System.out.println(array[k]);
            k = (k+1)%array.length;
        }
    }

    public static void printArray(int[] array){
		for(int i : array)
			System.out.println(i);
	}

}