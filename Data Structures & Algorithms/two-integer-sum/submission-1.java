class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<>();

        // Store all indices for every number
        for (int i = 0; i < nums.length; i++) {
            if (!hashmap.containsKey(nums[i])) {
                hashmap.put(nums[i], new ArrayList<>());
            }
            hashmap.get(nums[i]).add(i);
        }

        // Find the answer
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (hashmap.containsKey(complement)) {

                ArrayList<Integer> indices = hashmap.get(complement);

                for (int index : indices) {
                    if (index != i) {
                        return new int[]{i, index};
                    }
                }
            }
        }

        return new int[0];
    }
}