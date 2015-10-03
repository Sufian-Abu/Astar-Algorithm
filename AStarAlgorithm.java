package astaralgorithm;

/**
 *
 * @author abu sufian
 */
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class AStarAlgorithm {

    
        //h scores is the stright-line distance from current node to goal node
        public static void main(String[] args){
 
               
                Node n1 = new Node("2,1",20);
                Node n2 = new Node("0,1",94);
                Node n3 = new Node("0,2",84);
                Node n4 = new Node("0,3",74);
                Node n5 = new Node("1,0",74);
                Node n6 = new Node("1,1",60);
                Node n7 = new Node("1,2",54);
                Node n8 = new Node("2,0",60);
                Node n9 = new Node("0,0",108);
                Node n10 = new Node("2,2",40);
                Node n11 = new Node("3,0",74);
                Node n12 = new Node("3,1",60);
                Node n13 = new Node("3,2",54);
                Node n14 = new Node("4,2",74);
                Node n15 = new Node("4,3",74);
                Node n16 = new Node("4,4",74);
                Node n17 = new Node("4,5",74);
                Node n18 = new Node("3,4",74);
                Node n19 = new Node("3,5",68);
                Node n20 = new Node("3,6",88);
                Node n21 = new Node("2,4",82);
                Node n22 = new Node("2,5",0);
                Node n23 = new Node("2,6",82);
 
                //initialize the edges
 
                //node1
                n1.adjacencies = new Edge[]{
                        new Edge(n5,60),
                        new Edge(n6,50),
                        new Edge(n7,40),
                        new Edge(n8,50),
                        new Edge(n10,30),
                        new Edge(n11,60),
                        new Edge(n12,50),
                        new Edge(n13,40),
                       
                };
                 
                 //node2
                n2.adjacencies = new Edge[]{
                        new Edge(n9,108),
                        new Edge(n3,60),
                        new Edge(n5,60),
                        new Edge(n6,50),
                };
                 
 
                 //node3
                n3.adjacencies = new Edge[]{
                        new Edge(n2,70),
                        new Edge(n4,50),
                        new Edge(n5,60),
                        new Edge(n6,50),
                        new Edge(n7,40),
                        
                };
                 
                 //node4
                n4.adjacencies = new Edge[]{
                        new Edge(n3,60),
                        new Edge(n6,50),
                        new Edge(n7,40),
                        
                };
                 
 
                 //node5
                n5.adjacencies = new Edge[]{
                        new Edge(n9,108),
                        new Edge(n2,70),
                        new Edge(n6,50),
                        new Edge(n8,50),
                        new Edge(n1,20),
                };
                 
                 //node6
                n6.adjacencies = new Edge[]{
                        new Edge(n9,108),
                        new Edge(n2,70),
                        new Edge(n3,60),
                        new Edge(n5,60),
                        new Edge(n7,40),
                        new Edge(n8,50),
                        new Edge(n1,20),
                        new Edge(n10,30),
                        
                };
                 
                 //node7
                n7.adjacencies = new Edge[]{
                        new Edge(n2,70),
                        new Edge(n3,60),
                        new Edge(n4,50),
                        new Edge(n6,50),
                        new Edge(n1,20),
                        new Edge(n10,30),
                };
                 
                 //node8
                n8.adjacencies = new Edge[]{
                        new Edge(n5,60),
                        new Edge(n6,50),
                        new Edge(n1,20),
                        new Edge(n11,60),
                        new Edge(n12,50),
                };
                 
                 //node9
                n9.adjacencies = new Edge[]{
                        new Edge(n2,70),
                        new Edge(n5,60),
                        new Edge(n6,50)
                };
 
                 //node10
                n10.adjacencies = new Edge[]{
                        new Edge(n6,50),
                        new Edge(n7,45),
                        new Edge(n1,20),
                        new Edge(n12,50),
                        new Edge(n13,40),
                };
                 
                 //node11
                n11.adjacencies = new Edge[]{
                        new Edge(n8,50),
                        new Edge(n1,20),
                        new Edge(n12,50),
                };
 
                 //node12
                n12.adjacencies = new Edge[]{
                        new Edge(n8,50),
                        new Edge(n1,20),
                        new Edge(n10,30),
                        new Edge(n11,60),
                        new Edge(n13,40),
                        new Edge(n14,50),
                };
 
                //node13
                n13.adjacencies = new Edge[]{
                        new Edge(n1,20),
                        new Edge(n10,30),
                        new Edge(n12,50),
                         new Edge(n14,50),
                          new Edge(n15,40),
                };
                 
                 //node14
                n14.adjacencies = new Edge[]{
                   new Edge(n13,40),
                    new Edge(n15,40)
                };
                //node15
                
                n15.adjacencies = new Edge[]{
                   new Edge(n14,50),
                    new Edge(n16,30),
                    new Edge(n18,20),
                };
                //node16
                n16.adjacencies = new Edge[]{
                   new Edge(n15,40),
                    new Edge(n17,20),
                    new Edge(n18,20)
                };
                //node17
                n17.adjacencies = new Edge[]{
                   new Edge(n16,30),
                    new Edge(n18,20),
                    new Edge(n19,10)
                };
                //node18
                n18.adjacencies = new Edge[]{
                    new Edge(n19,10),
                    new Edge(n15,40),
                    new Edge(n17,20),
                    new Edge(n16,30),
                    new Edge(n21,10),
                };
                //node19
                n19.adjacencies = new Edge[]{
                 
                    new Edge(n18,20),
                    new Edge(n20,20),
                    new Edge(n16,30),
                    new Edge(n21,10),
                    new Edge(n17,20),
                    new Edge(n22,68),
                    new Edge(n23,10),
                };
                //node20
                n20.adjacencies = new Edge[]{
                    new Edge(n17,20),
                    new Edge(n19,10),
                    new Edge(n22,68),
                    new Edge(n13,10),
                    
                };
                //node21
                n21.adjacencies = new Edge[]{
                     new Edge(n18,20),
                    new Edge(n19,10),
                     new Edge(n22,68),
                };
                //node22
                n22.adjacencies = new Edge[]{
                    new Edge(n18,20),
                    new Edge(n19,10),
                    new Edge(n20,20),
                      new Edge(n21,10),
                    new Edge(n23,10),
                     
                };
                //node23
                n23.adjacencies = new Edge[]{
                    new Edge(n19,10),
                    new Edge(n20,20),
                    new Edge(n22,68),
                };
 
                AstarSearch(n1,n14);
 
                List<Node> path = printPath(n13);
 
                        System.out.println("Path"+path);
 
 
        }
 
        public static List<Node> printPath(Node target){
                List<Node> path = new ArrayList<Node>();
        
        for(Node node = target; node!=null; node = node.parent){
            path.add(node);
        }
 
        Collections.reverse(path);
 
        return path;
        }
 
        public static void AstarSearch(Node source, Node goal){
 
                Set<Node> explored = new HashSet<Node>();
 
                PriorityQueue<Node> queue = new PriorityQueue<Node>(20, 
                        new Comparator<Node>(){
                                 //override compare method
                 public int compare(Node i, Node j){
                    if(i.f_scores > j.f_scores){
                        return 1;
                    }
 
                    else if (i.f_scores < j.f_scores){
                        return -1;
                    }
 
                    else{
                        return 0;
                    }
                 }
 
                        }
                        );
 
                //cost from start
                source.g_scores = 0;
 
                queue.add(source);
 
                boolean found = false;
 
                while((!queue.isEmpty())&&(!found)){
 
                        //the node in having the lowest f_score value
                        Node current = queue.poll();
 
                        explored.add(current);
 
                        //goal found
                        if(current.value.equals(goal.value)){
                                found = true;
                        }
 
                        //check every child of current node
                        for(Edge e : current.adjacencies){
                                Node child = e.target;
                                double cost = e.cost;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;
 
 
                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                        continue;
                                }
 
                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){
 
                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;
 
                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }
 
                                        queue.add(child);
 
                                }
 
                        }
 
                }
 
        }
        
}
 
class Node{
 
        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public Edge[] adjacencies;
        public Node parent;
 
        public Node(String val, double hVal){
                value = val;
                h_scores = hVal;
        }
 
        public String toString(){
                return value;
        }
 
}
 
class Edge{
        public final double cost;
        public final Node target;
 
        public Edge(Node targetNode, double costVal){
                target = targetNode;
                cost = costVal;
        }
}