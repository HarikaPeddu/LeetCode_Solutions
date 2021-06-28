class Solution {
	Queue<int[]> q = new LinkedList<>();
 
	public int orangesRotting(int[][] grid) {
    	
    	int row = grid.length;
    	int col = grid[0].length;
    	int count = 0;
    	boolean Change = true;
    	boolean Present = false;
    	
    	while(Change){
        	for(int i = 0;i<row; i++){
            	for(int j = 0;j<col;j++){
                     	dfs(i, j, grid);
                	}
            	}
        	boolean Rot = rotAround(q, grid);
        	if(!Rot) break;
    	count++;	
    	} 
    	
    	for(int i = 0;i<row; i++){
        	for(int j = 0;j<col;j++){
                	if(grid[i][j]==1) Present = true;
            	}
    	}
    	return Present? -1 : count;
	}
    
	public void dfs(int i, int j, int grid[][]){
    	if(grid[i][j]==2) q.add(new int[]{i, j});
    	}
	
 	public boolean rotAround(Queue<int[]> q, int grid[][]){
        	boolean check = false;
        	while(!q.isEmpty()){
          	check = rotAroundPos(q.remove(),  grid) || check;
        	}
        	return check;
    	}
	
 	public boolean rotAroundPos(int pos[], int grid[][]){
        	
        	int x = pos[0];
        	int y = pos[1];
     	   boolean check = false;
        	if(isValidPos(x-1,y, grid) && grid[x-1][y]==1){
            	grid[x-1][y]=2;
            	check = true;
        	}
         	if(isValidPos(x,y+1, grid) && grid[x][y+1]==1){
            	grid[x][y+1]=2;
            	check = true;
 
        	}
         	if(isValidPos(x+1,y, grid) && grid[x+1][y]==1){
            	grid[x+1][y]=2;
            	check = true;
        	}
         	if(isValidPos(x,y-1, grid) && grid[x][y-1]==1){
         	   grid[x][y-1]=2;
            	check = true;
        	}
        	return check;
        	
    	}
	
  	public boolean isValidPos(int x, int y, int[][]grid){
            if(x<0||y<0||x>grid.length-1||y>grid[0].length-1){
            	return false;
        	}
        	return true;
    	}
}
