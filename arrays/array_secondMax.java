class array_secondMax{
    public static void main(String args[]){
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

}