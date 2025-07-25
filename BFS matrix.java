/*BFS matrix */
import java.util.*;
public class Main
{
    public static void bfs(int[][] graph,int start){
        int n=graph.length;
        boolean[] visited=new boolean[n];
        Queue<Integer>queue=new LinkedList<>();
        visited[start]=true;
        queue.offer(start);
        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.print(current+" ");
            for(int neighbour=0;neighbour<n;neighbour++){
              if(graph[current][neighbour]==1 && !visited[neighbour]){
                visited[neighbour]=true;
                queue.offer(neighbour);
              }
            }
        }
    }
    public static void main(String[] args){
        int[][] adjMatrix={
               {0,1,1,0},
               {1,0,0,1},
               {1,0,0,1},
               {0,1,1,0}
        };
        System.out.println("BFS starting from node 0:");
        bfs(adjMatrix,0);
        
    }
   
}