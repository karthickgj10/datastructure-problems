package com.karthickgj.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphDFS {

    public void dfs(Map<Integer, List<Integer>> adjList) {
        Set<Integer> visited = new HashSet<>();
        for(Integer key : adjList.keySet()) {
            if(!visited.contains(key)) {
                dfsHelper(adjList, visited, key);
            }
        }
    }

    public void dfsHelper(Map<Integer, List<Integer>> adjList, Set<Integer> visited, Integer node) {
        if(visited.contains(node)) {
            return;
        }
        visited.add(node);
        for(Integer neighbourNode : adjList.get(node)) {
            dfsHelper(adjList, visited, neighbourNode);
        }
    }
}
