/* The TowerOfHanoi program implements an application that
* solve the problem of Tower of Hanoi.
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-13
*/

public class TowerOfHanoi
{
	/*It return the final string that contain the steps which are used for solve the given problem of Tower Of Hanoi with given no of disks.
	 *
	 * @param noOfDisk
	 * @param Start
	 * @param auxiliary
	 * @param end
	 * @param str
	 * @return str
	 */

	public String towerOfHanoi(int noOfDisk, String start, String auxiliary, String end,String str) 
	{
		   if (noOfDisk == 1) 
	       {
	           str+=start + " -> " + end+"\n";
	           
	       } else 
	       {
	    	   str=towerOfHanoi(noOfDisk - 1, start, end, auxiliary,str);
	           str+=start + " -> " + end+"\n";
	           str=towerOfHanoi(noOfDisk - 1, auxiliary, start, end,str);
	       }
	       return str;
	}
	public static void main(String args[])
	{
		TowerOfHanoi ob=new TowerOfHanoi();
		String str="";
        str=ob.towerOfHanoi(3, "a", "b", "c",str);
		System.out.println(str);
		
		
	}
	

}
