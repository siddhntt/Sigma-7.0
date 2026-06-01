class Solution {
    public boolean isMonotonic(int[] nums) {
        if(isIncreasing(nums)||isDecreasing(nums)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isIncreasing(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[] nums)
    {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                return false;
            }
        }
        return true;
    }
}