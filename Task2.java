package Tasks;

import java.util.Arrays;


public class Task2 {


    public static void transArr(int [] nums, int val) {
                int left, right; // left - откуда переносим, right - куда переносим
                left=0;
                for (right=0; right<nums.length; right++)
                    if (nums[right] != val ) nums[left++]=nums[right];
                for (right=left; right<nums.length; right++) nums[right]=val;
            }
            public static void main(String[] args) {
                int[] nums = {3,2,3,1,3,1,3,2};
                int val = 3;
                for (int x: nums){
                }
                System.out.println(Arrays.toString(nums));
                transArr(nums, 3);
                for (int x: nums) {
                }
                System.out.println(Arrays.toString(nums));
                }
            }
