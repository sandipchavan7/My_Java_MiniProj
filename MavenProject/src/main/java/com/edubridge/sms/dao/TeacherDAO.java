package com.edubridge.sms.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.edubridge.sms.model.Teacher;


public class TeacherDAO {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
  {

		teacherList.add(new Teacher(101, "Sharad", "Mumbai", "Math", 9876453));
		teacherList.add(new Teacher(102, "Sham", "Chennai", "Science", 9776453));
		teacherList.add(new Teacher(103, "Shreedhar", "Delhi", "Chemistry", 7676453));
	}

	public void addTeacher() {
			System.out.println("Enter teacher Id: ");
			int teacherID = sc.nextInt();
			System.out.println("Enter teacher Name: ");
			String teacherName = sc.next();
			System.out.println("Enter teacher Address: ");
			String teacherAddress = sc.next();
			System.out.println("Enter teacher subject: ");
			String teacherSubject = sc.next();
			System.out.println("Enter teacher Contact: ");
			long teacherContact = sc.nextLong();

			teacherList.add(new Teacher(teacherID,teacherName,teacherAddress,teacherSubject,teacherContact));
            System.out.println("Teacher Added successfully!!!");
	        for(Teacher t : teacherList) {
	        	System.out.println(t.toString());
	        }
	}

	public void updateTeacher() {
		System.out.println("Which teacher details you want to update?");
		System.out.println("Enter teacher Id");
		int flag = 0;
		int index = 0;
		int teacherID = sc.nextInt();
		Teacher s = null;
		
		for(Teacher teacher : teacherList) {
		     if(teacherID == teacher.getTeacherID()) {
			   flag = 1;
			   index = teacherList.indexOf(teacher);
			   s = teacher;
			   break;
		   }
		}
		if (flag == 1) {
    	    
    	    System.out.println("1.Update name");
    	    System.out.println("2.Update Address");
    	    System.out.println("3.Update Subject");
    	    System.out.println("4.Update Contact");
    	    System.out.println("5.Update all Details");
    	    System.out.println("Enter your choice to update details");
    	    int ch = sc.nextInt();
    	    switch(ch) {
    	    case 1:System.out.println("Enter teacher Name: ");
			String teacherName = sc.next();
			s.setTeacherName(teacherName);
			break;
    	    case 2:System.out.println("Enter teacher Address: ");
			String teacherAddress = sc.next();
			s.setTeacherAddress(teacherAddress);
			break;
    	    case 3:System.out.println("Enter teacher Subject: ");
			String teacherSubject = sc.next();
			s.setTeacherSubject(teacherSubject);
			break;
    	    case 4:System.out.println("Enter teacher Contact: ");
			long teacherContact = sc.nextLong();
			s.setTeacherContact(teacherContact);
			break;
    	    case 5:System.out.println("Enter teacher Name: ");
			       teacherName = sc.next();
			       System.out.println("Enter teacher Address: ");
			       teacherAddress = sc.next();
			       System.out.println("Enter teacher subject: ");
			       teacherSubject = sc.next();
			       System.out.println("Enter teacher Contact: ");
			       teacherContact = sc.nextLong();

			       s.setTeacherName(teacherName);
			       s.setTeacherAddress(teacherAddress);
			       s.setTeacherSubject(teacherSubject);
			       s.setTeacherContact(teacherContact);

    	    }
    	    teacherList.set(index, s);
			System.out.println(
					"==================================================================================================");

			System.out.println("teacher Details updated!!");
			
			for(Teacher t : teacherList) {
	        	System.out.println(t.toString());
	       
	        }
		 
     }
    else {
			System.out.println("Id does not exist!!");
	 }
		
		System.out.println("==================================================================================================");



      }
	

	public void deleteTeacher() {
		System.out.println("Which teacher details you want to delete?");
		System.out.println("Enter teacher Id");
		int teacherID = sc.nextInt();
		Teacher t = null;
		for(Teacher teacher : teacherList) {
		     if(teacherID == teacher.getTeacherID()) {
			   int index = teacherList.indexOf(teacher);
			   teacherList.remove(index);
			   System.out.println("Details deleted successfully!!");
			   break;
		   }
		}
	}
	
	public void searchTeacher() {
	    System.out.println("Enter the name of the teacher: ");
	    String teacherName = sc.next();
	    Teacher t = null;
        boolean found = false;
	    for (Teacher teacher : teacherList) {
	        if (teacherName.equals(teacher.getTeacherName())) {
	            int index = teacherList.indexOf(teacher);
	            System.out.println("Details of the searched Teacher:");
	            System.out.println(teacherList.get(index));
	            found = true;
	            break;
	        }
	    }
	    if(!found) {
	    	System.out.println("No such teacher in database");

	    }
	}

}
