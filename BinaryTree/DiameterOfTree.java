package Java_Programming.BinaryTree;

public class DiameterOfTree {
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
    public static int heightoftree(Node root){
        if(root == null){
            return 0;
        }
        int leftTree = heightoftree(root.left);
        int rightTree = heightoftree(root.right);
        
        return Math.max(leftTree,rightTree)+1;
    }
    public static int DiameterOfTree(Node root){
        if(root == null){
            return 0;
        }
        int Diameterleft = DiameterOfTree(root.left);
        int Diameterright = DiameterOfTree(root.right);
        int Diameter = heightoftree(root.left) + heightoftree(root.right) + 1;
        return Math.max(Diameter,Math.max(Diameterleft,Diameterright));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.binaryTree(nodes);
        System.out.println(DiameterOfTree(root));
    }
}
