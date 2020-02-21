// Suppose you are given an array A of size n. And an integer x. Now determine the following value: 
// value = A[0] + A[1]*x + A[2]*x^2 + ... + A[n-1]*x^(n-1)

import java.lang.Math;

class array_polynomial{
    public static void main(String args[]){
        int[] x = new int[5];

        for (int i = 0; i < 5; i++)
            x[i] = i;

        System.out.println(polynomial(x, 2));
    }

    public static int polynomial(int A[], int x){
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum = sum + (int) evalTerm(A[i], x, i);
        }
        return sum;
    }

    public static double evalTerm(int A, int x, int n){
        return A*Math.pow(x,n);
    }

    public static void printArray(int A[]){
		for (int x : A)
			System.out.println(x);
    }

}