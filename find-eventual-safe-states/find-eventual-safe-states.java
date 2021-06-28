class Solution {
	public List<Integer> eventualSafeNodes(int[][] graph) {
   	
    	List<Integer> ans = new ArrayList<>();
     	
    	if (graph == null || graph.length == 0) {
        	return ans;
    	}
     	
    	int noNodes = graph.length;
     	
 
    	int[] color = new int[noNodes];
     	
    	for (int i = 0; i < noNodes; i++) {
        	
        	if (color[i] == 1 || color[i] == 2) {
            	continue;
        	}
         	
        	findCycleInGraph(graph, i, color);
    	}
     	
    	
    	for (int i = 0; i < noNodes; i++) {
        	if (color[i] == 2) {
            	ans.add(i);
        	}
    	}
     	
    	return ans;
	}
 	
	private boolean findCycleInGraph(int[][] graph, int source, int[] color) {
    	if (color[source] == 2) {
        	return false;
    	}
     	
    	if (color[source] == 1) {
       	return true;
    	}
     	
    	color[source] = 1;
     	
    	for (int neighbor : graph[source]) {
        	boolean hasCycle = findCycleInGraph(graph, neighbor, color);
         	
    	    if (hasCycle) {
            	return true;
        	}
    	}
     	
    	color[source] = 2;
     	
    	return false;
    	
	}
}
