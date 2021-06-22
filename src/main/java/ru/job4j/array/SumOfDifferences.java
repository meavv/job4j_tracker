package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        int rzn= 0;
        for (int i = 1; i < nums.length; i++) {
            rzn = nums[i] - nums[(i-1)];
            sum += rzn;
        }
        return  Math.abs(sum);
    }
}