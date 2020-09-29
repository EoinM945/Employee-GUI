/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guivideo;
/**
 *
 * @author smile
 */
import java.io.*;

public class Job {
    
    private double salary;
    private String nameOfJob;

    public Job(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }

    
    public boolean equals(Job job){
        
        return (this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob));
            
     
        
    }
    
    public double getSalary() {
        return salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }
    
    
    
}
