package PART_4_Selection_Sort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        /** CREATING VARIABLES */
        final int n = 15;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(A));

        /** SORT ARRAY */
        Selection_Sort(A, n);

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));


    }

    public static void Selection_Sort(int[] A, int n){
        for(int i = 0; i < n; i++){
            int smallest = i;
            for (int j =  i; j < n; j++){
                if(A[j] <= A[smallest]){
                    int temp = A[j];
                    A[j] = A[smallest];
                    A[smallest] = temp;
                }
            }
        }

    }
}
