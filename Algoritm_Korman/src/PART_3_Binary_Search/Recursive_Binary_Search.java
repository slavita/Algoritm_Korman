package PART_3_Binary_Search;

import java.util.Arrays;

public class Recursive_Binary_Search {
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
            System.out.println(Recursive_Binary_Search(A , 0, A.length, 6));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static int Recursive_Binary_Search(int A[],int p, int r, int x) throws Exception {

        if (p > r) throw  new Exception("Not Found");
        else {
            int q = (p + r) / 2;
            if (A[q] == x) return q;
            if (A[q] > x) return Recursive_Binary_Search(A, p, q - 1, x);
            else  return Recursive_Binary_Search(A, p + 1, r, x);
        }
    }
}
