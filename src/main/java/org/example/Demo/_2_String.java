package org.example.Demo;

import java.util.Vector;

public class _2_String {
    public static void main(String[] args) {
        String S = "o";
        String T = "o";
        System.out.println(solution(S, T));

    }

    public static String solution(String S, String T){

        char[] arrayS = S.toCharArray();
        char[] arrayT = T.toCharArray();

        // ADD c
        String S1 = S + T.charAt(T.length() - 1);
        if (S1.equals(T)) {
            return "ADD" + " " + T.charAt(T.length() - 1);
        }

        // JOIN c
        char need;

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                need = S.charAt(i);
                String T2;
                for (int j = 0; j < T.length(); j++) {
                    if (T.charAt(j) == need){
                        T2 = T.substring(0,j + 1) + need + T.substring(j + 1);
                        System.out.println(T2);
                        if (T2.equals(S)){
                            return "JOIN" + " " + need;
                        }
                    }
                }

            }
        }

        // SWAP c d
        Vector<Character> A = new Vector<>();
        Vector<Character> B = new Vector<>();

        for (int i = 0; i < S.length(); i++){
            if (arrayS[i] != arrayT[i]){
                A.add(arrayS[i]);
                B.add(arrayT[i]);
            }
        }

        if (A.size() == B.size() &&  B.size() == 2) {
            if (A.get(0) == B.get(1) && B.get(0) == A.get(1))
                return "SWAP" + " " + A.get(0) + " " + B.get(0);
        }

        // NOTHING
        else if (S.equals(T)){
            return "NOTHING";
        }
        return "IMPOSSIBLE";
    }
}
