package PART_2_Factorial;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
//       System.out.println( _Factorial(5));
//       System.out.println( Bad_Factorial(1));

        /** CREATING VARIABLES */
        final int n = 2;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));

        /** CALL SEARCH */
        try {
            System.out.println(Recursive_Linear_Search(A , n, 0,  9));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    private static int _Factorial(int n){
        if(n == 0) return 1;
        else  return n*_Factorial(n - 1);
    }

    private static int Bad_Factorial(int n){
        if(n == 0) return 1;
        else  return Bad_Factorial(n + 1)/( n + 1);
    }

    private static int Recursive_Linear_Search(int A[], int n, int i, int x) throws Exception {
        if(i >= n) throw new Exception("Not Found");
        else if(A[i] == x) return i;
        else return Recursive_Linear_Search(A, n, i+1, x);
    }
}
