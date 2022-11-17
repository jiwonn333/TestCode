package com.example.testcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CodilityTestCode {

    @Test
    public void testCode() {
        System.out.println("binary_gap : " + binaryGap(8806));
        System.out.println("cyclic_rotation : " + Arrays.toString(cyclicRotation(new int[]{1,2,3,4}, 2)));
    }


        public int[] cyclicRotation(int[] A, int k) {
        int length = A.length;
        int temp;
        if (length == 0) {
           return A;
        }
        for (int i = 0; i < k; i++) {
            temp = A[length - 1];
            for (int j = length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        return A;
    }
    
    // cyclicRotation Queue 사용하여 풀이....-> 반환타입을 변경해야 함
    public void test() {
        Queue<Integer> queue = new LinkedList<>();
        int K = 1;
        int[] arrayA = new int[]{0, 0, 0};
        int startIndex = arrayA.length - K;
        for (int i = startIndex; i <= arrayA.length - 1; i++) {
            queue.add(arrayA[i]);
        }
        for (int i = 0; i < startIndex; i++) {
            queue.add(arrayA[i]);
        }
        System.out.println("result : " + Arrays.toString(queue.toArray()));
    }

    // Binary_Gap
    public int binaryGap(int N) {
        int count = 0;
        int maxCount = 0;
        int max = 0;
        String binaryString = Integer.toBinaryString(N);
        System.out.println("binaryString : " + binaryString);
        String[] binaryArr = binaryString.split("");
        int arrLength = binaryArr.length;

        for (int i = 0; i < arrLength; i++) {
            if ("0".equals(binaryArr[i])) {
                count++;
            } else if ("1".equals(binaryArr[i])) {
                if (max < count) {
                    max = count;
                } // max > count   max = 3, count 2
                maxCount = count;
                count = 0;
            } else {
                System.out.println("error");
            }
            max = max > maxCount ? max : maxCount;
        }

        return max;
    }
}
