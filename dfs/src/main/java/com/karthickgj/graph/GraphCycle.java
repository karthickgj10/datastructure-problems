package com.karthickgj.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphCycle {

    public boolean hasCycle(List<List<Integer>> adjList, int n) {
        Set<Integer> visited = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(!visited.contains(i)) {
                if (dfs(adjList, visited, -1, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(List<List<Integer>> adjList, Set<Integer> visited, int parent, int current) {
        visited.add(current);
        for(int node : adjList.get(current)) {
            if(!visited.contains(node)) {
                if(dfs(adjList, visited, current, node ))
                    return true;
            } else if(node != parent) {
                return true;
            }
        }
        return false;
    }

}
