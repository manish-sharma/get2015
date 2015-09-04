/**
 * @author : Pooja Khandelwal
 * @crated Date : 04/09/2015
 * @Name : TreeSort_Main
 * @Description : this class will take input from user and then handle the sorting of input list of students based on id(roll No.)
 */
package com.treesort;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeSort_Main {
	private static Map<Integer, String> studentsIdList = new LinkedHashMap<Integer, String>();

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int totalStudents;
		String totalStudents1;
		String regex = "[0-9]+";
		String regex1 = "[a-z A-Z]+";
		int idFlag = 0;
		do {
			System.out.println("How Many students are there ??");
			totalStudents1 = scan.nextLine();
		} while (!totalStudents1.matches(regex));
		totalStudents = Integer.parseInt(totalStudents1);
		School_Or_College<Map<Integer, String>> school_Or_College = new School_Or_College<Map<Integer, String>>(
				totalStudents);
		School_Or_College<Map<Integer, String>> studentsList = new School_Or_College<Map<Integer, String>>();
		studentsList = null;
		Student student = new Student();
		String studentName;
		String studentId1;
		int studentId;
		for (int i = 0; i < totalStudents; i++) {
			System.out.println("Enter data for student " + (i + 1));
			do {
				System.out.println("Enter student name");
				studentName = scan.nextLine();
			} while (!studentName.matches(regex1));
			do {
				do {
					System.out.println("Assign student id to " + studentName);
					studentId1 = scan.nextLine();
				} while (!studentId1.matches(regex));
				studentId = Integer.parseInt(studentId1);
				if (studentsIdList.get(studentId) == null) {
					idFlag = 1;
					studentsIdList.put(studentId, studentName);
					student.setName(studentName);
					student.setRollNo(studentId);
					studentsList = school_Or_College
							.addNewStudent(studentsList);
				} else {
					idFlag = 0;
					System.out.println(studentId + " is already assigned to "
							+ studentsIdList.get(studentId));
				}
			} while (idFlag != 1);
		}
		System.out
				.println("*----Sorting Students list according to their Roll No.----*\n");
		System.out.println("Roll NO.        Student Name");
		school_Or_College.sortStudentsListBasedOnId(studentsList);
		scan.close();
		System.out.println("\n*--Exit--*");
	}
}
