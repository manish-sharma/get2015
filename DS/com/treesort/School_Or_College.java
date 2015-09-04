/**
 * @author : Pooja Khandelwal
 * @crated Date : 04/09/2015
 * @Name : School_Or_College<T>
 * @Description : this class will add new student into tree i.e list and sort the list based on students id
 */
package com.treesort;

import java.util.LinkedHashMap;
import java.util.Map;

public class School_Or_College<T> extends Student {
	private int totalStudents;
	private String studentName;
	private int studentId;
	private Map<Integer, String> sortedResult = new LinkedHashMap<Integer, String>();
	private School_Or_College<T> leftStudent;
	private School_Or_College<T> rightStudent;

	/**
	 * @Name : default constructor of School_Or_College class
	 * @Description : it will assgn the memory to leftStudent and rightStudent
	 *              Variables and initialize them by null
	 */
	public School_Or_College() {
		leftStudent = new School_Or_College<T>(getRollNo(), getName());
		rightStudent = new School_Or_College<T>(getRollNo(), getName());
		leftStudent = null;
		rightStudent = null;
	}

	/**
	 * @Name : parameterized constructor of School_Or_College class
	 * @Description : it will initialize totalStudents
	 * @param : totalStudents(total no. of students to be added into list i.e
	 *        tree
	 */
	public School_Or_College(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	/**
	 * @Name : parameterized constructor of School_Or_College class
	 * @Description : it will initialize studentName and studentId(new student
	 *              name and roll no.)
	 * @param :newStudentId
	 * @param : newStudentNmae
	 */
	public School_Or_College(int newStudentId, String newStudentName) {
		this.studentName = newStudentName;
		this.studentId = newStudentId;
		leftStudent = null;
		rightStudent = null;
	}

	public School_Or_College<T> addNewStudent(
			School_Or_College<T> studentsListRoot) {
		School_Or_College<T> newStudent = new School_Or_College<T>(getRollNo(),
				getName());
		if (studentsListRoot == null) {
			studentsListRoot = newStudent;
			return studentsListRoot;
		} else {
			if (((int) newStudent.studentId) < ((int) studentsListRoot.studentId)) {
				if (studentsListRoot.leftStudent == null) {
					studentsListRoot.leftStudent = newStudent;
				} else {
					addNewStudent(studentsListRoot.leftStudent);
				}
			} else if (((int) newStudent.studentId) > ((int) studentsListRoot.studentId)) {
				if (studentsListRoot.rightStudent == null) {
					studentsListRoot.rightStudent = newStudent;
				} else {
					addNewStudent(studentsListRoot.rightStudent);
				}
			} else {
				return studentsListRoot;
			}
			return studentsListRoot;
		}
	}

	/**
	 * Name: sortStudentsListBasedOnId()
	 * 
	 * @param: studentListRoot(root Node of a tree) Description: it will display
	 *         the sorted list of students(trversing=>(left->right->right))
	 * @return: sortedResult(sorted list of students)
	 */
	public Map<Integer, String> sortStudentsListBasedOnId(
			School_Or_College<T> studentsListRoot) {
		if (studentsListRoot != null) {
			if (studentsListRoot.leftStudent != null) {
				sortStudentsListBasedOnId(studentsListRoot.leftStudent);
			}
			System.out.println("  " + studentsListRoot.studentId
					+ "               " + studentsListRoot.studentName);
			sortedResult.put(studentsListRoot.studentId,
					studentsListRoot.studentName);
			if (studentsListRoot.rightStudent != null) {
				sortStudentsListBasedOnId(studentsListRoot.rightStudent);
			}
		}
		return sortedResult;
	}
}
