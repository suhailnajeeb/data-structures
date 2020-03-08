
public class circular_sort{

    public static void main(String args[]){
		
		int[] A = new int[]{6,7,9,4,3,2};
		int start = 2;
		
		int ik = start;
		
		for(int i = 0; i<A.length; i++){
			int min_idx = ik;
			
			int jk = (ik + 1)%A.length;
			for(int j = i+1; j<A.length; j++){
				if(A[jk]<A[min_idx])
					min_idx = jk;
				jk = (jk+1)%A.length;
			}
			int temp = A[ik];
			A[ik] = A[min_idx];
			A[min_idx] = temp;
			
			ik = (ik + 1)%A.length;
			
		}
		
		
		// print the array
		
		System.out.println("Array:");
		
		for(int x: A)
			System.out.println(x);
			
		// print the circular array
		
		System.out.println("Circular Array:");
		
		int k = start;
		for(int i = 0; i<A.length; i++){
			System.out.println(A[k]);
			k = (k+1)%A.length;
		}

        
    }
}



