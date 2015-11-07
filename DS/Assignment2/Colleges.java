package QueueImplemetation;

/** this class is use to create the object of colleges with their name and seat available in them
 * @author Khemanshu
 *
 */
public class Colleges {
	
    //nmae of college
	private String name;
	//seat available in  college
    private int seatAvaliable;
    
    /** get name of college
     * @return
     */
    public String getName() {
        return name;
    }
    
    /** set the name of college
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** get the available seat in college
     * @return
     */
    public int getSeatAvaliable() {
        return seatAvaliable;
    }
    
    /**set the available seat in college
     * @param seatAvaliable
     */
    public void setSeatAvaliable(int seatAvaliable) {
        this.seatAvaliable = seatAvaliable;
    }

}
