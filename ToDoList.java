
import java.util.*;


public class ToDoList {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        
        ArrayList <Tasks> task=new ArrayList<Tasks>();
       
        String Question = "";
        
        do{
        
            System.out.print("Enter the Tittle of the Task:");
        
            String tittle=in.nextLine();
        
            System.out.print("Enter the Task Due Date:");
        
            String Date=in.nextLine();
        
            System.out.print("Enter the Status:");
        
            int state=in.nextInt();
        
        
            Tasks t=new Tasks(tittle,Date,state);
            task.add(t);
        
            System.out.print("Continue adding (y/n)?");
             Question = in.next();
             in.nextLine();
        
        
        
        
        
        }while(Question.equalsIgnoreCase("y"));
        
        System.out.println();
        System.out.println("To do List Contains");
        System.out.println("------------------------------------------------------------");
        
        
        
        for(int i=0; i<task.size();i++){
        
        System.out.print(task.get(i).toString());
        }
        
    }
    
}
