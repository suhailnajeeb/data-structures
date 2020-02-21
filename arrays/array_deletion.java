// You are given an integer array A and a number m. Delete any value from array A if the value is divisible by m.


class array_deletion{
    public static void main(String args[]){
		int[] x = new int[20];

        for (int i = 0; i < 20; i++)
            x[i] = i;
        
        delete(x, 2);

        printArray(x);

    }
    public static int[] delete(int A[], int m){
        for (int i = 0; i < 20; i++){
            if(A[i]%2 == 0)
                remove(A, A.length, i);
        }
        return A;
    }

    public static void printArray(int A[]){
		for (int x : A)
			System.out.println(x);
    }
    
    public static void remove(int A[], int size, int index){
        for (int i = index + 1; i < size; i++)
            A[i-1] = A[i];
        A[size - 1] = 0;
    }

}