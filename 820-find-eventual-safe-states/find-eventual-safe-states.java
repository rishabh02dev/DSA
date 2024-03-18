class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length; // Number of nodes (vertices) in the graph
        
        List<List<Integer>> adjRev = new ArrayList<>(); // Reverse adjacency list
        
        // Initialize the reverse adjacency list with empty lists for each node
        for (int i = 0; i < V; i++) {
            adjRev.add(new ArrayList<>());
        }
        
        int[] indegree = new int[V]; // Array to store the indegree (number of incoming edges) for each node
        
        // Build the reverse adjacency list and calculate indegree for each node
        for (int i = 0; i < V; i++) {
            for (int it : graph[i]) {
                adjRev.get(it).add(i); // Add the reverse edge to the reverse adjacency list
                indegree[i]++; // Increment indegree for the current node
            }
        }
        
        Queue<Integer> q = new LinkedList<>(); // Queue for BFS traversal
        List<Integer> safeNodes = new ArrayList<>(); // List to store the eventual safe nodes
        
        // Add nodes with indegree 0 (no incoming edges) to the queue
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        
        // Perform BFS traversal to find eventual safe nodes
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            safeNodes.add(node); // Add the node to the list of eventual safe nodes
            
            // Reduce the indegree of neighbors and add them to the queue if their indegree becomes 0
            for (int it : adjRev.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        
        Collections.sort(safeNodes); // Sort the list of eventual safe nodes in ascending order
        return safeNodes; // Return the list of eventual safe nodes
    }
}