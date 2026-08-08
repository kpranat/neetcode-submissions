class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> validSet = new HashMap<>();
        validSet.put(')','(');
        validSet.put(']','[');
        validSet.put('}','{');
        Stack <Character> stack1 = new Stack<>();
        boolean flag = false;
        for (int i = 0; i<s.length();i++){
            if (validSet.containsValue(s.charAt(i))){
                stack1.push(s.charAt(i));

            }
            else{
                if(stack1.isEmpty()) return false;
                if (validSet.get(s.charAt(i))==stack1.pop()){
                    flag=true;
                }
                else{
                    return false;
                }
                
            }
        }
        if(!stack1.isEmpty()){
            flag=false;
        }
        return flag;
        
    }
}
