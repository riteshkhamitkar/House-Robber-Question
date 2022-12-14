public class Solution {
public int rob(int[] nums) {

    //if nums is null or length 0, return 0
    if(nums==null || nums.length==0)
        return 0;
        
    //if only 1 element is present,return it as the answer
    if(nums.length==1)
        return nums[0];
        
    //array to store the maxProfit attained
    int[] maxProfit=new int[nums.length];
    
    //assign fisrt value
    maxProfit[0]=nums[0];
    
    //second value is higher of first and second
    maxProfit[1]=Math.max(nums[0],nums[1]);
    
    //do dynamic programming for subsequent values
    for(int i=2;i<nums.length;i++)
    {
        maxProfit[i]=Math.max(maxProfit[i-2]+nums[i],maxProfit[i-1]);
    }
    
    //return the last value as answer
    return maxProfit[nums.length-1];
}
}
