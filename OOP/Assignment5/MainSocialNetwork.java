package oop5;

import java.util.Scanner;


public class MainSocialNetwork {
		public static void main(String args[])
		{
			GetDataFromUser dataFromUser = new GetDataFromUser();
			Scanner scan = null;
			try
			{
				scan = new Scanner(System.in);
				int result, input; 
				SocialNetwork socialNetworkObj = new SocialNetwork();
				socialNetworkObj.readPersonInfo();
				socialNetworkObj.readOrganisationInfo();
				for(Person e: SocialNetwork.personSet)
				{
					result = socialNetworkObj.addNode(e);
				}
				for(Organisation e: SocialNetwork.organisationSet)
				{
					result = socialNetworkObj.addNode(e);
				}
				SocialNetworkMenu socialNetworkMenuObj = new SocialNetworkMenu();
				
				/* Person Object creation */
				Person person1 = null;
				Person person2 = null;
				do
				{
					socialNetworkMenuObj.showMenu();
					input = scan.nextInt();
					switch(input)
					{
						/* Displaying social network */
						case 1:
							Printer.displaySocialNetwork();
							break;
						
						/* Displaying records */
						case 2:
							Printer.displayRecords();
							break;
						
						/* Adding a node */
						case 3:
							person1 = dataFromUser.getPersonDetail();
							
							result = socialNetworkObj.addNode(person1);
							if(result == 0)
							{
								System.out.println("Exception occured");
							}
							else if(result == -1)
							{
								System.out.println("node can not be added, already exists");
							}
							else
							{
								System.out.println("Node is added successfully");
							}
							break;
						
						/* adding an edge */
						case 4:
							String firstPersonName =  dataFromUser.getPersonName();
							String secondPersonName = dataFromUser.getPersonName();
							System.out.println(firstPersonName);
							System.out.println(secondPersonName);
							result = socialNetworkObj.addEdge(firstPersonName, secondPersonName);
							if(result == 0)
							{
								System.out.println("Exception Occured");
							}
							else if(result == 1)
							{
								System.out.println("Edge Successfully Added");
							}
							else if(result == -1)
							{
								System.out.println("Edge Addition Failed");
							}
							break;
							
						/* removing a node */
						case 5:
							String name = dataFromUser.getPersonName();
							socialNetworkObj.removeNode(name);
							break;
							
						/* displaying based on search */
						case 6:
							String name1 = dataFromUser.getPersonName();
							socialNetworkObj.searchDisplay(name1);
							break;
							
						/* removing an edge between two nodes */
						case 7:
							String firstPersonName1 =  dataFromUser.getPersonName();
							String secondPersonName1 = dataFromUser.getPersonName();
							socialNetworkObj.removeEdge(firstPersonName1, secondPersonName1);
							break;
							
						/* Exit */
						case 8:
							System.exit(0);
							
						default:
							System.out.println("Enter Right choice");
							input = scan.nextInt();
					}
				}while(true);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
