package org.example;

import java.util.ArrayList;
import java.util.Collections;

// A binary gap within a positive integer N is
// any maximal sequence of consecutive zeros
// that is surrounded by ones at both ends in the binary representation of N.
// For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
// The number 529 has binary representation 1000010001 and contains two binary gaps:
// one of length 4 and one of length 3.
// The number 20 has binary representation 10100 and contains one binary gap of length 1.
// The number 15 has binary representation 1111 and has no binary gaps.
// The number 32 has binary representation 100000 and has no binary gaps.
public class _1_BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(32));
    }

   public static int solution(int N){
       // Implement your solution here

       // convert the integer N into a binary representation
       String binary = Integer.toBinaryString(N);

       // store the binary gap into an arraylist
       ArrayList<Integer> binaryGap = new ArrayList<>();

       // count for the numbers of 0
       int count = 0;

       // loop the whole binary representation
       for(int i = 0; i<binary.length();i++) {
           // when to start count: first pair combination of 10,
           // i = 1 and (i + 1) = 0
           if (binary.charAt(i) == '1' && (i + 1) < binary.length() && binary.charAt(i + 1) == '0'){
               count++;
               i++;
               // loop the zero and count
               while(binary.length() > (i + 1) && binary.charAt(i+1) == '0'){
                   count++;
                   i++;

                   // when is the end of the count of 0
                   // when you enter 01, which means i + 1 = 1
                   if ((i + 1) < binary.length()  && binary.charAt(i+1)=='1' ){
                       break;
                   }
               } // end of the count of 0

               // add to binaryGap only if ending with 1
               if(binary.length() > (i+1) && binary.charAt(i+1)=='1')
               {
                   binaryGap.add(count);

                   // then initializing count for the next count
                   count =0;
               }
           }

       }
       // end of the loop means the whole binary number has been finished

       if(binaryGap.size()==0)
           return 0;
       else
           return Collections.max(binaryGap);

   }



}
