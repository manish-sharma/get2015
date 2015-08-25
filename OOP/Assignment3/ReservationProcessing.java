import java.util.*;


public class ReservationProcessing {
	
	int count;				//count is used to check whether trains are found between user specified stations or not
	List<TrainInfo> selectedList = new ArrayList<TrainInfo>();
	
	
	//method to filter trains based on train type
	public List<TrainInfo> filterByType(String trainType){
		selectedList.clear();
		count = 0;
			
		if ((trainType.equalsIgnoreCase("Goods") == false) && (trainType.equalsIgnoreCase("Passenger") == false))
			return selectedList;		//returns null if user enter invalid train type
			
		for(TrainInfo s : TrainInfo.info)				
			if((s.trainType).equalsIgnoreCase(trainType)) {		//adding trains to list if type matches user's desired train type
				count++;
				selectedList.add(s);
			}

		if (count == 0) {
			System.out.println("No train found");		//count == 0 means no trains are found between entered stations
			return selectedList;
		}
		
		if (count > 0)
			return selectedList;

		return selectedList;		//returning the filtered list based on type
	}
	
	//method to filter the list based on source and destination stations
	public String filterByStation(String from, String to) {
		count = 0;
		for(TrainInfo s : selectedList)
			if((s.source).equalsIgnoreCase(from) && (s.destination).equalsIgnoreCase(to)) {
				count++;
				System.out.println(s.trainId+" "+s.trainType+" "+s.source+" "+s.destination+" "+s.seatsAvailable+" "+s.duration+" "+s.fare);
			}

		if(count == 0) {
			System.out.println("No train found");
			return "";
		}
		
		return "true";
	}
	
	//method to book trains if availability is sufficient
	public int reservation(int trainId, double seats) {
		count = 0;
		
		for(TrainInfo s : selectedList)
			if(Integer.parseInt(s.trainId) == (trainId) && Integer.parseInt(s.seatsAvailable) > seats)
			{
				double total = Double.parseDouble(s.seatsAvailable);
				total = total - seats;
				s.seatsAvailable = String.valueOf(total);
				count++;
				return (Integer.parseInt(s.fare));
			}

		if(count == 0) {
			System.out.println("Enter a valid trainId");
			return 0;
		}
		
		return 0;
	}

	//method to update train chart after successful booking
	public void update(List<TrainInfo> info) {
		for(TrainInfo s : info)
			for(TrainInfo s1 : TrainInfo.info)
				if((s.trainId).equals(s1.trainId))
					s1.seatsAvailable = s.seatsAvailable;
	}
	
	//method to sort the list based on travel duration
	public void sorting(List<TrainInfo> info) {
		TrainInfo temp;
		
		for(int index = 0; index < info.size(); index++) {
			for(int i = 0; i < info.size(); i++) { 
				int totalTime1 = Integer.parseInt(info.get(index).duration);
				int totalTime2 = Integer.parseInt(info.get(i).duration);
					if(totalTime1 < totalTime2) {
							temp=info.get(index);
							info.set(index,info.get(i));
							info.set(i,temp);
					}
			}
		}
	}
	
	//method to show train details
	public void display(List<TrainInfo> selectedList) {
		System.out.println("TrainID \t Type \t Source Destination \t Seats Available Journey Time \t Cost");
		
		for(TrainInfo s : selectedList)
			System.out.println(s.trainId+"\t \t"+s.trainType+"\t "+s.source+"\t "+s.destination+"\t "+s.seatsAvailable+"\t \t  "+s.duration+"\t \t  "+s.fare);
	}
	
}