/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duanebinarytree;

/**
 *
 * @author Duane
 */
public class DuaneBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DuaneBinaryTreeNode root = new DuaneBinaryTreeNode();
        root.addDuaneBinaryTreeNode("L");
        root.addDuaneBinaryTreeNode("F");
        root.addDuaneBinaryTreeNode("M");
        root.addDuaneBinaryTreeNode("B");
        root.addDuaneBinaryTreeNode("A");
        root.addDuaneBinaryTreeNode("Q");
        root.addDuaneBinaryTreeNode("R");
        root.addDuaneBinaryTreeNode("U");
        root.addDuaneBinaryTreeNode("T");
        root.addDuaneBinaryTreeNode("S");
        root.addDuaneBinaryTreeNode("Y");
        root.addDuaneBinaryTreeNode("B");

        System.out.println("Root Binary Tree (DFS Pre-Order): ");
        root.printDFSPreOrderDuaneBinaryTree();
        System.out.println("\nRoot Binary Tree (DFS In-Order): ");
        root.printDFSInOrderDuaneBinaryTree();
        System.out.println("\nRoot Binary Tree (DFS Post-Order): ");
        root.printDFSPostOrderDuaneBinaryTree();
        System.out.println("\nRoot Binary Tree (BFS): ");
        root.printBFSDuaneBinaryTree();
        System.out.println("\nRoot Binary Tree (BFS): freeCodeCamp Algorithm:");
        root.printBFSfreeCampCodeBinaryTree();
        
        DuaneBinaryTreeNode root2 = new DuaneBinaryTreeNode("a");
        root2.insertLeftDuaneBinaryTreeNode("b");
        root2.insertRightDuaneBinaryTreeNode("c");
        root2.leftChild.insertRightDuaneBinaryTreeNode("d");
        root2.rightChild.insertLeftDuaneBinaryTreeNode("e");
        root2.rightChild.insertRightDuaneBinaryTreeNode("f");

        System.out.println("\nRoot2 Binary Tree (DFS Pre-Order): ");
        root2.printDFSPreOrderDuaneBinaryTree();
        System.out.println("\nRoot2 Binary Tree (DFS In-Order): ");
        root2.printDFSInOrderDuaneBinaryTree();
        System.out.println("\nRoot2 Binary Tree (DFS Post-Order): ");
        root2.printDFSPostOrderDuaneBinaryTree();
        System.out.println("\nRoot2 Binary Tree (BFS): Duane Algorith:");
        root2.printBFSDuaneBinaryTree();
        System.out.println("\nRoot2 Binary Tree (BFS): freeCodeCamp Algorithm:");
        root2.printBFSfreeCampCodeBinaryTree();
        
        DuaneBinaryTreeNode root3 = new DuaneBinaryTreeNode();
        root3.addDuaneBinaryTreeNode("050");
        root3.addDuaneBinaryTreeNode("076");
        root3.addDuaneBinaryTreeNode("021");
        root3.addDuaneBinaryTreeNode("004");
        root3.addDuaneBinaryTreeNode("032");
        root3.addDuaneBinaryTreeNode("100");
        root3.addDuaneBinaryTreeNode("064");
        root3.addDuaneBinaryTreeNode("052");

        System.out.println("\nRoot3 Binary Tree (DFS Pre-Order): ");
        root3.printDFSPreOrderDuaneBinaryTree();
        System.out.println("\nRoot3 Binary Tree (DFS In-Order): ");
        root3.printDFSInOrderDuaneBinaryTree();
        System.out.println("\nRoot3 Binary Tree (DFS Post-Order): ");
        root3.printDFSPostOrderDuaneBinaryTree();
        System.out.println("\nRoot3 Binary Tree (BFS): Duane Algorith:");
        root3.printBFSDuaneBinaryTree();
        System.out.println("\nRoot3 Binary Tree (BFS): freeCodeCamp Algorithm:");
        root3.printBFSfreeCampCodeBinaryTree();
        System.out.println("Found 064? " + root3.findNodeDuaneBinaryTree("064"));
        System.out.println("Found 055? " + root3.findNodeDuaneBinaryTree("055"));
        System.out.println("Found 050? " + root3.findNodeDuaneBinaryTree("050"));
    }
}
