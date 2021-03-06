package com.crackbyte.practice.problemsolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static com.crackbyte.utils.Constants.PATTERN;

public class ReverseArray {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] nums) {
        if (nums.length % 2 == 0) {
            iterateArray(nums, nums.length);
        } else {
            iterateArray(nums, nums.length - 1);
        }
        return nums;
    }

    private static void iterateArray(int[] a, int size) {
        int temp;
        for (int i = 0; i < ((size) / 2); i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        int arrCount = scanner.nextInt();
        scanner.skip(PATTERN);
        int[] arr = new int[arrCount];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip(PATTERN);
        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int[] res = reverseArray(arr);
        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));
            if (i != res.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
