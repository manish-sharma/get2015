package oopAssignment5;
import java.util.Comparator;
/**
 * Class to sort data according to traveling time
 * @author Riddhi
 *
 */
public class TravelTimeComparator implements Comparator<Train> {

	@Override
	public int compare(Train o1, Train o2) {
		Train train1 = (Train) o1;
		Train train2 = (Train) o2;

		return train1.travelTime.compareTo(train2.travelTime);
	}
}
