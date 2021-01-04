package DataStructures.SortAndSearchAlgo;

public class NumberOfIslands {

    /*Input : 11110
              11010
              11000
              00000    */
    // Using DFS
    public static int numberOfIslands(char[][] grid){

        if(grid == null || grid.length == 0){
            return 0;
        }
        int totalIslands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    totalIslands += DFS(grid, i, j);
                }
            }
        }
        return totalIslands;
    }

    public static int DFS(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        DFS(grid, i+1, j); //down
        DFS(grid, i-1, j); //up
        DFS(grid, i, j+1); //right
        DFS(grid, i, j-1); //left
        return 1;
    }

    public static void main(String[] args) {

        char[][] input = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        char[][] input1 = {
                {'1','1','1','1','1'},
                {'0','0','0','0','0'},
                {'1','1','0','0','0'},
                {'1','0','0','0','0'}
        };

        System.out.println(numberOfIslands(input1));
    }
}
