
package com.edubridge.sms.main;


import java.util.ArrayList;
import java.util.Scanner;

import com.edubridge.sms.dao.StudentDAO;
import com.edubridge.sms.dao.TeacherDAO;
import com.edubridge.sms.model.FeeCollection;


public class StudentManagenent {
	public static void main(String[] args) {
       System.out.println("=================================================");
       System.out.println("===============Student Management================");
       System.out.println("=================================================");
	   
       do {
    	   System.out.println();
    	   System.out.println("1.Add New Student");
    	   System.out.println("2.Update Student Details");
    	   System.out.println("3.Display All Students");
    	   System.out.println("4.Collect Fees");
    	   System.out.println("5.Display Fees Details");
    	   System.out.println("6.Add New Teacher");
    	   System.out.println("7.Update Teacher Details");
    	   System.out.println("8.Delete Teacher Details");
    	   System.out.println("9.Search Student Details");
    	   System.out.println("10.Search Teacher Details");
    	   System.out.println("0.Exit System");
    	   System.out.println();
    	   System.out.println("--------------------Enter your Choice-------------------");
    	   
    	   StudentDAO app = new StudentDAO();
    	   FeeCollection fd = new FeeCollection();
    	   TeacherDAO ti = new TeacherDAO();
    	   Scanner in = new Scanner(System.in);
    	   int choice = in.nextInt();
    	 
		   switch(choice) {
		
		    case 1: 
		    	   app.addStudent();
		    	   break;
		    	  
		    case 2:
		    	   app.updateStudentDetails();
		    	   break;
		    	   
		    case 3:
		    	   app.displayAllStudents();
		    	   break;
		    	   
		    case 4:
			try {
				fd.collectFees();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    case 5:
		    	  fd.displayFeeDetails();
		    	  break;
		    	  
		    case 6:
		    	  ti.addTeacher();
		    	  break;
		    	  
		    case 7:
		    	  ti.updateTeacher();
		    	  break;
		    	  
		    case 8:
		    	  ti.deleteTeacher();
		    	  break;
		    	 
		    case 9: 
		    	  app.searchStudent();
		    	  break;
		    	  
		    case 10: 
		    	  ti.searchTeacher();
		    	  break;
		    	   
    	   }
		   
		   
		   
		   
		   
       }while(true);
       
       
       
       
       
       
     }
}