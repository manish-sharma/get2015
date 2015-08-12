import java.util.ArrayList;
import java.util.List;
public class Assignment1 {
	List<String> Result = new ArrayList<>();

	/**
	 * @param source Peg
	 * @param destination Peg
	 * @param temporary Peg
	 * @param numberOfDisk
	 * @return List of String
	 */
	public List<String> towerOfHanoi(String source,String destination,String temp,int numberOfDisk){ 
		if(numberOfDisk == 1)
			Result.add( "Moves Disk 1 from "+source+" to "+destination);
		else{
			towerOfHanoi(source,temp,destination,numberOfDisk-1);
			Result.add("Moves Disk "+numberOfDisk+" from "+source+" to "+destination);
			towerOfHanoi(temp,destination,source,numberOfDisk-1);
		}
		return Result;
	}
}

