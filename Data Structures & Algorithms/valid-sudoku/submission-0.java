class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for row
        HashMap<Integer,HashMap<Character,Integer>> hashmap = new HashMap<>();
        for (int i = 0 ; i<9 ; i++){
            hashmap.put(i,new HashMap<>());
            for (int j = 0 ; j<9 ; j++){
                if(board[i][j]=='.') continue;
                if(!hashmap.get(i).containsKey(board[i][j]))
                    hashmap.get(i).put(board[i][j],1);
                else
                    hashmap.get(i).put(board[i][j],hashmap.get(i).get(board[i][j])+1);
            }    
        }
        for (int outerkey : hashmap.keySet()){
            for (char innerkey : hashmap.get(outerkey).keySet()){
                if (hashmap.get(outerkey).get(innerkey)>1)
                    return false;
            }
        }

        //check column
        HashMap<Integer,HashMap<Character,Integer>> hashmapcolumn = new HashMap<>();
        for (int i = 0 ; i<9 ; i++){
            hashmapcolumn.put(i,new HashMap<>());
            for (int j = 0 ; j<9 ; j++){
                if(board[j][i]=='.') continue;
                if(!hashmapcolumn.get(i).containsKey(board[j][i]))
                    hashmapcolumn.get(i).put(board[j][i],1);
                else
                    hashmapcolumn.get(i).put(board[j][i],hashmapcolumn.get(i).get(board[j][i])+1);
            }    
        }
        for (int outerkey : hashmapcolumn.keySet()){
            for (char innerkey : hashmapcolumn.get(outerkey).keySet()){
                if (hashmapcolumn.get(outerkey).get(innerkey)>1)
                    return false;
            }
        }

        //for boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashMap<Character, Integer> box = new HashMap<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                    if (board[i][j] == '.') continue;

                    if (!box.containsKey(board[i][j])) {
                        box.put(board[i][j], 1);
                    } else {
                        return false;   // Duplicate found
                        }   
                    }
                }
            }
        }   

    return true;     
    }
}
