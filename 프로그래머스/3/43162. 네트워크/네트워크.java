class Solution {
    public int solution(int n, int[][] computers) {
         boolean[] visited = new boolean[computers.length];
        int counter = 0;

        for(int i=0; i< computers.length; i++){
            if(!visited[i]){
                dfs(computers,i,visited);
                counter++;
            }
        }

        return counter;
    }
    
    static void dfs(int[][] computers, int x, boolean[] visited){
        visited[x] = true;
        for(int i=0; i< computers.length;i++){
            if(!visited[i] && computers[x][i] == 1){
                dfs(computers, i, visited);
            }
        }
    }
}