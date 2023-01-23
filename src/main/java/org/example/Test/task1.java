package org.example.Test;

public class task1 {

    public static void main(String[] args) {
        int A = 1;
        int B = 8;

        System.out.println(solution(A, B));
    }

    public static int solution(int A, int B) {
        int sumOfTwoSticks = A + B;
        int longestSide = sumOfTwoSticks / 4;

        while(longestSide > 0) {
            int maxSizeOfA = A / longestSide;
            int maxSizeOfB = B / longestSide;

            if(maxSizeOfA + maxSizeOfB >= 4) {
                return longestSide;
            }

            longestSide--;
        }

        return 0;
    }
}
