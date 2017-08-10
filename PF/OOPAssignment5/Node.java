import java.math.BigInteger;

/**
 * @author Sumitra
 * this is interface Node contain method getName getPhone getEmail which are common for organization or person
 */
public interface Node {//Interface implemented in Entity class
	public String getName() ;
	public BigInteger getPhone();
	public String getEmail();
}
