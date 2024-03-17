
class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        int m = prerequisites.length;
        int[] indegree = new int[n];
        for (int i = 0; i < m; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            adj.get(prerequisite).add(course); // Directing edge from prerequisite to course
            indegree[course]++; // Counting prerequisites for each course
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topoOrder = new int[n];
        int ind = 0;
        while (!q.isEmpty()) {
            int node = q.poll(); // poll() is more appropriate than peek() + remove()
            topoOrder[ind++] = node;
            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        if (ind == n) {
            return topoOrder; // Successfully found topological order
        } else {
            return new int[0]; // Failed to find topological order
        }
    }
}
