/*Entity Class
 * this class extends Nodes class
 * this class have AddEntity() fn to add entity in 
 * text file named as UserDetails
 */
package com.social.network.entity;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Entities extends Nodes {
	protected String name, email, phone, description, address;

	/*
	 * this fn will add new entity in UserDetails text file if no one has any
	 * previous account with the given email Id
	 */
	protected void AddEntity(int id, String name, String email, String phone,
			String description, String address, String schoolOrCollegeName,
			String subOrStandard, ArrayList<String> interest) {
		String fileName = "D:/metacube training/workspace/UserDetails.txt";
		if (super.flag == 1) {
			// System.out.println(email + " already exist");
		} else {
			try {
				FileWriter fileWriter = new FileWriter(fileName, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				if (id == 1) {
					bufferedWriter.append("--" + name + "-");
					bufferedWriter.newLine();
					bufferedWriter.append(email + "-");
					bufferedWriter.newLine();
					bufferedWriter.append(description + "-");
					bufferedWriter.newLine();
					bufferedWriter.append(address + "-");
					bufferedWriter.newLine();
					bufferedWriter.append(phone + "-");
					bufferedWriter.newLine();

					bufferedWriter.append(schoolOrCollegeName + "-");
					bufferedWriter.newLine();
					bufferedWriter.append(subOrStandard + "-");
					bufferedWriter.newLine();
					bufferedWriter.append("INTERESTS ARE : ");
					// bufferedWriter.newLine();
					int i = 0;
					for (i = 0; i < interest.size(); i++) {
						bufferedWriter.append(interest.get(i) + ",");
					}
					bufferedWriter.newLine();
					bufferedWriter.append("#");
					bufferedWriter.newLine();
				}
				bufferedWriter.close();
				System.out.println(name + " entity is added ");
			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");

			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");

			}
		}
	}
}
