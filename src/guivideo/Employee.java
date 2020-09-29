/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guivideo;


import java.io.*;
/**
 *
 * @author smile
 */
public class Employee implements Serializable{
    
    private String name;
    private String surname;
    private Job job;
    private int staffNumber;

    public Employee(String name, String surname, Job job, int staffNumber) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.staffNumber = staffNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Job getJob() {
        return job;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }
    
    
    
}
