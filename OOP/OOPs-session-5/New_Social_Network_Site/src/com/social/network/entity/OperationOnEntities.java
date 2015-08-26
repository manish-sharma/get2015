/*OperationOnEntities Class
 * this class have acceptFriendRequest(),removeText(),showFriendList(),
 * removeFriend(),searchEntityByName(),sendFriendRequest() functions,these all will
 * perform operations on an Entity
 */
package com.social.network.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextPackage.AlreadyBound;

public class OperationOnEntities {
	/*
	 * this method will accept friend request which was sent by your friend
	 */
	public void acceptFriendRequest(String userName, String emailID,
			String friendName, String friendEmailID) throws IOException {
		String fileName1 = "D:/metacube training/workspace/FriendList1.txt";
		try {
			FileWriter fileWriter1 = new FileWriter(fileName1, true);
			BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);

			bufferedWriter1.append(userName + "(" + emailID + ") friend with "
					+ friendName + "(" + friendEmailID + ")");
			bufferedWriter1.newLine();
			bufferedWriter1.close();
			System.out.println(friendName + " Added to your friend list");
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName1 + "'");

		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName1 + "'");

		}
	}

	/*
	 * this method will remove friend request which was sent by your friend,from
	 * your account once you have accept that friend request
	 */
	public void removeText(String userName, String mailID, String line1)
			throws IOException {
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
		int p = 0, q = 0;
		ArrayList<String> newList = new ArrayList<String>();
		for (int i = 0; i < database.size(); i++) {
			if (database.get(i).equalsIgnoreCase(userName)) {

				if (database.get(i + 1).equalsIgnoreCase(mailID + "-")) {

					p = i + 2;
					while (!((database.get(p)).equals("#"))) {
						if (database.get(p).equalsIgnoreCase(line1)) {
							q = p;
							for (int j = p + 1; j < database.size(); j++) {
								newList.add(database.get(j));
							}

						}
						p++;

						break;
					}
				}
			}
		}

		try {
			FileWriter fileWriter1 = new FileWriter(fileName);
			BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
			ArrayList<String> database1 = new ArrayList<String>();
			for (int i = 0; i < q; i++) {
				database1.add(database.get(i));

			}
			/*
			 * for(int i=0;i<database1.size();i++) {
			 * System.out.println(database1.get(i));
			 * 
			 * }
			 */
			int j;
			/*
			 * for(j=0;j<newList.size();j++) {
			 * //System.out.println(newList.get(j));
			 * 
			 * database1.add(newList.get(j)); }
			 */
			/*
			 * for(int i=0;i<database1.size();i++) {
			 * System.out.println(database1.get(i)); }
			 */

			for (int count = 0; count < database1.size(); count++) {
				// System.out.println(database1.get(count));
				bufferedWriter1.write(database1.get(count).toString());
				bufferedWriter1.newLine();
			}

			bufferedWriter1.close();
		} catch (Exception e) {
			System.out.println("exception in sendrequest");

		}

	}

	/*
	 * this method will show your friend list
	 */
	public void showFriendList(String userName, String mailId) {

		String fileName = "D:/metacube training/workspace/FriendList1.txt";
		String line = null;
		int flagfriendList = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(mailId)) {
					System.out.println(line);
					flagfriendList = 1;
				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		if (flagfriendList == 0) {
			System.out.println("You have an Empty FriendList");
			return;
		} else {
			System.out.println("Prees 1 to Remove Friend");
			System.out.println("Otherwise press any other no. key");
			int choiceRemove = 0;
			choiceRemove = scanner.nextInt();
			if (choiceRemove == 1) {
				System.out
						.println("Enter name and Email of person whom you want to remove from friend list");
				String Name = scanner.next();
				String friendEmailID = scanner.next();
				new OperationOnEntities().removeFriend(userName, mailId, Name,
						friendEmailID);
			} else {
				return;
			}
		}
	}

	/*
	 * this method will remove friend from your friend list
	 */
	private void removeFriend(String userName, String mailId, String name,
			String friendEmailID) {
		String fileName = "D:/metacube training/workspace/FriendList1.txt";
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
		int p = 0;
		int flagFriend = 0;
		ArrayList<String> newList = new ArrayList<String>();
		for (int i = 0; i < database.size(); i++) {
			if ((database.get(i)).contains(mailId)) {

				if ((database.get(i)).contains(friendEmailID)) {
					flagFriend = 1;
					p = i;
					break;

				}
			}
		}

		if (flagFriend == 1) {
			for (int j = p + 1; j < database.size(); j++) {
				newList.add(database.get(j));
			}

			try {
				FileWriter fileWriter1 = new FileWriter(
						"D:/metacube training/workspace/FriendList1.txt");
				BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
				ArrayList<String> database1 = new ArrayList<String>();
				for (int countremove = 0; countremove < p; countremove++) {
					database1.add(database.get(countremove));

				}
				int j;
				for (j = 0; j < newList.size(); j++) {
					database1.add(newList.get(j));
				}

				for (int count = 0; count < database1.size(); count++) {
					bufferedWriter1.write(database1.get(count).toString());
					bufferedWriter1.newLine();
				}

				System.out.println(name + " remove from your friend List");
				bufferedWriter1.close();
			} catch (Exception e) {
				System.out.println("exception in sendrequest");

			}

		} else {
			System.out.println(name + " is not your friend");
		}

	}

	/*
	 * this method will search a friend whom you want to search
	 */
	public void searchEntityByName(String friend, String userName,
			String emailID) throws IOException {
		String fileName = "D:/metacube training/workspace/UserDetails.txt";
		String line = null;
		ArrayList<String> database = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		int flagsearch = 0;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				database.add(line);
			}

			for (int i = 0; i < database.size(); i++) {
				if (database.get(i).equalsIgnoreCase("--" + friend + "-")) {
					do {
						System.out.println(database.get(i));
						i++;
					} while (!database.get(i).equalsIgnoreCase("#"));
					System.out.println("\n");
					flagsearch = 1;
				}

			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		if (flagsearch == 0) {
			System.out.println(friend + " not have an account!!!:)");
		}

		else {
			int flagsendrequest = 0;
			System.out.println("Prees 1 to Send Friend Request");
			System.out.println("Otherwise press any other no. key");
			int choice = scanner.nextInt();
			if (choice == 1) {
				String line1 = null;
				System.out
						.println("Enter name and Email of person whom you want to send friend request");
				String Name = scanner.next();
				String friendEmailID = scanner.next();
				try {
					FileReader fileReader1 = new FileReader(
							"D:/metacube training/workspace/Nodes.txt");
					BufferedReader bufferedReader1 = new BufferedReader(
							fileReader1);
					while ((line1 = bufferedReader1.readLine()) != null) {
						if (line1.contains(friendEmailID)) {
							while (!(line1 = bufferedReader1.readLine())
									.equalsIgnoreCase("#")) {
								if (line1.contains(emailID)) {
									flagsendrequest = 1;
									System.out
											.println("you have already sent friend request to "
													+ Name);

								}
							}
						}

					}
					bufferedReader1.close();
				} catch (FileNotFoundException fe) {
					System.out.println("file not found");
				} catch (IOException ioe) {
					System.out.println("IO exception");
				}
				if (flagsendrequest == 0) {
					try {

						FileReader fileReader1 = new FileReader(
								"D:/metacube training/workspace/Nodes.txt");
						BufferedReader bufferedReader1 = new BufferedReader(
								fileReader1);
						while ((line1 = bufferedReader1.readLine()) != null) {
							if (line1.contains(emailID)) {
								while (!(line1 = bufferedReader1.readLine())
										.equalsIgnoreCase("#")) {
									if (line1.contains(friendEmailID)) {
										flagsendrequest = 1;
										System.out
												.println(Name
														+ " has already sent you a friend request");

									}
								}
							}

						}
						bufferedReader1.close();
					} catch (FileNotFoundException fe) {
						System.out.println("file not found");
					} catch (IOException ioe) {
						System.out.println("IO exception");
					}
				}
				if (flagsendrequest == 0) {
					try {
						FileReader fileReader = new FileReader(
								"D:/metacube training/workspace/FriendList1.txt");
						BufferedReader bufferedReader = new BufferedReader(
								fileReader);
						while ((line1 = bufferedReader.readLine()) != null) {
							if (line1.contains(emailID)) {
								if (line1.contains(friendEmailID))
									flagsendrequest = 1;
								break;
							}
						}
						bufferedReader.close();
					} catch (FileNotFoundException fe) {
						System.out.println("file not found");
					} catch (IOException ioe) {
						System.out.println("IO exception");
					}

					if (flagsendrequest == 0) {
						new OperationOnEntities().sendFriendRequest(userName,
								emailID, Name, friendEmailID);
						System.out.print("Friend request sent to " + Name
								+ "\n");
					} else
						System.out.println("you are already friend with "
								+ Name);

				}
			}

		}
	}

	/*
	 * this method will sent your friend request to the person whom you want to
	 * be your friend
	 */
	public void sendFriendRequest(String userName, String emailID,
			String friendName, String friendEmailID) throws IOException {
		String fileName = "D:/metacube training/workspace/Nodes.txt";
		String line = null;
		ArrayList<String> database = new ArrayList<String>();
		int flagFound = 0;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains(friendName)) {
					if ((line = bufferedReader.readLine())
							.contains(friendEmailID)) {
						flagFound = 1;
					}
				}

			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		if (flagFound == 1) {
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

			int p = 0;
			ArrayList<String> newList = new ArrayList<String>();
			for (int i = 0; i < database.size(); i++) {
				if (database.get(i).equalsIgnoreCase("----" + friendName + "-")) {

					if (database.get(i + 1).equalsIgnoreCase(
							friendEmailID + "-")) {
						for (int j = i + 2; j < database.size(); j++) {
							newList.add(database.get(j));
						}

						p = i + 1;
					}
					break;
				}
			}
			try {
				FileWriter fileWriter1 = new FileWriter(fileName);
				BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
				ArrayList<String> database1 = new ArrayList<String>();
				for (int i = 0; i <= p; i++) {
					database1.add(database.get(i));
				}
				database1.add(userName + "," + emailID);

				int j;
				for (j = 0; j < newList.size(); j++) {
					database1.add(newList.get(j));
				}
				for (int count = 0; count < database1.size(); count++) {
					bufferedWriter1.write(database1.get(count).toString());
					bufferedWriter1.newLine();
				}

				bufferedWriter1.close();
			} catch (Exception e) {
				System.out.println("exception in sendrequest");

			}
		} else {
			System.out.println(friendName + " has no account with "
					+ friendEmailID);
		}
	}

}
