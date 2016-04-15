package PART_5_Insertion_Sort;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        /** CREATING VARIABLES */
        final int n = 6;
        int[] A = new int[n];

        /** A RANDOM FILLING */
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(A));

        /** SORT ARRAY */
        Insertion_Sort(A, n);

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));


    }

    public static void Insertion_Sort(int[] A, int n){
        for(int i = 1; i < n; i++){
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key){
                    A[j + 1] = A[j];
                    j--;
                }
            A[j + 1] = key;
            }
        }

    }

