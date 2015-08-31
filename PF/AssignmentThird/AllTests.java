import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestForBinarySearch.class, TestForGCD.class,
		TestForLargestDigitNumber.class, TestForLinearSearch.class,
		TestForQuickSort.class, TestForRemainderWithRecursion.class })
public class AllTests {

}
