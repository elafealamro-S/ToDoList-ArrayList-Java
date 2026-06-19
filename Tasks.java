/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emma
 */
public class Tasks {
    private String taskTittle;
    private String DueDate;
    private int status;

    public Tasks() {
        
    }

    public Tasks(String taskTittle, String DueDate, int status) {
        this.taskTittle = taskTittle;
        this.DueDate = DueDate;
        this.status = status;
    }

    public String getTaskTittle() {
        return taskTittle;
    }

    public void setTaskTittle(String taskTittle) {
        this.taskTittle = taskTittle;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String str = String.format("%-30s%-30s%d\n",this.taskTittle,this.DueDate,this.status);
        return str;
    }
    
    
    
    
}
