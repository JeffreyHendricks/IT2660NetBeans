/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it_2660_final;

/**
 *
 * @author jeff
 */
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
    Listing vertex[];
    int[][] aCopy;
    int[][] spt;
    int edge[][];
    int[] verticesIncluded;
    int numVerticesIncluded;
    int[] minPathLengths;
    int max, numberOfVertices;
    int count = 0;
    
    public Graph(int n)
    {
        vertex = new Listing[n];
        edge = new int[n][n];
        max = n;
        numberOfVertices = 0;
    }
    
    public boolean insertVertex(int vertexNumber, Listing newListing)
    {
        if(vertexNumber >= max)
            return false;
        vertex[vertexNumber] = newListing.deepCopy();
        numberOfVertices++;
        return true;
    }
    
    public boolean insertEdge(int fromVertex, int toVertex)
    {
        if(vertex[fromVertex] == null || vertex[toVertex] == null)
            return false;
        edge[fromVertex][toVertex] = 1;
        return true;
    }
    
    public void showVertex(int vertexNumber)
    {
        System.out.println(vertex[vertexNumber]);
    }
    
    public void showEdges(int vertexNumber)
    {
        for(int column = 0; column < numberOfVertices; column++)
        {
            if(edge[vertexNumber][column] == 1)
                System.out.println(vertexNumber + ", " + column);
        }
    }
    
    public void DFT(int firstVertex)
    {
        int v;
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < numberOfVertices; i++)
        {
            if(vertex[i] != null)
            vertex[i].setPushed(false);
        }
        stack.push(firstVertex);
        vertex[firstVertex].setPushed(true);
        
        while(!stack.empty())
        {
            v = stack.pop();
            vertex[v].visit();
            count++;
            for(int column = 0; column < numberOfVertices; column++)
            {
                if(edge[v][column] == 1 && !vertex[column].getPushed())
                {
                    stack.push(column);
                    vertex[column].setPushed(true);
                }
            }
        }
    }
    
    public void BFT(int firstVertex)
    {
        int v;
        Queue<Integer> queue = new LinkedList();
        
        for(int i = 0; i < numberOfVertices; i++)
        {
            if(vertex[i] != null)
            vertex[i].setPushed(false);
        }
        queue.add(firstVertex);
        vertex[firstVertex].setPushed(true);
        
        while(!queue.isEmpty())
        {
            v = queue.remove();
            vertex[v].visit();
            count++;
            for(int column = 0; column < numberOfVertices; column++)
            {
                if(edge[v][column] == 1 && !vertex[column].getPushed())
                {
                    queue.add(column);
                    vertex[column].setPushed(true);
                }
            }
        }
    }
    
    public int getCount()
    {
        return count;
    }
    
    /*public int[][] DAlg(int startVertex)
    {
     verticesIncluded[0] = startVertex;
     numVerticesIncluded = 1;
     for(int i = 0; i < numberOfVertices; i++)
     {
         minPathLengths[i] = Integer.MAX_VALUE;
         aCopy[i][startVertex] = Integer.MAX_VALUE;
     }
     
     minPathLengths[startVertex] = 0;
     while(numVerticesIncluded < numberOfVertices)
     {
         findMinPath(numberOfVertices, aCopy, verticesIncluded, 
                 numVerticesIncluded, minPathLengths, rowMin,colMin, minWeight,
                 minPath);
         for(int i = 0; i < numberOfVertices; i++)
         {
             aCopy[i][colMin] = Integer.MAX_VALUE;
         }
         spt[rowMin][colMin] = minWeight;
         spt[colMin][rowMin] = minWeight;
         minPathLengths[colMin] = minPath;
         verticesIncluded[numVerticesIncluded] = colMin;
         numVerticesIncluded++;
     }
     return spt;
    }*/
}
