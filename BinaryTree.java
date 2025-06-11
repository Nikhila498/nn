public class Main{ 
class Node{
    int val;
    Node left,right;
    Node(int val){
     this.val=val;
     left=right=null;
    }
}
public class BinaryTree{
    Node root;
    void buildSampleTree(){
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
    }
    void inOrder(Node node){
        if(node!=null){
         inOrder(node.left);
         System.out.println(node.val+" ");
         inOrder(node.right);
        }
    }
    void preOrder(Node node){
        if(node!=null){
            System.out.println(node.val+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.val+" ");
        }
    }    
     void LevelOrder(){
            if(root==null)return;
            java.util.Queue<Node>queue=new java.util.LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current=queue.poll();
                System.out.println(current.val+" ");
                if(current.left!=null)
                queue.add(current.left);
                if(current.right!=null)
                queue.add(current.right);
            }
     }
    
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.buildSampleTree();
        System.out.println("inOrder Travelar:");
        tree.inOrder(tree.root);
        System.out.println("inpreOrder Travelar:");
        tree.preOrder(tree.root);
        System.out.println("inpostOrder Travelar:");
        tree.postOrder(tree.root);
        System.out.println("inlevelOrder Travelar:");
        tree.LevelOrder();
	
	}
}
}
