

import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * 
 */
 class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
        // key = previous number int the list
        // valur = the index of the number
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num = 0 ; num < nums.length; num++){
            // if target is 9 and nums = [2, 7, 11, 15]
            // then complement = 9 - 2 = 7
            int complement = target - nums[num];
            // map is empty no data to compare
            if (map.containsKey(complement)) {
                // at the second round; 
                // num = 1, nums[num] = 7
                // complement = 9 - 7 = 2
                // map.containsKey(2) returns true because 2 is in the map with index 0.
                // Return [map.get(2), 1] which is [0, 1].
                return new int[] { map.get(complement), num };
                
            }

            // so 2 is added: map = {2: 0}.
            map.put(nums[num], num);
        }
        // this returns empty list if their is no addition to the target
        return  new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(String.format("[%s, %s]", result[0], result[1]));
    }
    
}


