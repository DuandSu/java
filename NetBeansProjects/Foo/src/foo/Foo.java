/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;


/**
 *
 * @author Duane
 */
public class Foo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ff
        ChildTreeNode root = new ChildTreeNode();
        
        callFoo(root);
    }
    
    public void callFoo(ChildTreeNode root) {
        
        Stack nodes = new Stack();
        nodes.Push(root);
        
        while (nodes.Count > 0) {
            ChildTreeNode node = (ChildTreeNode) nodes.Pop();
            System.out.println(node.Text);
            for (int i = node.Nodes.Count -1; i >= 0; i--)
                nodes.Push(node.Nodes[i]);
        }
    }
    
}
