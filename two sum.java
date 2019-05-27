public class Solution {
    // problem: get the two elements from an array, which will add up to the target.
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        // let every number in this array be the first part of the sum.
        for (int i = 0; i < length; i++){
            // the another part
            int another = target - nums[i];
            // check if there exists a number in this array which is qualified.
            for (int j = i+1; j < length; j++){
                // if there exists this number and this two numbers are not the same
                // then assign this two numbers to the result list and break the loop.
                // else continue
                if (nums[j] == another && i != j){
                    result[0] = i;
                    result[1] = j;
                    break;
                }   
            }
            if (result[1] != 0){
                break;
            }
        }
        return result;
    }
}