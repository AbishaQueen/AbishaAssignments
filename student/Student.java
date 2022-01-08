package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	
	public void studentName()
	{
		System.out.println("Student-studentname");
	}
	public void studentDept()
	{
		System.out.println("Student-studentDept");
	}
	public void studentId()
	{
		System.out.println("Student-studentID");
	}

	public static void main(String[] args) {
		Student stu=new Student();
		College col=new College();
		Department Dept=new Department();
		
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		Dept.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
}
