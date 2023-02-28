package com.example.demo.toDoApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="D1")
public class details {
	@Id
     private int id;
	@Column(name="NAME")
     private String nameString; 
	@Column(name="STATUS")
     private boolean isCompleted;
     public details(int id,String nameString,boolean isCompleted) {
    	 super();
    	 this.id=id;
    	 this.nameString=nameString;
    	 this.isCompleted=isCompleted;
     }
     public details() {
    	 super();
     }
     
     public int getId() {
    	 return id;
     }
     
     public void setId(int id) {
    	 this.id=id;
     }
     
     public String getNameString() {
    	 return nameString;
     }
     
     public void setNameString(String nameString) {
    	 this.nameString=nameString;
     }
     
     public boolean getisCompleted() {
    	 return isCompleted;
     }
     
     public void setisCompleted(boolean isCompleted) {
    	 this.isCompleted=isCompleted;
     }
}
