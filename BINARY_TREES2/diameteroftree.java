package BINARY_TREES2;

import java.util.*;
import java.util.Queue;

public class diameteroftree {
    
    static class Node {

        int data;

        Node left;

        Node right;

        Node(int data) {

            this.data = data;

            this.left = null;

            this.right = null;

        }
    }

    public static int height(Node root){

        if(root==null){

            return 0;

        }
        int lh=height(root.left);

        int rh=height(root.right);

        return Math.max(lh, rh)+1;

    }

    public static int diameter(Node root){

        if(root==null){

            return 0;

        }
        int leftDiam=diameter(root.left);

        int leftht=height(root.left);

        int rightDiam=diameter(root.right);

        int rightht=diameter(root.right);
        
        int selfDiam =leftht+rightht+1;

        return Math.max(selfDiam,Math.max(leftDiam, rightDiam));

    }

    public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        else if(node==null|| subRoot==null|| node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;

    }

    public static boolean isSubtree(Node root,Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        
        
        return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);
    }
    static class Info{
        Node node;
        int hd;
        public Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topView(Node root){
        // Level order
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        int min=0,max=0;
        q.add(new Info(root, 0));
        q.add(null);


        while (!q.isEmpty()) {
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
            if(!map.containsKey(curr.hd)){ // first time my hd is occuring
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left!=null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max=Math.max(max,curr.hd+1);  
            }
        }
        }
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).data+" ");
        }
        System.out.println();

        
    }

    public static void main(String[] args) {

        /*
            1
          /  \
         2    3
        / \  / \
       4  5 6   7 
         
         */
        
        Node root=new Node(1);

        root.left=new Node(2);

        root.right=new Node(3);

        root.left.left=new Node(4);

        root.left.right= new Node(5);

        root.right.left=new Node(6);

        root.right.right=new Node(7);

        topView(root);

    //    /*  2    
    //       / \ 
    //      4   5  
    //    */

    //     Node subroot=new Node(2);
    //     subroot.left=new Node(4);
    //     subroot.right=new Node(5);

    // System.out.println(isSubtree(root, subroot));

    }

}