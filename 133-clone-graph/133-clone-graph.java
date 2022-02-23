/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map = new HashMap<Node,Node>();
        formNewNodes(node,map);
        formNeighbors(map);
        //System.out.println(map.get(node));
        return map.get(node);
    }
    
    public static void formNewNodes(Node node, HashMap<Node,Node> map){
        if(node==null)
            return;
        
        map.put(node,new Node(node.val));
        for(Node neig : node.neighbors ){
            if(!map.containsKey(neig))
                formNewNodes(neig,map);
        }
            
    }
    
     public static void formNeighbors(HashMap<Node,Node> map){
         
       for(Map.Entry<Node,Node> entry : map.entrySet() ){
           
           Node original = entry.getKey();
           Node newOne = entry.getValue();
           
           for(Node neigh : original.neighbors){
               newOne.neighbors.add(map.get(neigh));
           }
           
       }
            
    }
}