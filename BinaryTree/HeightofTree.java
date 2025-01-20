package Java_Programming.BinaryTree;

public class HeightofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node binaryTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = binaryTree(nodes);
            newNode.right = binaryTree(nodes);

            return newNode;
        }
    }
    public static int HeightofTree(Node root){
        if(root == null){
            return 0;
        }
        int leftTree = HeightofTree(root.left);
        int rightTree = HeightofTree(root.right);
        return Math.max(leftTree,rightTree)+1;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.binaryTree(nodes);
        System.out.println(HeightofTree(root));
    }
}
