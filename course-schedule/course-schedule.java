class Solution {
    public boolean canFinish(int nC, int[][] ps) {
        int[] indegree = new int[nC];
        
       
        for(int i=0;i<ps.length;i++){
            int[] edge = ps[i];
            indegree[edge[1]]++;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<indegree.length;i++) {
            if(indegree[i] == 0)
                q.offer(i);
        }
        
        while(!q.isEmpty()) {
            int course = q.poll();
            nC--;
            for(int[] p : ps) {
                if(p[0] == course){
                    indegree[p[1]]--;
                    if(indegree[p[1]] == 0)
                        q.offer(p[1]);
                }

            }
        }
        return nC==0;
        
    }
}
