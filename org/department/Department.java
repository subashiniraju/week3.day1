package org.department;

import org.college.College;

public class Department extends College {
	protected void deptName() {
		String[] dept= {"CS","CT","Chemistry","Maths"};
		System.out.println("Departments:");
		for (int i = 0; i < dept.length; i++) {
			System.out.println(dept[i]);
			
		}
		
		}
		
	public static void main(String[] args) {
		Department dept=new Department();
		dept.deptName();

	}
}
