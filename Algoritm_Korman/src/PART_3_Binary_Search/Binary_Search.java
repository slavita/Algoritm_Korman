package PART_3_Binary_Search;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        /** CREATING VARIABLES */
        final int n = 15;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }

        /** SORT ARRAY */
        Arrays.sort(A);

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));

        /** CALL SEARCH */
        try {
            System.out.println(Binary_Search(A , 6));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static int Binary_Search(int A[], int x) throws Exception {
        int p = 0;
        int r = A.length;

        while (p <= r){
            int q = (p + r) / 2;
            if(A[q] == x) return q;
            if(A[q] > x) r = q - 1;
            else p = q + 1;

    }
        throw  new Exception("Not Found");
    }
}
