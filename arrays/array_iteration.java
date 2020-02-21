// 	Write a function that takes 	an array A and two indices L and R. And it returns the maximum value of the array from index L to R.


public class array_iteration{

    public static void main(String args[]){
		int[] x = new int[10];
		int i = 0;
		while (i<x.length){
			x[i] = i;
			i++;
		}
		
		System.out.println(maximum(x,2,5));
		       
    }
		
	public static int maximum(int A[], int L, int R){
		int max = A[L];
		for (int i = L+1; i<=R; i++){
			if(A[i]>max)
				max = A[i];
		}
		return max;
	}
	
}



