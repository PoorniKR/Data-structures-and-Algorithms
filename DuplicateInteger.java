/*Duplicate Integer

Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Input: nums = [1, 2, 3, 3]

Output: true

Input: nums = [1, 2, 3, 4]

Output: false
*/

class DuplicateInteger {
    public static boolean hasDuplicate(int[] nums) {
     for(int i=0;i<nums.length;i++)
     {
        for(int j=i-1;j>=0;j--)
        {
            if(nums[i]==nums[j])
            {
                return true;
            }
        }
     }  
     return false; 
    }
    public static void main(String[] args){
        DuplicateInteger di = new DuplicateInteger();
        int[] n1 = {1,2,3,3};
        System.out.println("Has Duplicates:"+di.hasDuplicate(n1));
        int[] n2 = {1,2,3,4};
        System.out.println("Has Duplicates:"+di.hasDuplicate(n2));
    }
    
}
