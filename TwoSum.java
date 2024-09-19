/*Two Integer Sum

Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
Return the answer with the smaller index first.

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]*/


import java.util.Arrays;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        TwoSum ts = new TwoSum();
        int[] n1 = {3,4,5,6};
        int target1=7;
        System.out.println("Indices:"+Arrays.toString(ts.twoSum(n1,target1)));
        int[] n2 = {4,5,6};
        int target2=10;
        System.out.println("Indices:"+Arrays.toString(ts.twoSum(n2,target2)));
        int[] n3 = {5,5};
        int target3=10;
        System.out.println("Indices:"+Arrays.toString(ts.twoSum(n3,target3)));
    }
}
