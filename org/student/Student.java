package org.student;

import org.department.Department;

public class Student extends Department {
	protected void studentName() {
		String name="Suba";
		System.out.println("Student name:"+name);
		
	}
	protected void studentDept() {
		String dept="CT";
		System.out.println("Student Department:"+dept);
		
	}
	protected void studentId() {
		int id=56;
		System.out.println("Student ID:"+id);
		
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
		
		
	}

}
