class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int allProduct = 1;
        boolean containsZero=false;
        int countZero=0;
        for (int i =0;i<nums.length;i++){
            map.put(i,nums[i]);
            if(nums[i]==0){
                countZero++;
                containsZero=true;
                continue;
            }
            allProduct=allProduct*nums[i];

        }
        int[] results = new int[nums.length];
        for (int i : map.keySet()){
            if(countZero==nums.length){
                results[i] = 0;
                continue;
            }
            if(map.get(i)==0){
                if(countZero>1){
                    results[i]=0;
                    continue;
                }
                results[i] = allProduct;
                continue;
            }
            if(map.get(i)!=0 && containsZero){
                results[i] = 0;
                continue;
            }
            results[i] = allProduct/map.get(i);
        }     
        return results;   
    }
}  
