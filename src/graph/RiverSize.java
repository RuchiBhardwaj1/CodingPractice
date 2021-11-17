package graph;

import java.util.*;

class Program {
    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> sizes = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i =0 ; i< matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                if(visited[i][j]){
                    continue;
                }
                traverseNode(i,j,matrix,visited,sizes);
            }
        }
        return sizes;
    }

    public static void traverseNode(int i , int j , int[][] matrix, boolean[][] visited, List<Integer> sizes){
        int currentRiversSize = 0;
        Stack<Integer[]> nodesToExplore = new Stack<Integer[]>();
        nodesToExplore.push(new Integer[] {i,j});
        while(!nodesToExplore.empty()){
            Integer[] currentNode = nodesToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if(visited[i][j]){
                continue;
            }
            visited[i][j] = true;
            if(matrix[i][j] == 0){
                continue;
            }
            currentRiversSize++ ;
            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i,j,matrix,visited);
            for(Integer[] neighbor: unvisitedNeighbors){
                nodesToExplore.add(neighbor);
            }
        }
        if(currentRiversSize>0){
            sizes.add(currentRiversSize);
        }

    }

    public static List<Integer[]> getUnvisitedNeighbors(int i , int j , int[][] matrix, boolean[][] visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<Integer[]>();
        if(i> 0 && !visited[i-1][j]){
            unvisitedNeighbors.add(new Integer[] {i-1,j});
        }
        if(i< matrix.length -1 && !visited[i+1][j]){
            unvisitedNeighbors.add(new Integer[] {i+1,j});
        }
        if(j>0 && !visited[i][j-1]){
            unvisitedNeighbors.add(new Integer[] {i,j-1});
        }
        if(j< matrix[0].length -1 && !visited[i][j+1]){
            unvisitedNeighbors.add(new Integer[] {i,j+1});
        }

        return unvisitedNeighbors;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}};

        System.out.println(riverSizes(mat));
    }
}
