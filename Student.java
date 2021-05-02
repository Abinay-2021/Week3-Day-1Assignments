package org.student;


import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Abi");
	}
	public void studentDept() {
		System.out.println("physics");
	}
	public void studentId() {
		System.out.println("377312");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Dep = new Student();
Dep.collegeCode();
Dep.collegeName();
Dep.collegeRank();
Dep.deptName();
Dep.studentName();
Dep.studentDept();
Dep.studentId();
	}

}
