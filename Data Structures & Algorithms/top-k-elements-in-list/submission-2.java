class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0 ; i<nums.length ; i++){
            if (!hashmap.containsKey(nums[i])){
                hashmap.put(nums[i],1);
            }
            else
                hashmap.put(nums[i],hashmap.get(nums[i])+1);
        }

        int[] allvalues = new int[hashmap.size()];
        int[] keyArray = new int[hashmap.size()];

        int index = 0;
        for (int key : hashmap.keySet()){
            keyArray[index] = key;
            allvalues[index] = hashmap.get(key);
            index++;
        }

        for (int i = 0 ; i<allvalues.length ; i++){
            boolean swapped = false;
            for (int j = 0 ; j<allvalues.length-i-1 ; j++){
                if(allvalues[j] > allvalues[j+1]){

                    int tempValue = allvalues[j];
                    allvalues[j] = allvalues[j+1];
                    allvalues[j+1] = tempValue;

                    int temp = keyArray[j];
                    keyArray[j] = keyArray[j+1];
                    keyArray[j+1]=temp;
                    
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        int[] resultSet = new int[k];
        int count = 0;
        for (int i = keyArray.length-1 ; i>=0 && count<k; i--){
            if(count == k){
                break;
            }
            resultSet[count++] = keyArray[i];
        }

        return resultSet;

    }
}
