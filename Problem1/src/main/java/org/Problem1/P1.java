package org.Problem1;

import java.util.Arrays;

public class P1 {
    public static void Solve() {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = intArr.length, k = 3;
        int[] lastArrK = new int[k];
        int[] remArr = new int[n - k];
        int[] sumOfArrays = new int[n];

        for (int i = 0; i < lastArrK.length; i++) {
            //System.out.println(intArr[n-k+i]);
            lastArrK[i] = intArr[n - k + i];
        }

        for (int i = 0; i < intArr.length - k; i++) {
            // System.out.println(intArr[i]);
            remArr[i] = intArr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i < k) {
                sumOfArrays[i] = lastArrK[i];
            } else {
                sumOfArrays[i] = remArr[i - k];
            }
        }

        System.out.println(Arrays.toString(sumOfArrays));
    }
}
