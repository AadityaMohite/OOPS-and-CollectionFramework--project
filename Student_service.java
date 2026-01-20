package com.project;
import java.util.ArrayList;
import java.util.Scanner;
 class Student_service {

	 ArrayList<Student> al = new ArrayList<Student>();
	    

	    Scanner sc = new Scanner(System.in);
	 public void Add_student() {

		 Student s2 = new Student();

		    System.out.println("Enter the Student ID: ");
		    int studentid = sc.nextInt();
		    sc.nextLine();

		    System.out.println("Enter the Student name: ");
		    String name = sc.nextLine();

		    System.out.println("Enter the Student age: ");
		    int age = sc.nextInt();

		    System.out.println("Enter the Student marks: ");
		    double marks = sc.nextDouble();

		    s2.setstudentid(studentid);
		    s2.setname(name);
		    s2.setage(age);
		    s2.setmarks(marks);
		    al.add(s2);  
		    
		    System.out.println("Student details Added Sucessfully");
		}

	 public void Search_student() {

		    System.out.println("Enter the Student ID: ");
		    int id = sc.nextInt();

		    boolean found = false;

		    for (Student s : al) {
		        if (s.getstudentid() == id) {
		            System.out.println("Student ID : " + s.getstudentid());
		            System.out.println("Student Name : " + s.getname());
		            System.out.println("Student Age : " + s.getage());
		            System.out.println("Student Marks: " + s.getmarks());
		            found = true;
		            break;
		        }
		    }

		    if (!found) {
		        throw new Studentidnotfound("Student id is not found");
		    }
		}


	 public void Update_student() {

		    System.out.println("Enter the Student ID to Update details: ");
		    int id = sc.nextInt();
		    boolean found = false;

		    for (Student s : al) {
		        if (s.getstudentid() == id) {
		            System.out.println("Enter new name:");
		            sc.nextLine();
		            s.setname(sc.nextLine());

		            System.out.println("Enter new age:");
		            s.setage(sc.nextInt());

		            System.out.println("Enter new marks:");
		            s.setmarks(sc.nextDouble());

		            found = true;
		            System.out.println("Student details updated successfully");
		            break;
		        }
		    }

		    if (!found) {
		        throw new Studentidnotfound("Student id is not found");
		    }
		}


	public  void Delete_student() {
		
		System.out.println("Enter the Student ID to remove the Details");
		int id = sc.nextInt();
		
		boolean found = false;
		
		for(Student s : al) {
			if(s.getstudentid()==id) {
				al.remove(s);
				System.out.println("Student detils Deleted Sucessfully");
				found = true;
				break;
			}
		}
		if(!found) {
			throw new Studentidnotfound("Student id not found");
		}
		
	}
     
	
	
	
	
	
}
