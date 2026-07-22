class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0 ; i<nums.length ; i++){
            if (hashmap.containsKey(nums[i])){
                hashmap.put(nums[i],hashmap.get(nums[i])+1);            
            }
            else{
                hashmap.put(nums[i],1);
            }
            if (hashmap.get(nums[i])>1) {
                return true;
            }          

        }
        return false;        
    }
}