package com.view;

import com.controller.JacksonMapper;

class JsonMain {
public static void main(String args[]) 
{
	System.out.println("parsing the objects");
	JacksonMapper jacksonMapper = new JacksonMapper();
	String jsonString = jacksonMapper.toJSON(); // converting Java object to JSON String
	System.out.println("java object to json string:\n"+jsonString);
	String javaString = jacksonMapper.toJava(); // converting Java object to JSON String
	System.out.println("\nJson string to java object string:\n"+javaString);
 }
}