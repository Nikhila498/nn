/*DFS list*/
import java.util.*;
public class Main
{
    public static void dfsAdjList(Map<Integer,List<Integer>>graph,int start,Set<Integer>visited){
        if(visited==null){
            visited=new HashSet<>();
        }
        visited.add(start);
        System.out.print(start+" ");
        for(int adjacent:graph.get(start)){
            if(!visited.contains(adjacent)){
                dfsAdjList(graph,adjacent,visited);
            }
        }
    }
    public static void main(String[] args){
        Map<Integer,List<Integer>>graph=new HashMap<>();
        graph.put(0,Arrays.asList(1,2,3));
        graph.put(1,Arrays.asList(0,3));
        graph.put(2,Arrays.asList(0,3));
        graph.put(3,Arrays.asList(0,1,2));
        System.out.println(" DFS using Adjacency List:");
        dfsAdjList(graph,0,null);
    }
}