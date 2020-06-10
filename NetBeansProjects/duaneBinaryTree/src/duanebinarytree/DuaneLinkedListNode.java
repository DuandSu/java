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
public class DuaneLinkedListNode {

    public String value;
    public int level;
    public DuaneLinkedListNode previous;
    public DuaneLinkedListNode next;
    
    public DuaneLinkedListNode () {
        value = "";
        level = 0;
        previous = null;
        next = null;
    }
    
    public DuaneLinkedListNode (String value) {
        
        this();
        this.value = value;
    }
    
    public DuaneLinkedListNode (String value, int level) {
        
        this(value);
        this.level = level;
    }

    public DuaneLinkedListNode addDuaneLinkedListNode(String value, int level) {

        DuaneLinkedListNode tail = new DuaneLinkedListNode("TAIL", -2);
        DuaneLinkedListNode LinkListNode = new DuaneLinkedListNode(value, level);

        this.next = LinkListNode;
        LinkListNode.previous = this;
        
        return  LinkListNode;
        
    }

    public DuaneLinkedListNode popDuaneLinkedListNode() {

        DuaneLinkedListNode LinkListNode = new DuaneLinkedListNode("Dummy", 0);

        LinkListNode = this.next;

        if (this.next.next != null) {
            this.next.next.previous = this;
            this.next = this.next.next;
        }

        LinkListNode.next = null;
        LinkListNode.previous = null;
        
        return  LinkListNode;
        
    }

    public void swapWithNextDuaneLinkedListNode() {
        
        DuaneLinkedListNode temp = new DuaneLinkedListNode("TEMP", -3);

        temp.next = this.next.next;

        if (this.next.next != null) this.next.next.previous = this;
        this.next.next = this;
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = this.next;
        this.next = temp.next;

    }
    
    public void sortByLevelDuaneLinkedList() {

        //DuaneLinkedListNode temp = new DuaneLinkedListNode("TEMP", -3);

        if (this.next != null) {
            if (this.level <= this.next.level) {
                this.next.sortByLevelDuaneLinkedList();
            }
            else {

                this.swapWithNextDuaneLinkedListNode();

                if (!this.previous.previous.value.equals("HEAD")) {
                    this.previous.previous.sortByLevelDuaneLinkedList();
                }
            }
        }
    }
    
    public void printDuaneLinkedList() {

        System.out.println("Node Value = " + this.value + ", Node Level = " + this.level);
        if (this.next != null) {
            this.next.printDuaneLinkedList();
        }
    }
}
