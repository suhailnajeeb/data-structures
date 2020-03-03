class array_median{

    public static void main (String args[]){
		int[] A = new int[] {1, 9, 12, 17, 3, 21, 14, 11};
		System.out.println(SecondMax(A));
    }

    public static int Max(int A[]){
		int max = A[0];
		for(int i = 1; i<A.length; i++)
			if(A[i] > max)
				max = A[i];
		return max;
	}
	
	public static int SecondMax(int A[]){
		int max = A[0];
		int max2 = A[0];
		
		for(int i = 1; i<A.length; i++)
			if(A[i] > max){
				max2 = max;
				max = A[i];
		}
		return max2;
    }
    
    public static int[] Sort(int A[]){
		
		int n = A.length;
		
		for(int i = 0; i < n-1; i++){
			
			int min_idx = i;
		
			for (int j = i+1; j<n; j++){
				if(A[j] < A[min_idx])
					min_idx = j;
			}
			
			int temp = A[min_idx];
			A[min_idx] = A[i];
			A[i] = temp;
		}
	
		return A;
	}

}