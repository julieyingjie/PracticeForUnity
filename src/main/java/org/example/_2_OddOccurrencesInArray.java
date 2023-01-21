package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Julie
 * A non-empty array A consisting of N integers is given.
 * The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value,
 * except for one element that is left unpaired.
 *
 * For example, in array A such that:
 *
 *   A[0] = 9  A[1] = 3  A[2] = 9
 *   A[3] = 3  A[4] = 9  A[5] = 7
 *   A[6] = 9
 * the elements at indexes 0 and 2 have value 9,
 * the elements at indexes 1 and 3 have value 3,
 * the elements at indexes 4 and 6 have value 9,
 * the element at index 5 has value 7 and is unpaired.
 *
 *
 * todo
 */

public class _2_OddOccurrencesInArray {
    public static void main(String[] args) {

        int[] testArray = new int[]{2,2,3,3,4};
        System.out.println(solution(testArray));

    }

    public static int solution(int[] A){
        if (A.length == 1) return A[0];
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i = i + 2) {
            if (A[i + 1] != A[i]) return A[i];
        }
        return A[A.length - 1];
    }

//        // variable to store the value needs to be matched
//        int pair = 0;
//
//        // a new arraylist to store the unmatched value
//        ArrayList<Integer> unMatchedValue = new ArrayList<>();
//        for (int i = 0; i < A.length; i++) {
//            if (pair == 0) {
//                pair = A[i];
//                if (unMatchedValue.size() == 0){
////                    unMatchedValue.add(A[i]);
//                }else {
//                    int res = checkWithUnMatchedValue(A[i], unMatchedValue);
//                    if (res >= 0) {
//                        unMatchedValue.remove(res);
//                    }
//                }
//            }else { // pair != 0 means there is a value needs to be matched.
//                if (A[i] == pair){
//                    pair = 0;
//                }else {
//                    int res = checkWithUnMatchedValue(A[i], unMatchedValue);
//                    if (res >= 0){
//                        unMatchedValue.remove(res);
//                    }else { //
//                        unMatchedValue.add(A[i]);
//                    }
//                }
//            }
//        }
//        return unMatchedValue.get(0);
//    }
//
//    private static int checkWithUnMatchedValue(int value, ArrayList<Integer> unMatchedValue) {
//        for (int i = 0; i < unMatchedValue.size(); i++) {
//            if (unMatchedValue.get(i) == value) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
