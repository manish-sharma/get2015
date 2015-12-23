package com.controller;

import com.view.Employee;

/*
 * This clsass parse the annotation
 * @author Banwari Kevat
 */
public class AnnotationMain {
	public static void main(String[] args) throws Exception 
	{
		TestAnnotationParser parser = new TestAnnotationParser();
		parser.parse(Employee.class);
	}
}