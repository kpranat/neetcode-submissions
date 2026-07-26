class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] stringCharacterArray = s.toCharArray();
        int l = 0 , r=stringCharacterArray.length-1;
        while (l<=r){
            if(!Character.isLetterOrDigit(stringCharacterArray[l])){
                l++;
                continue;
            }
            else if (!Character.isLetterOrDigit(stringCharacterArray[r])){
                r--;
                continue;
            }
            if (stringCharacterArray[l] != stringCharacterArray[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;

        
    }
}
