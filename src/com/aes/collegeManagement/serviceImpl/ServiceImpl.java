package com.aes.collegeManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aes.collegeMangement.model.Batch;
import com.aes.collegeMangement.model.Course;
import com.aes.collegeMangement.model.Faculty;
import com.aes.collegeMangement.model.Student;
import com.aes.collegeMangement.service.Aes;

public class ServiceImpl implements Aes{
	
	Scanner sc = new Scanner(System.in);
	
	
	List<Student>s_list = new ArrayList<>();
	
	List<Course>c_list = new ArrayList<>();

	List<Faculty>f_list = new ArrayList<>();
	
	List<Batch>b_list = new ArrayList<>();
	
	
	@Override
	public void addCourse() {
		
		Course c = new Course();
		
		System.out.println("Enter the Course ID :");
		c.setCourseId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Course Name :");
		c.setCourseName(sc.nextLine());
		
		c_list.add(c);
		System.out.println("Course added successfully");
		
	}

	@Override
	public void viewCourse() {
		
		System.out.printf("| %-10s | %-25s |%n", "Course ID", "Course Name|");
		System.out.println("--------------------------------------------------");

		for (Course c : c_list) {
			System.out.printf("| %-10d | %-25s |%n",
			        c.getCourseId(),
			        c.getCourseName());

		}

				
	}

	@Override
	public void addFaculty() {
		
		Faculty f = new Faculty();
		
		System.out.println("Enter the Faculty ID :");
		f.setF_id(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Faculty Name :");
		f.setF_name(sc.nextLine());
		
		viewCourse();
		
		System.out.println("Select course ID :");
		
		int cid = sc.nextInt();
		
		for(Course c : c_list) {
			if(c.getCourseId() == cid) {
				f.setCourse(c);
				break;
			}
			
		}
		
		f_list.add(f);
		System.out.println("Faculty added successfully");
	}

	@Override
	public void viewFaculty() {
		
		System.out.printf("| %-10s | %-25s | %-25s |%n", "Faculty ID", "Faculty Name","Course Name|");
		System.out.println("---------------------------------------------------------");

		for (Faculty f : f_list) {
		    System.out.printf("| %-10d | %-25s | %-25s |%n",
		            f.getF_id(),
		            f.getF_name(),
		            f.getCourse().getCourseName());
		}
	}

	@Override
	public void addBatch() {
		
		Batch b = new Batch();
		
		System.out.println("Enter the Batch ID :");
		b.setB_id(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Batch Name :");
		b.setB_name(sc.nextLine());
		
		viewFaculty();
		
		System.out.println("Select Faculty ID :");
		
		int fid = sc.nextInt();
		
		for(Faculty f : f_list) {
			if(f.getF_id() == fid) {
				b.setFaculty(f);
				break;
			}
			
		}
		
		b_list.add(b);
		System.out.println("Batch added successfully");
	}

	@Override
	public void viewBatch() {
		
		System.out.printf("| %-10s | %-25s | %-25s |%n", "Batch ID", "Batch Name","Faculty Name|");
		System.out.println("---------------------------------------------------------");

		for (Batch b : b_list) {
		    System.out.printf("| %-10d | %-25s | %-25s |%n",
		            b.getB_id(),
		            b.getB_name(),
		            b.getFaculty().getF_name());
		}
		
	}

	@Override
	public void addStudent() {
		Student s = new Student();
		
		System.out.println("Enter the Student ID :");
		s.setS_id(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Student Name :");
		s.setS_name(sc.nextLine());
		
		viewBatch();
		
		System.out.println("Select Batch ID :");
		
		int bid = sc.nextInt();
		
		for(Batch b : b_list) {
			if(b.getB_id() == bid) {
				s.setBatch(b);
				break;
			}
			
		}
		
		s_list.add(s);
		System.out.println("Student added successfully");
		
	}

	@Override
	public void viewStudent() {
		
		System.out.printf("| %-10s | %-25s | %-25s | %-25s | %-25s |%n", "Student ID", "Student Name","Batch Name","Faculty Name","Course Name|");
		System.out.println("-----------------------------------------------------------------------------------------");

		for (Student s : s_list) {
			System.out.printf("| %-10d | %-25s | %-25s | %-25s | %-25s |%n",
			        s.getS_id(),
			        s.getS_name(),
			        s.getBatch().getB_name(),
			        s.getBatch().getFaculty().getF_name(),
			        s.getBatch().getFaculty().getCourse().getCourseName()
			);

		}
		
	}
	
	
}
