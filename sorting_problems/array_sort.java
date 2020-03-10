
public class array_sort{

    public static void main(String args[]){
		
		int[] A = new int[] {5,7,3,4,8,9};
		
		for( int i = 0; i< A.length; i++){
			int min_idx = i;
			
			for (int j = i+1; j<A.length; j++)
				if(A[j]<A[min_idx])
					min_idx = j;
			
			int temp = A[i];
			A[i] = A[min_idx];
			A[min_idx] = temp;
			
		}
		
		for(int i = 0; i < A.length; i++)
			System.out.println(A[i]);
	

        
    }
}



