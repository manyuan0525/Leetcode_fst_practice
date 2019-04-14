class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length =  nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++){
            int another = target - nums[i];
            for (int j = i+1; j < length; j++){
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