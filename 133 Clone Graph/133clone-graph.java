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
    HashMap<Node,Node> hm;
    public void compute(Node node){
        if(node==null || hm.getOrDefault(node,null)!=null)return;
        Node new_node=new Node(node.val);// new node with the value 
        
        hm.put(node,new_node);
        for(Node n:node.neighbors){
            Node temp=hm.getOrDefault(n,null);
            if(temp==null){
                compute(n);
                temp=hm.get(n);
            }
            new_node.neighbors.add(temp);
        }
    }

    public Node cloneGraph(Node node) {
        hm=new HashMap<>();
        compute(node);
        return hm.get(node);
    }
}