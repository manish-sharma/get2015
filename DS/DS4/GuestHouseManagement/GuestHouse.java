import java.util.Scanner;

public class GuestHouse {

	public static final int noOfRooms = 29;
	private SingleLinkList linkList[] = new SingleLinkList[noOfRooms];
	/**
	 *  hashFunction is function which is generate a key on the base of age.
	 *
	 */
	public int hashFunction(int age) {
		return age % noOfRooms;
	}
	/**
	 *  allocate is function which is used to allocate a person on the base of age.
	 *
	 */
	void allocate(String value, int key) {

		if (linkList[key] == null) {
			SingleLinkList linkLists = new SingleLinkList();
			linkLists.addItemInLinkList(value);
			linkList[key] = linkLists;
		} else
			linkList[key].addItemInLinkList(value);
	}

	/**
	 *  printDetail is function which is used print detail of person on the base of age.
	 *
	 */
	void printDetail(int age) {
		if (linkList[hashFunction(age)] == null) {
			System.out.println("there is no person according to age");
		} else
			System.out.print("Room no ->" + hashFunction(age)
					+ "is allocated to ->");
		linkList[hashFunction(age)].printLinkList();

	}

	/**
	 *  allDetail is function which is used print detail of all person.
	 *
	 */
	void allDetail() {
		for (int count = 0; count < linkList.length; count++) {
			if (linkList[count] != null) {
				System.out.print("Room no ->" + count + "is allocated to ->");
				linkList[hashFunction(count)].printLinkList();
			}
		}

	}

}
