import java.util.Comparator;

/**
 * @author Sumitra
 *this class is to sort the list of goods train and implements the Comparator interface
 */
@SuppressWarnings("rawtypes")
public class TimeComparatorForGoods implements Comparator {
	public int compare(Object o1, Object o2) {
		GoodsTrain p1 = (GoodsTrain) o1;
		GoodsTrain p2 = (GoodsTrain) o2;
		if (p1.getTime() == p2.getTime()) {
			return 0;
		} else if (p1.getTime() > p2.getTime()) {
			return 1;
		} else
			return -1;

	}
}
