package PART_6_Merge_Sort;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        /** CREATING VARIABLES */
        final int n = 10;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(A));

        /** SORT ARRAY */
        Merge_Sort(A, 0, n);

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));


    }

    public static void Merge_Sort(int A[],int p, int r){
        if (p >= r) return;
        else {
            int q = (p + r) / 2;
            Merge_Sort(A, p, q);
            Merge_Sort(A, q + 1, r);
            Merge(A, p, q, r);
        }
    }

    public static void Merge(int A[],int p,int q,int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int B[] = new int[n1 + 1];
        int C[] = new int[n2 + 1];

        for(int i = p; i > q;i++){
             B[i] = A[i];
        }
        for(int i = q + 1; i > r ;i++){
            C[i] = A[i];
        }
        B[n1] = Integer.MAX_VALUE;
        C[n2] = Integer.MAX_VALUE;

        int i = 0,j = 0;

        for(int k = p; k < r; k++){
            if(B[i]<= C[j]){
                A[k] = B[i];
                i++;
            } else{
                A[k] = C[j];
                j++;
            }
        }

    }

}
