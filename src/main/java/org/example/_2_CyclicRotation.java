package org.example;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given.
 * Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is moved to the first place.
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
 * (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 */

public class _2_CyclicRotation {

    public static void main(String[] args) {
//        int[] A = new int[] {3, 8, 9, 7, 6};

        int[] A = new int[] {};
        int[] B = solution(A, 0);


        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

    }


    public static int[] solution(int[] A, int K){
        if (K == 0 || A.length / K == 0) return A;

        return A;



//        if (A.length == 0 && K == 0) return A;
//        if (A.length == 0) return null;
//        if (K == 0) return A;
//
//
//        for (int i = 1; i <= K; i++){
//            // store the last element into a temp variable
//            int temp = A[A.length - 1];
//
//            // move each element of A to the next index
//            for (int j = A.length - 2; j >= 0; j--){
//                A[j + 1] = A[j];
//            }
//
//            // add the first index of the array with the temp value
//            A[0] = temp;
//
//        }
//
//        return A;
    }


}
