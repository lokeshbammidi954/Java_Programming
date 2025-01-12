package Java_Programming.BinaryTree;

public class PostOrderBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
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
    public static void PostOrder(Node root,int x){
        if(root == null){
            return;
        }
        PostOrder(root.left,x);
        PostOrder(root.right,x);
        System.out.println(root.data+" ");
        if(root.data == x){
            System.out.println(root.data+" Matchs ");
        }
    }
   public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    int x = 4;
    BinaryTree BT = new BinaryTree();
    Node root = BT.binaryTree(nodes);
    PostOrder(root,x);
   } 
}
