import java.util.Comparator;

/**
 * @author Sumitra
 *this is sort the list of passenger train by time and it implements the Comparator interface.
 */
@SuppressWarnings("rawtypes")
public class TimeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		PassengerTrain p1 = (PassengerTrain) o1;
		PassengerTrain p2 = (PassengerTrain) o2;
		if (p1.getTime() == 0) {
			return 0;
		} else if (p1.getTime() > p2.getTime()) {
			return 1;
		} else
			return -1;

	}

}
