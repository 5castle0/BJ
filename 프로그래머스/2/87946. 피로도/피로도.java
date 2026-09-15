class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(k, visited, dungeons, 0);
    }
    
    private int dfs(int fatigue, boolean[] visited, int[][] dungeons, int depth){
        int ans = depth;
        
        for(int i=0; i<visited.length; i++){
            if(!visited[i] && fatigue>=dungeons[i][0]){
                visited[i] = true;
                depth++;
                fatigue -= dungeons[i][1];
                
                ans = Math.max(ans, dfs(fatigue, visited, dungeons, depth));
                
                visited[i] = false;
                depth--;
                fatigue += dungeons[i][1];
                
            }
        }
        
        return ans;
    }
}