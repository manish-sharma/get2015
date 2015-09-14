package secondprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Class used to read information of available hotels in the rooms
 */
public class RoomDetails {

	public List<Rooms> readInfo() {
		List<Rooms> roomDetails = new ArrayList<Rooms>();

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(
					"C://Users/Riddhi/workspace/DSA4/src/RoomDetals.txt"));   //file is read stored at this location
			String line = "";
			while ((line = br.readLine()) != null) {         
				String tokens[] = line.split(",");          //information is stored using comma splitter
				if (tokens.length > 2)
					continue;

				Rooms room = new Rooms();                     //Object of room class
				room.setNumber(Integer.parseInt(tokens[0]));  //set room number
				room.setOccupied(tokens[1].equals(true));     //set room availability
				roomDetails.add(room);                      //adds the value in the list
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return roomDetails;                                 //returns room details list
	}
}
