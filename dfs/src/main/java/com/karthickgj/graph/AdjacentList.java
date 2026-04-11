package com.karthickgj.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacentList {

    Map<Integer, List<Integer>> buildAdjacentList(int n, int[][] edges){

        Map<Integer, List<Integer>> adjacentMap = new HashMap<>();
        for(int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            adjacentMap.getOrDefault(x, new ArrayList<>()).add(y);
            adjacentMap.getOrDefault(y, new ArrayList<>()).add(x);
        }
        return adjacentMap;
    }
}
