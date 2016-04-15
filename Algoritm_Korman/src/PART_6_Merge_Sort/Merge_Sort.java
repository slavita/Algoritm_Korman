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

        /** OUTPUT ARRAY */
        System.out.println(Arrays.toString(A));

        /** SORT ARRAY */
        Merge_Sort(A, 0, A.length -1);

        /** OUTPUT SORT ARRAY */
        System.out.println(Arrays.toString(A));


    }

    /**
     * @param A массив
     * @param p начальный индекс массива.
     * @param r конечный индекс массива.
     */
    public static void Merge_Sort(int A[],int p, int r){
        if (p >= r) return;                             /** Если на интервале не более одного элемента возвращаемся     */
        else {
            int q = (p + r) / 2;                        /** Ищем середину                                               */
            Merge_Sort(A, p, q);                        /** Делим левую часть                                           */
            Merge_Sort(A, q + 1, r);                    /** Делим правую часть                                          */
            Merge(A, p, q, r);                          /** Вызываем слияние                                            */
        }
    }

    public static void Merge(int A[],int p,int q,int r){ /** Сливает отсортированые масивы в единый подмассив A[p...q]  */
        int n1 = q - p + 1;                              /** Размер левого временного массива                           */
        int n2 = r - q;                                  /** Размер правого временного массива                          */
        int B[] = new int[n1 + 1];                       /** Инициализация В                                            */
        int C[] = new int[n2 + 1];                       /** Инициализация С                                            */

        System.arraycopy(A, p, B, 0, B.length - 1);      /** Копируем А[p...q] в B[n1]                                  */
        System.arraycopy(A, q + 1, C, 0, C.length - 1);  /** Копируем A[q+1...r] в C[n2]                                */

        B[n1] = Integer.MAX_VALUE;                      /** Записываем огранечитель                                     */
        C[n2] = Integer.MAX_VALUE;                      /** Записываем огранечитель                                     */

        int i = 0,j = 0;

        for(int k = p; k < r + 1; k++){                 /** Записываем отсортированые масивы в массив A[p...q]          */
            if (B[i]<= C[j]){
                A[k] = B[i++];
            }
            else {
                A[k] = C[j++];
            }
        }

    }

}
