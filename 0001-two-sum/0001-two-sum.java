//  O(n^2)time  O(1)space
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length > 1) {
            for (int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length ; j++)
            if (nums[i] + nums[j] == target){
                        int a[] = {i, j};
                        return a;
                
                    }
                }
            }
        return null;
        
        }
    }