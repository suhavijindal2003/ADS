public class Backtracking {
    //recursion and backtracking are powerfull texh used to solve complex problem on matrix and grid



    //given a grid of characters and string words ,return true if word exits in the grid
    //the word can be constructed from lettersin adjacent cells (hor and ver)
    //the sam eletter cell cannoit be used more than once


    //appporach:
    // use depth first search with backtracking
    //start from the each cell,try to match the first letter of the word
    //explore in all 4 possible direction
    //if the characters of the word matches return true
    //if the path is incorrect backtrack and mark all the cell as unvisited


    //leetcode 79
    public static boolean  exist(char[][] brd,String word){
        int row=brd.length;
        int col=brd[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(brd[i][j]==word.charAt(0) && dfs(brd, word, i, j, 0)){
                    return true;
                }
            }
        }
        return  false;
    }
    public static boolean  dfs(char[][] brd,String word,int i,int j,int index){
        if(index==word.length()) return  true;
        if(i<0||j<0||i>=brd.length ||j>=brd.length ||brd[i][j]!=word.charAt(index) ){
            return false;
        }
        char temp=brd[i][j];
        brd[i][j]='#';
        boolean found=dfs(brd, word, i+1, j, index+1)||dfs(brd, word, i-1, j, index+1)||dfs(brd, word, i, j+1, index+1)||dfs(brd, word, i, j-1, index+1);

        brd[i][j]=temp;
        return found;

    }
    public static void main(String[] args) {
        char[][] brd = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
    
        String wrd = "ASDFG";
        System.out.println("Word Found " + exist(brd, wrd));
    }
    
}
