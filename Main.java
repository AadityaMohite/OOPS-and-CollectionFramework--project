package com.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Student_service service = new Student_service();
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.println("Menu");
    		System.out.println("1.Add Student Details");
    		System.out.println("2.Search the Student");
    		System.out.println("3.Update Student Details");
    		System.out.println("4.Delete Student Details");
    		System.out.println("5.Exit");
    		
    		
    		
    		
    		System.out.println("Enter the choice");
    		int choice = sc.nextInt();
    		
    		
    		
    		
    		
    		switch(choice) {
    		case 1: service.Add_student();
    		   break;
    		case 2: service.Search_student();
    		   break;
    		case 3:  service.Update_student();
    		   break;
    		case 4: service.Delete_student();
    		   break;
    		case 5: System.out.println("Exisiting....");
    		 return;
            default: System.out.println("Invalid option");
    	
    		}
    			
    		
    	}
    	
    	
    	
    }
}
