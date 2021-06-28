class Solution {
    private Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        helper(node);
        return map.get(node);
    }
    private Node helper(Node node) {
        if (node == null) return null;
        if (map.containsKey(node)) return map.get(node);
        Node clone_node = new Node(node.val, new ArrayList<Node>());
        map.put(node, clone_node);
        for (Node neighbor : node.neighbors) {
            clone_node.neighbors.add(helper(neighbor));
        }
        return clone_node;
    }
}
