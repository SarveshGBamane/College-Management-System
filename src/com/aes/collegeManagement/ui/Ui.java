package com.aes.collegeManagement.ui;

import java.util.Scanner;

import com.aes.collegeManagement.serviceImpl.ServiceImpl;

public class Ui {
	
	public static void main(String[] args) {
		
		int ch;
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		
		ServiceImpl si = new ServiceImpl();
		
		
		while(isRun) {
			System.out.println("\n========== COLLEGE MANAGEMENT SYSTEM ==========");
			System.out.println("1. Add Course :");
			System.out.println("2. View Course :");
			System.out.println("3. Add Faculty :");
			System.out.println("4. View Faculty :");
			System.out.println("5. Add Batch :");
			System.out.println("6. View Batch :");
			System.out.println("7. Add Student :");
			System.out.println("8. View Student :");
			System.out.println("9. Exit :");
			
			System.out.println("Enter your Choice :");
			try {
				ch = sc.nextInt();
				
				switch (ch) {
				
					case 1:{
						si.addCourse();
					}
					break;
					
					case 2:{
						si.viewCourse();
					}
					break;
					
					case 3:{
						si.addFaculty();
					}
					break;
					
					case 4:{
						si.viewFaculty();
					}
					break;
					
					case 5:{
						si.addBatch();
					}
					break;
					
					case 6:{
						si.viewBatch();
					}
					break;

					case 7:{
						si.addStudent();			
					}
					break;
					case 8:{
						si.viewStudent();
					}
					break;
					
					case 9:{
						isRun = false;
				        System.out.println("Thank you!");
				        break;
					}
					
				
				default:
					System.out.println("Please enter a choice between 1 and 9");
				}
			}
			catch(Exception e) {
				System.out.println("Enter Valid Choice");
			    sc.nextLine();
			}
			
		}
		
	}
}
