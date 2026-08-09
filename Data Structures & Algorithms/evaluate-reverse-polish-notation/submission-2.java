class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for (int i =0;i<tokens.length;i++){
            String tokenValue = tokens[i];
            if(tokenValue.equals("+")||tokenValue.equals("-")||tokenValue.equals("/")||tokenValue.equals("*")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                if(tokenValue.equals("+")){
                    operand1 = operand1 + operand2;                    
                }
                else if (tokenValue.equals("-")){
                    operand1 = operand2 - operand1;
                }
                else if (tokenValue.equals("/")){
                    operand1 = operand2 / operand1;
                }
                else if (tokenValue.equals("*")){
                    operand1 = operand1 * operand2;
                }
                stack.push(operand1);
            }
            else{
                int operand = Integer.parseInt(tokens[i]);
                stack.push(operand);
            }
        }
        if(!stack.isEmpty()) return stack.pop(); 
        return 0; 
    }      
    
}
