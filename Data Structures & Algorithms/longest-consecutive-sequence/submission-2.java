class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer,Integer> sortedMap = new TreeMap<>();
        if (nums.length == 0){
            return 0;
        }
        for (int i = 0; i<nums.length ; i++){
            if (!sortedMap.containsKey(nums[i])){
                sortedMap.put(nums[i],1);
            }
            else{
                sortedMap.put(nums[i],sortedMap.get(nums[i])+1);
            }
        }
        System.out.println(sortedMap);
        int count = 1;
        int maxcount=1;
        Integer[] keyArray = sortedMap.keySet().toArray(new Integer[0]);
        System.out.println(keyArray);
        for (int num : keyArray){
            System.out.println(num);
        }
        for (int i = 0 ; i<keyArray.length-1; i ++){
            
            if (Math.abs(keyArray[i+1]-keyArray[i]) == 1){
                count++;
            }
            else{
                maxcount = Math.max(maxcount, count);
                count = 1;
            }       
            
        }
        return Math.max(maxcount,count);
        
    }
}
