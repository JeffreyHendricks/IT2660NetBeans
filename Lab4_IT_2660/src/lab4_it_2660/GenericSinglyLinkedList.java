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
public class GenericSinglyLinkedList<T> implements GenericNode{
    
    private Node h;     
    private Node l;     
    private Node next;
    private int size;
    
    public GenericSinglyLinkedList()
    {
        h = new Node();
        l = null;
        next = null;
        size = 0;
    }
    
    public void append(Node newNode)
    {
       int i = 0;
       while(i <= size){
           
         l = getNode(i, false);
         i++;    
       }
       
        
         l.setNextNode(newNode);
            size++;
    }
    
    public void insertNewRoot(Node node)
    {
        node.setNextNode(h);
        h = node;
        size++;
    }
    
    
    public boolean insert(Node newNode, int index)
    {
        if(newNode == null)
        return false;
        else
        {
        Node target = getNode(index, false);
        newNode.setNextNode(target.getNextNode());
        target.setNextNode(newNode);
        size++;
        return true;
        }
    }
    
    public void printList()
    {
        System.out.println("List size: " + size);
        getNode(size, true);
    }
    
    public Node getNode(int pos, boolean print)
    {
        Node w = h;
        
        for(int i = 1; i <= pos; i++)
        {
            if(print)
            {
                System.out.println(w.getValue() + " ");
            }
            
            w = w.getNextNode();
        }
        
        return w;
    }
    
    public Node fetch(String targetKey)
    {
        Node p = h.getNextNode();
        while(p != null && !(p.getValue().compareTo(targetKey) == 0))
        {
            p = p.getNextNode();
        }
        if(p != null)
            return p.deepCopy();
        else 
            return null;
    }
    
    public boolean delete(String targetKey)
    {
        Node q = h;
        Node p = h.getNextNode();
        while(p != null && !(p.getValue().compareTo(targetKey) == 0))
        {
            q = p;
            p = p.getNextNode();
        }
        if(p != null)
        {
            q.setNextNode(p.getNextNode());
            return true;
        }
        else
            return false;
    }
    
    public boolean update(String targetKey, Node newNode, int pos)
    {
        if(delete(targetKey) == false)
            return false;
        else if(insert(newNode,pos) == false)
            return false;
        return true;
    }
    
    public void showAll()
    {
        Node p = h.getNextNode();
        while(p != null)
        {
            System.out.println(p.getValue());
            System.out.println(p.getList());
            p = p.getNextNode();
        }
    }

    @Override
    public GenericNode deepCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
