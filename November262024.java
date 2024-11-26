class Solution {
    public int findChampion(int n, int[][] edges) {
        int m = edges.length;
        boolean visited[] = new boolean[n];
        for(int i=0;i<m;i++) {
            visited[edges[i][1]] = true;
        }
        int champ = -1;
        int count = 0;
        for(int i=0;i<n;i++) {
            if(visited[i] == false) {
                champ = i;
                count++;
            }
        }
        if(count==1) {
            return champ;
        }
        return -1;
    }
}
