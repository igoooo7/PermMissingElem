package com.igor.leskiewicz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        Integer[] A = new Integer[N];

        Random rnd = new Random();
        int r = rnd.nextInt(N-1);

        int i = 0;
        for (int j = 0; j < A.length; j++) {
            if (j != r || j == 0) {
                A[j] = i;
            } else if(j == r && j != 0 ) {
                A[j] = i + 1;
                i++;
            }
            i++;
        }

        for (Integer n : A) {
            System.out.println(n);
        }

        List<Integer> AL = Arrays.asList(A);
        Collections.sort(AL);

        int min = AL.get(0);
        int max = AL.get(AL.size()-1);

        for (int z = min; z < max-1; z++) {
                if (((AL.get(z + 1)) - 1) != z) {
                    System.out.println("Missing element: " + (AL.get(z)+1));
                    break;
            }
        }
    }
}
