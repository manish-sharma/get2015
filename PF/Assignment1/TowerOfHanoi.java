import java.util.*;

/**
 * Program to print tower of hanoi
 * 
 * @author Arushi
 *
 */
public class TowerOfHanoi {
	static List<String> result;

	public static void main(String[] args) {
		TowerOfHanoi tower = new TowerOfHanoi();
		System.out.println("enter disks");
		Scanner sc = new Scanner(System.in);
		int disks = sc.nextInt();
		result = new ArrayList<String>();

		result = tower.towerOfHanoi("A", "B", "C", disks);
		Iterator<String> itr = result.iterator();// getting Iterator from array
													// list to traverse elements
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		sc.close();

	}

	/**
	 * function receives the input strings and then recursively calls itself to
	 * transfer all the disks from source to destination
	 * 
	 * @param source
	 *            ->it holds all the disks initially
	 * @param destination
	 *            ->it will hold all disks finally
	 * @param temp
	 *            ->we uses this tower to send disks from source to destination
	 * @param numOfDisk
	 *            ->total no of disks
	 * @return->list of all actions
	 */
	public List<String> towerOfHanoi(String source, String destination,
			String temp, int numOfDisk) {

		if (numOfDisk == 1) {

			result.add("Move Disk" + numOfDisk + " from" + source + "to"
					+ destination);

		} else {

			towerOfHanoi(source, temp, destination, numOfDisk - 1);

			result.add("Move Disk" + numOfDisk + " from" + source + "to"
					+ destination);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);

		}
		return result;

	}

}
