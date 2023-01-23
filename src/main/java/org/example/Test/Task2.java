package org.example.Test;

public class Task2 {

        public static void main(String[] args) {
            int N = 4;
            int[] A = new int[]{1,2,4,4,3};
            int[] B = new int[]{2,3,1,3,1};

            System.out.println(solution(N, A, B));
        }

        public static boolean solution(int N, int[] A, int[] B) {
            // Implement your solution here
            boolean res = false;

            boolean [][] mda = new boolean[N][N];

            for(int i = 0;i < A.length;i++){
                mda[A[i]-1][B[i]-1] = true;
                mda[B[i]-1][A[i]-1] = true;
            }

            for(int i = 0;i < N - 1;i++){
                res = mda[i][i+1];

                if(!res) break;
            }

            return res;
        }
}





