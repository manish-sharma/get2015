import java.util.ArrayList;
import java.util.List;
/**
 * Class that implements graph interface and defines method needed to perform operations
 * @author Riddhi
 *
 */
public class SocialNetwork extends Entity implements Graph {
	static List<Entity> totalUsers = new ArrayList<Entity>();
	int size = totalUsers.size();
	int friendship[][] = new int[100][100];

	boolean flag = false;

	// function to add a user in entity type list
	public void addEntity(Entity E1) {
		totalUsers.add(E1);
		size++;
	}

	// function to remove a user from entity type list
	public void removeEntity(Entity E1) {

		totalUsers.remove(E1);
	}

	// function used to search a given user present in the social network
	public void searchByName(String name) {
		for (Entity s : totalUsers) {
			if (name.equalsIgnoreCase(s.getFirstName())) {
				System.out.println(s.getFirstName() + " " + s.getEmail() + " "
						+ s.getPhoneNumber());
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("No User exits");
		}

	}

	// function used to print all the user present in the social network
	public void print() {
		for (Entity s : totalUsers) {
			System.out.println(s.getEmail());
		}
	}

	// function used to add friendship between two users
	@Override
	public boolean addFriend(Entity E1, Entity E2) {
		int index = E1.getUniqueId();
		int index2 = E2.getUniqueId();

		if (index == index2) {
			System.out.println("Friendship Cant me made with itself");
			return false;
		} else {
			friendship[index][index2] = 1;
			friendship[index2][index] = 1;

			return true;
		}

	}

	// function used to remove friendship between two users
	@Override
	public boolean removeFriend(Entity E1, Entity E2) {
		int index = E1.getUniqueId();
		int index2 = E2.getUniqueId();

		if (index == index2) {
			System.out.println("No friendship found");
			return false;
		} else {
			friendship[index][index2] = 0;
			friendship[index2][index] = 0;

			return true;
		}

	}

	// function to find whether a given user is present or not
	public Entity find(String email) {
		for (Entity s : totalUsers) {
			if (email.equals(s.getEmail())) {
				return s;
			}
		}
		return null;

	}

	// function to print all friends of a user
	public void printFriends() {
		for (int s = 0; s < totalUsers.size(); s++) {
			System.out.println(totalUsers.get(s).getEmail()
					+ "\nFriends with :");
			for (int index2 = 0; index2 < size; index2++) {
				if (friendship[s][index2] == 1)
					System.out.println(totalUsers.get(index2).getEmail());
			}
			System.out.println();
		}
	}

	// function to print all mutual friends of a user
	@Override
	public void mutualFriends(Entity E1, Entity E2) {

		System.out.println("Mutual Friends");
		for (int index2 = 0; index2 < totalUsers.size(); index2++) {
			if ((friendship[E1.getUniqueId()][index2] & friendship[E2
			                                                       .getUniqueId()][index2]) == 1) {
				System.out.println(totalUsers.get(index2).getEmail());
			}
		}
	}

	// function to check validation of email entered by the user
	public boolean isValidEmail(String email) {
		if (email
				.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
			return true;
		} else {
			return false;
		}
	}

}
