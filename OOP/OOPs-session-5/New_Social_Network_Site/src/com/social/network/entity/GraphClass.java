/*GraphClass
 *this class have addNodes() fn to add nodes in 
 * text file named as Nodes
 */
package com.social.network.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GraphClass {
	protected int flag;

	/*
	 * this fn will add new node in Nodes text file if no one has any previous
	 * account with the given email Id
	 */
	protected void addNodes(String name, String email, String phone,
			String description, String address) {
		String fileName = "D:/metacube training/workspace/Nodes.txt";
		String line = null;
		ArrayList<String> database = new ArrayList<String>();
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				database.add(line);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		flag = 0;
		for (int i = 0; i < database.size(); i++) {
			if (database.get(i).equalsIgnoreCase(email + "-")) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println(email + " already exist");
		} else {
			try {
				FileWriter fileWriter = new FileWriter(fileName, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.append("----" + name + "-");
				bufferedWriter.newLine();
				bufferedWriter.append(email + "-");
				bufferedWriter.newLine();
				bufferedWriter.append("#");
				bufferedWriter.newLine();
				bufferedWriter.close();
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");

			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");

			}

		}
	}

}
