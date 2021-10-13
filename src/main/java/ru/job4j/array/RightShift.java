package ru.job4j.array;

import java.util.Arrays;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int i = 0;
        while (i < count){
            RightShift.shift(nums);
            i++;
        }
    }


    private static void shift(int[] nums) {
        int [] rsl = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = i+1;
            if (i == nums.length -1) {
                x = 0;
            }
            rsl[x] = nums[i];
        }
        System.arraycopy(rsl, 0, nums, 0, nums.length);
    }

}
