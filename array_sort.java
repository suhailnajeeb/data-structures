class array_sort{
    public static void main(String args[]){
        int[] A = new int[] {2, 3, 1, 5, 6, 7, 4};
        int[] sorted = Sort(A);
        printArray(sorted);
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
	
		
	public static void insertion_sort(int array[]){
		int n = array.length;
		for (int i = 1; i < n; ++i){
			int key = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > key){
				array[j+1] = array[j];
				j = j - 1;
			}
			
			array[j + 1] = key;
		}	
		
	}
	
	public static void bubble_sort(int array[]){
		int n = array.length;
		for (int i = 0; i < n-1; i++)
			for(int j = 0; j < n-i-1; j++)
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
	}
	
	public static void selection_sort(int array[]){
		int n = array.length;
		
		for(int i = 0; i < n-1; i++){
			int min_idx = i;
			for(int j = i+1; j < n; j++)
				if(array[j] < array[min_idx])
					min_idx = j;
		
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
	}

}