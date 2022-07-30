package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {12, 21, 36, 71, 24, 85, 12, 30, 25};
        int n = 2;

        int[] mas = new int[array.length - 1];
        int subIndex = 0;

        for (int i = 0; i < array.length-1; i++) {
            if (i == n) {
                subIndex++;
            }
            mas[i] = array[subIndex];
            subIndex++;
        }

        System.out.println(Arrays.toString(mas));

    }
















    }
}
