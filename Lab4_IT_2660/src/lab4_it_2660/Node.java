/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_it_2660;

/**
 *
 * @author jeff
 */
public class Node {
         private String value;
         private Node next;
         private Listing list;
        
        public Node()
        {
            
        }
        public Node(String newValue, Listing newList)
        {
            this.value = newValue;
            this.list = newList;
        }
        
        public String getValue()
        {
            return this.value;
        }
        
        public Node getNextNode()
        {
            return this.next;
        }
        
        public void setNextNode(Node nextNode)
        {
            this.next = nextNode;
        }
        
        public Node deepCopy()
        {
            Node clone = new Node(value, list);
            return clone;
        }
        
        public Listing getList()
        {
            return this.list;
        }
        
        public void print()
        {
            System.out.println(list);
        }
    }

