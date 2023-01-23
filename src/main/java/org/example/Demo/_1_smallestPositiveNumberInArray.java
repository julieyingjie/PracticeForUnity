package org.example.Demo;
import java.util.Arrays;

public class _1_smallestPositiveNumberInArray {

        public static void main(String[] args) {
//            int[] A = new int[] {1, 3, 6, 4, 1, 2};
//            int[] A = new int[] {1, 2, 4, 3};
//            int[] B = new int[] {1, 3, 2, 3};

//            int[] A = new int[] {1, 2, 4, 3};
//            int[] B = new int[] {1, 3, 2, 3};

            int[] A = new int[] {1, 2};
            int[] B = new int[] {1, 2};

            System.out.println(solution(A, B));

        }

        public static int solution(int[] A, int[] B){

            int[] C = createArray(A, B);
            return smallestPositiveNumber(C);
        }

    private static int[] createArray(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = Math.max(a[i], b[i]);
        }
        return c;
    }

    public static int smallestPositiveNumber(int[] arr) {

            Arrays.sort(arr);

            int smallest = 1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == smallest) {
                    smallest++;
                }
            }

            return smallest;
        }
    }

