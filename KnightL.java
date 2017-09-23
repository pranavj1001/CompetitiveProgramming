// Question for this problem: https://www.hackerrank.com/challenges/knightl-on-chessboard/problem

package com.pranavjain.programming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Vertex{

    int x;
    int y;
    int jumps;

    Vertex(int x, int y, int jumps){
        this.x = x;
        this.y = y;
        this.jumps = jumps;
    }
}

public class KnightL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // your code goes here
        int[][] moves = new int[n-1][n-1];
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                moves[i-1][j-1] = BFS(i,j,n);
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(moves[i-1][j-1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static int BFS(int i,int j,int n){
        
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(new Vertex(0,0,0));
        
        if(queue.isEmpty()) 
            return 0;
        
        boolean[][] visited = new boolean[n][n];
        
        while(!queue.isEmpty()){
            
            Vertex currentVertex = queue.remove();
            int x = currentVertex.x;
            int y = currentVertex.y;
            int jumps = currentVertex.jumps;

            // check in left direction
            if(x-i>=0){
                // check in left up
                if(y-j>=0){
                    addPoint(x-i,y-j,jumps+1, queue, visited);
                }
                // check in left bottom
                if(y+j < n){
                    addPoint(x-i,y+j,jumps+1, queue, visited);
                }
            }

            // check in right direction
            if(x+i <n){
                // check in right up
                if(y-j>=0){
                    addPoint(x+i,y-j,jumps+1, queue, visited);
                }
                // check in right bottom
                if(y+j < n){
                    // if we reached the (n-1, n-1)
                    if(x+i==n-1 && y+j==n-1) {
                        return jumps + 1;
                    }
                    addPoint(x+i,y+j,jumps+1, queue, visited);
                }
            }

            // check in up direction
            if(x-j>=0){
                // check in up left
                if(y-i>=0){
                    addPoint(x-j,y-i,jumps+1, queue, visited);
                }
                // check in up right
                if(y+i < n){
                    addPoint(x-j,y+i,jumps+1, queue, visited);
                }
            }

            // check in bottom direction
            if(x+j <n){
                // check in bottom left
                if(y-i>=0){
                    addPoint(x+j,y-i,jumps+1, queue, visited);
                }
                // check in bottom right
                if(y+i < n){
                    // if we reached the (n-1, n-1)
                    if(x+j==n-1 && y+i==n-1) {
                        return jumps + 1;
                    }
                    addPoint(x+j,y+i,jumps+1, queue, visited);
                }
            }

        }
        return -1;
    }
    
    static void addPoint(int x, int y, int jumps, Queue<Vertex> queue, boolean[][] visited){
        if(visited[x][y])
            return;

        queue.add(new Vertex(x,y,jumps));
        visited[x][y] = true;

    }

}
