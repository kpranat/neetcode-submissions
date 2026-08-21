class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if (nums[r]>nums[mid]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        /* System.out.println(nums[l]);
        return l; */
        int minelement = l;
        l=0;
        r=nums.length-1;
        if (target >= nums[minelement] && target <= nums[r]){
            l=minelement;
        }else{
            r=minelement-1;
        }
        while (l<=r){
            int mid = (l+r)/2;
            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
        
    }
}
