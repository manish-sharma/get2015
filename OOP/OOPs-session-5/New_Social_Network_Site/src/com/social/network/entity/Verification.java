/*Verification Class
 * this class will verify EmailId
 */
package com.social.network.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*this method will verify the email Id whether
 *  there is an account with this emailId or not
 */
public class Verification {
	public int checkId(String mailId) {
		String fileName = "D:/metacube training/workspace/Nodes.txt";
		String line = null;
		int flag;
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
			if (database.get(i).equalsIgnoreCase(mailId + "-")) {
				flag = 1;
			}
		}
		if (flag == 1)
			return flag;
		return flag;

	}

}
