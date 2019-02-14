/*
 * The purpose of this class is to create a dynamic memory array
 * to use for the storage of as many or few StudentListings objects
 * a user wants to create. The second purpose of this class is to 
 * implement the four basic operations and make use of them.
 */
package lab2_it_2660;

/**
 *
 * @author jeff
 */
public class ListOfStudents {
    
    private StudentListings[] list;
    
    public ListOfStudents(StudentListings firstStudent)
    {
        this.list = new StudentListings[1];
        this.list[0] = firstStudent;
    }
    
    public boolean insert(StudentListings student, int position)
    {
        if(this.list.length == 0 && position == 0)
        {
            this.list = new StudentListings[1];
            this.list[0] = student.deepCopy();
            return true;
        }
        
        if(position < 0 || position > this.list.length)
        {
            System.out.println("The position you tried to enter in was either too big or too small!");
            return false;
        }
        
        StudentListings[] newStudentList = new StudentListings[this.list.length + 1];
        
        for(int i = 0; i < this.list.length + 1; i++)
        {
            if(i < position)
            {
                newStudentList[i] = this.list[i];
            }
            else if( i > position)
            {
                newStudentList[i] = this.list[i - 1];
            }
            else
            {
                newStudentList[i] = student;
            }
        }
        this.list = newStudentList;
        return true;
    }
    
    public boolean delete(String targetKey)
    {
        int i = 0;
        int length = list.length;
        while(i < length && !(list[i].compareTo(targetKey) == 0))
        {
            i++;
        }  
        
        if(i == length)        
             return false;
        
        //Move the last node into the deleted nodes position for garbage collection purposes
        list[i] = list[length - 1];
        list[length - 1] = null;
        length = length - 1;
        return true;
            
    }
    
    public StudentListings fetch(String targetKey)
    {
        StudentListings newStudent;
        StudentListings temp;
        
        int i = 0;
        int length = list.length;
        while(i < length && !(list[i].compareTo(targetKey) == 0))
        {
            i++;
        }
        
        if(i == length)
            return null;
        
        newStudent = list[i].deepCopy();
        
        if(i != 0)
        {
            temp = list[i - 1];
            list[i - 1] = list[i];
            list[i] = temp;
        }
        return newStudent;
    }
    
    public boolean update(String targetKey, StudentListings newStudent, int position)
    {
        if(delete(targetKey) == false)
            return false;
        else if(insert(newStudent, position) == false)
            return false;
        else
            return true;
    }
    
    public void showAll()
    {
                for(int i = 0; i < list.length; i++)
                {
                   if(list[i] == null)
                   {
                       System.out.println("Node has been emptied to null");
                   }
                   else
                   {
                    System.out.println(list[i].toString());
                   }
                }                
    }   
}
