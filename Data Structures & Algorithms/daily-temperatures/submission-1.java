class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> stack = new Stack<>();
        Stack <Integer> index = new Stack<>();
        int count=0;
        int[] result = new int [temperatures.length];
        for (int i =0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>stack.peek()){                 
                if(!index.isEmpty()){ 
                    count = i-index.peek();              
                    result[index.peek()] = count;
                    index.pop();
                }
                stack.pop();
                
            }
            index.push(i);
            stack.push(temperatures[i]);
            count=0;

        }
        return result;
        
    }
}
