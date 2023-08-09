package com.edubridge.sms.dao;
import java.util.ArrayList;
import java.util.Scanner;

import com.edubridge.sms.model.Student;
import com.edubridge.sms.model.Teacher;

public class StudentDAO{
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Student> studentList = new ArrayList<Student>();

	static {

		studentList.add(new Student(101, "Raman", "Mumbai", "V", 9876453));
		studentList.add(new Student(102, "Suman", "Chennai", "V", 9776453));
		studentList.add(new Student(103, "Krishna", "Delhi", "V", 7676453));
	}

	public void addStudent() {
			System.out.println("Enter student Id: ");
			int studentId = sc.nextInt();
			System.out.println("Enter student Name: ");
			String studentName = sc.next();
			System.out.println("Enter student Address: ");
			String studentAddress = sc.next();
			System.out.println("Enter student class: ");
			String studentClass = sc.next();
			System.out.println("Enter student Contact: ");
			long studentContact = sc.nextLong();

			studentList.add(new Student(studentId, studentName, studentAddress, studentClass, studentContact));
            System.out.println("Student Added successfully!!!");
			
		
		 
	}
	
	public void updateStudentDetails(){
		System.out.println("Which student details you want to update?");
		System.out.println("Enter Student Id");
		int flag = 0;
		int index = 0;
		int studentId = sc.nextInt();
		Student s = null;
		
		for(Student student : studentList) {
		     if(studentId == student.getStudentId()) {
			   flag = 1;
			   index = studentList.indexOf(student);
			   s = student;
			   break;
		   }
		}
		     if (flag == 1) {
		    	    
		    	    System.out.println("1.Update name");
		    	    System.out.println("2.Update Address");
		    	    System.out.println("3.Update Class");
		    	    System.out.println("4.Update Contact");
		    	    System.out.println("5.Update all Details");
		    	    System.out.println("Enter your choice to update details");
		    	    int ch = sc.nextInt();
		    	    switch(ch) {
		    	    case 1:System.out.println("Enter student Name: ");
					String studentName = sc.next();
					s.setStudentName(studentName);
					break;
		    	    case 2:System.out.println("Enter student Address: ");
					String studentAddress = sc.next();
					s.setStudentAddress(studentAddress);
					break;
		    	    case 3:System.out.println("Enter student class: ");
					String studentClass = sc.next();
					s.setStudentClass(studentClass);
					break;
		    	    case 4:System.out.println("Enter student Contact: ");
					long studentContact = sc.nextLong();
					s.setStudentContact(studentContact);
					break;
		    	    case 5:System.out.println("Enter student Name: ");
					       studentName = sc.next();
					       System.out.println("Enter student Address: ");
					       studentAddress = sc.next();
					       System.out.println("Enter student class: ");
					       studentClass = sc.next();
					       System.out.println("Enter student Contact: ");
					       studentContact = sc.nextLong();

					       s.setStudentName(studentName);
					       s.setStudentAddress(studentAddress);
					       s.setStudentClass(studentClass);
					       s.setStudentContact(studentContact);

		    	    }
					studentList.set(index, s);
					System.out.println(
							"==================================================================================================");

					System.out.println("Student Details updated!!");
				 
		     }
		    else {
					System.out.println("Id does not exist!!");
			 }
				System.out.println("==================================================================================================");
	    
	    
	
}
	
	
	public void displayAllStudents() {
		for (Student s : studentList) {
	        System.out.println(s.toString());
	    }
	    System.out.println("======================================================");
	}
	
	
	public void searchStudent() {
	    System.out.println("Enter the name of the Student: ");
	    String studentName = sc.next();
	    Teacher t = null;
        boolean found = false;
	    for (Student student : studentList) {
	        if (studentName.equals(student.getStudentName())) {
	            int index = studentList.indexOf(student);
	            System.out.println("Details of the searched student:");
	            System.out.println(studentList.get(index));
	            found = true;
	            break;
	        }
	        
	    }
	    if(!found) {
	    	System.out.println("No such student in database");

	    }
	}

	
	
	
}
