//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
    // Function to return a list containing the DFS traversal of the graph.
    void dfs(int i, vector<int> adj[], vector<int> &vis, vector<int> &storeDfs){
        storeDfs.push_back(i);
        vis[i] = 1;
        
        for(auto it: adj[i]){
            if(!vis[it]){
                dfs(it, adj, vis, storeDfs);
            }
        }
    }
    
    vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        vector<int> storeDfs;
        vector<int> vis(V+1,0);
        
        // for(int i = 1; i <= V; i++){
        //     if(!vis[i]){
                dfs(0, adj, vis, storeDfs);
        //     }
        // }
        
        return storeDfs;
    }
};

//{ Driver Code Starts.
int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int V, E;
        cin >> V >> E;

        vector<int> adj[V];

        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        // string s1;
        // cin>>s1;
        Solution obj;
        vector<int> ans = obj.dfsOfGraph(V, adj);
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends