package com.project;

 class Student {

	
private	int studentid;
private	String name;
private	int age;
private	double marks;

 
public void setstudentid(int studentid) {
	this.studentid = studentid;
	
}


 public void setname(String name) {
	this.name = name;
	
 }

 public void setage(int age) {
	this.age = age;
 }

  public void setmarks(double marks) {
	this.marks = marks;
 }

 public int getstudentid( ) {
	return studentid;
  }

  public String getname() {
	return name;
   }

  public int getage() {
	return age;
   }

  public double getmarks() {
	return marks;
   }
  


	
}
