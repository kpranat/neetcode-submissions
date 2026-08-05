class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxlength=0;
        Set <Character> visited = new HashSet<>();
        while (r<s.length()){
            while(visited.contains(s.charAt(r)) && l<r){
                visited.remove(s.charAt(l));
                l++;
                

            }
            visited.add(s.charAt(r));
            maxlength = Math.max(maxlength,r-l+1);
            r++;
        }
        return maxlength;



    }      
    
}
