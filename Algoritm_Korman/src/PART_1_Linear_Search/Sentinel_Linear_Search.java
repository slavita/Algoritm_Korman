package PART_1_Linear_Search;

import java.util.Arrays;

public class Sentinel_Linear_Search {
    public static void main(String[] args) throws Exception {
        /** CREATING VARIABLES */
        final int n = 20;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }

        /** OUTPUT ARRAY */
            System.out.println(Arrays.toString(A));

        /** CALL SEARCH */
        try {
            Sentinel_Linear_Search(A , n, 9);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    /** LINE SEARCH FUNCTION IS OPTIMIZED */
    public static void Sentinel_Linear_Search(int A[], int n, int search_element) throws Exception {
        int x = search_element;
        int last = A[n-1];
        A[n-1] = x;
        int i = 0;
        while (A[i] != x){
            i++;
        }
        A[n-1] = last;
        if(i < n-1)
            System.out.println("Элемент " + x + " найден" + " его индекс " + i);
        else
            throw new Exception("NOT_FOUND");
    }

}
