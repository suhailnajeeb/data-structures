
import java.lang.Math;

public class array_problems{

    public static void main(String args[]){
		//int[] A = new int[] {1,2,2,5,8};
		//int[] B = new int[] {1,3,4,6,8};
		
			
		//int[] C = Union(A, B);
		//int[] D = Union(A, B);
		
		//int[] E = Sort(D);
		//printArray(E);
		
		//int[] A = new int[] {1,3,5,7};
		//int[] B = new int[] {2,4,6,8};
		
		
		//int[] A = new int[] {1,4,7,9,12,15,17};		
		//int[] B = SortedInsertion2(A, A.length, 10);
		
		//int[] A = new int[] {1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4};
		
		//Frequency(A);
		
		//int[] A = new int[] {1, 9, 12, 17, 3, 21, 14, 11};
		//System.out.println(SecondMax(A));
		
		//int[] A = new int[] {2,5,2,3,9,7,11};
		//System.out.println(Median(A));
		
		int[] A = new int[] {1,3,5,7,8,9,10,12};
		int[] B = new int[] {2,4,6,11};
		
		int[] C = mergeSorted(A,B);
		printArray(C);
				
		       
    }
	
	public static int[] mergeSorted(int A[], int B[]){
		int lenA = A.length;
		int lenB = B.length;
		
		int[] C = new int[lenA + lenB];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < lenA && j < lenB){
			if(A[i]<B[j])
				C[k++] = A[i++];
			else
				C[k++] = B[j++];
		}
		
		while(i < lenA)
			C[k++] = A[i++];
		
		while(i < lenB)
			C[k++] = B[j++];
		
		return C;
		
	}
	
	public static int Median(int A[]){
		int[] sortedArray = Sort(A);
		int n = sortedArray.length;
		return sortedArray[n/2];
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
	
	public static int[] SortedInsertion(int A[], int n, int m){
		
		// Returns the same array with size n
		
		int idx = A.length -1;
		
		for(int i = 0; i<n; i++){
			if(A[i]>m){
				idx = i;
				break;
			}
		}
		
		for(int i = A.length -1; i>idx; i--)
			A[i] = A[i-1];
		
		A[idx] = m;
		
		return A;
	}
	

	public static int[] SortedInsertion2(int A[], int n, int m){
		
		// Returns a different array of size n+1
		
		int[] B = new int[n+1];
		
		int idx = A.length;
	
		for(int i = 0; i<n; i++){
			if(A[i] > m){
				idx = i;
				break;
			}
		}
		
		for(int i = 0; i<idx; i++)
			B[i] = A[i];
		
		B[idx] = m;
		
		for(int i = idx; i<n; i++)
			B[i+1] = A[i];
						
		return B;
	}

	
	public static int[] ZigZag(int A[], int B[]){
		int C[] = new int[A.length+B.length];
		int count = 0;
		
		for(int i = 0; i<A.length; i++){
			C[count++] = A[i];
			C[count++] = B[i];
		}
		
		return C;
		
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



