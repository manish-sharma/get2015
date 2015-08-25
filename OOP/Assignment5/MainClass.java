package SocialNetwork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class MainClass {
		public static void main(String args[])
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			boolean result;
			int input; 
			
				
				SocialNetwork socialNetwork = new SocialNetwork();
				socialNetwork.readPersonInformation();
				//socialNetwork.readOrganisationInformation();
				Connection con=null;
				SocialNetworkMenu socialNetworkMenu = new SocialNetworkMenu();
				Person person = null;
				Person person1 = null;
				do
				{
					socialNetworkMenu.showMenu();
					try {
					
					input = Integer.parseInt(br.readLine());
					switch(input)
					{
						/* Displaying social network */
						case 1:	List<Node> nodelist=socialNetwork.getAdajenceyList();
						for(int index=0;index<nodelist.size();index++)
						{
							nodelist.get(index).display();
							Node node=nodelist.get(index);
							System.out.println("No of Friends are "+node.getEdgeList().size());
							System.out.println();
						}
							
							break;
						
						/* Displaying records */
						case 2:
							
							break;
						
						/* Adding a node */
						case 3:		person1 = new Person(5, "dheeraj1993@gmail.com","dheeraj kumar", "8559818925","JVM","SBTC");
									
									result = socialNetwork.addEntitySocialNetwork(person1);
									displayMessage(result);
									break;
						
						/* adding an edge */
						case 4: person=readFromConsole(br);
								if(person!=null)
								{
									
									result =socialNetwork.addNode(person);
									con=new Connection();
									result=con.addFriend(socialNetwork, person1, person);
									displayMessage(result);
								}
							break;
							
						/* removing a node */
						case 5:
								result=socialNetwork.deleteNode(person1);
								displayMessage(result);
								break;
							
						/* displaying based on search */
						case 6:
							
							break;
							
						/* removing an edge between two nodes */
						case 7:
							result=con.removeFriend(socialNetwork, person1, person);
							displayMessage(result);
							break;
							
						/* Exit */
						case 8:
							System.exit(0);
							
						default:
							System.out.println("Enter Right choice");
							input = Integer.parseInt(br.readLine());
					}
					}
					catch(NumberFormatException nf)
					{
						System.out.println("please enter correct number");
						continue;
					}
					
					catch(IOException io)
					{
						System.out.println("Error occured please enter input again");
					}
					
				
				}while(true);
			
			
		}
		public static void displayMessage(boolean result)
		{
			if(result)
			{
				System.out.println("Operation successfully ");
			}
			else
			{
				System.out.println("Operation failed");
			}
		}
		public static Person readFromConsole(BufferedReader br) {
			int id=6;
			Person person=null;
			try{
				System.out.println("Enter Name");
				String name=br.readLine().trim();
				System.out.println("Enter email id");
				String emailId=br.readLine().trim();
				System.out.println("Enter you phone no");
				String phoneno=br.readLine().trim();
				System.out.println("Enter School name");
				String schoolName=br.readLine().trim();
				System.out.println("Enter College Name");
				String collegeName=br.readLine().trim();
				person= new Person(id,emailId,name,phoneno,schoolName,collegeName);
			}
			
			catch(IOException io)
			{
				System.out.println("Error please try again");
				return null;
			}
			
			return person;
			
		}
	}

