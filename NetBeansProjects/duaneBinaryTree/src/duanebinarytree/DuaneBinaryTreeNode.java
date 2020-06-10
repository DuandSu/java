/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duanebinarytree;

import java.util.ArrayList;

/**
 *
 * @author Duane
 */
public class DuaneBinaryTreeNode {
    public String value;
    public DuaneBinaryTreeNode leftChild;
    public DuaneBinaryTreeNode rightChild;
    
    public DuaneBinaryTreeNode () {
        value = "";
        leftChild = null;
        rightChild = null;
    }
    
    public DuaneBinaryTreeNode (String value) {
        
        this();
        this.value = value;
    }
    
    public void addDuaneBinaryTreeNode (String value) {

        
        if (this.value.equals("")) {
            this.value = value;
        }
        else {
            if (value.compareTo(this.value) < 0 || value.equals(this.value)) {
                if (this.leftChild == null) {
                    DuaneBinaryTreeNode nextNode = new DuaneBinaryTreeNode(value);
                    this.leftChild = nextNode;
                }
                else {
                    this.leftChild.addDuaneBinaryTreeNode (value);
                }
            }
            else {
                if (this.rightChild == null) {
                    DuaneBinaryTreeNode nextNode = new DuaneBinaryTreeNode(value);
                    this.rightChild = nextNode;
                }
                else {
                    this.rightChild.addDuaneBinaryTreeNode (value);
                }
            }
        }
    }

    public void insertLeftDuaneBinaryTreeNode (String value) {

        DuaneBinaryTreeNode nextNode = new DuaneBinaryTreeNode(value);
        this.leftChild = nextNode;
        
    }

    public void insertRightDuaneBinaryTreeNode (String value) {
        
        DuaneBinaryTreeNode nextNode = new DuaneBinaryTreeNode(value);
        this.rightChild = nextNode;

    }

    public boolean findNodeDuaneBinaryTree(String value) {

        boolean foundNode = false;

        if (this.value.equals(value))
            foundNode = true;
        else if (value.compareTo(this.value) < 0) {
            if (this.leftChild != null)
                foundNode = this.leftChild.findNodeDuaneBinaryTree(value);
        }
        else {
            if (this.rightChild !=null)
                foundNode = this.rightChild.findNodeDuaneBinaryTree(value);
        }
        return foundNode;
    }

    /*
    ** Print using Depth First Search (DFS) Pre-Order
    */
    public void printDFSPreOrderDuaneBinaryTree() {
        System.out.println("Node Value = " + this.value);
        if (this.leftChild != null) {
            this.leftChild.printDFSPreOrderDuaneBinaryTree();
        }
        if (this.rightChild !=null) {
            this.rightChild.printDFSPreOrderDuaneBinaryTree();
        }
        
    }

    /*
    ** Print using Depth First Search (DFS) In-Order
    */
    public void printDFSInOrderDuaneBinaryTree() {
        if (this.leftChild != null) {
            this.leftChild.printDFSInOrderDuaneBinaryTree();
        }
        System.out.println("Node Value = " + this.value);
        if (this.rightChild !=null) {
            this.rightChild.printDFSInOrderDuaneBinaryTree();
        }
        
    }
    
    /*
    ** Print using Depth First Search (DFS) Post-Order
    */
    public void printDFSPostOrderDuaneBinaryTree() {
        if (this.leftChild != null) {
            this.leftChild.printDFSPostOrderDuaneBinaryTree();
        }

        if (this.rightChild !=null) {
            this.rightChild.printDFSPostOrderDuaneBinaryTree();
        }

        System.out.println("Node Value = " + this.value);
    }

    /*
    ** Print using Breadth-First Search (BFS) using my own aloorithm
    */
    public void printBFSDuaneBinaryTree() {
        
        DuaneLinkedListNode head = new DuaneLinkedListNode("HEAD", -1);
        DuaneLinkedListNode tail = new DuaneLinkedListNode("TAIL", -2);
        
        
        tail = this.printBFSDuaneBinaryTree(head, head.level);
        head.sortByLevelDuaneLinkedList();
        head.printDuaneLinkedList();
    }

    public DuaneLinkedListNode printBFSDuaneBinaryTree(DuaneLinkedListNode linkListNode, int level) {

        DuaneLinkedListNode tail = new DuaneLinkedListNode("TAIL", -2);

        level++;
        tail = linkListNode.addDuaneLinkedListNode(this.value, level);

        if (this.leftChild != null) {
            tail = this.leftChild.printBFSDuaneBinaryTree(tail, level);
        }
        
        if (this.rightChild !=null) {
            tail = this.rightChild.printBFSDuaneBinaryTree(tail, level);
        }
        
        return tail;
    }

    /*
    ** Print using Breadth-First Search (BFS) using freeCampCode aloorithm
    */
    public void printBFSfreeCampCodeBinaryTree() {
        
        DuaneBinaryTreeNode currentNode = new DuaneBinaryTreeNode();

        ArrayList <DuaneBinaryTreeNode> tempQueue = new ArrayList();
        tempQueue.add(this);
        
        while (!tempQueue.isEmpty()) {
            
            currentNode = tempQueue.remove(0);
            System.out.println("Node Value = " + currentNode.value);
            
            if (currentNode.leftChild != null)
                tempQueue.add(currentNode.leftChild);
            
            if (currentNode.rightChild != null)
                tempQueue.add(currentNode.rightChild);

        }
    }
}
