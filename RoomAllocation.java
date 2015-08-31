import java.util.*;

public class RoomAllocation{
	static Scanner scan = new Scanner(System.in);
	HashMap<Integer, String> hotelRoom = new HashMap<Integer, String>();
	static int rooms=17;
	static int count= 0;
	
	public static void main(String []args){
		RoomAllocation roomAllocation = new RoomAllocation();
		roomAllocation.createMap();
		while(true){
			System.out.println("Enter 1 to allocate room\nEnter 2 to view list\nEnter your Choice:");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if(count<rooms){
					
					System.out.println("Enter age of person:");
					int age = scan.nextInt();
					System.out.println("Enter Name of person:");
					String name = scan.next();
					roomAllocation.alloteRoom(name,age);
				}
				else{
					System.out.println("No Room Available");
					return;
				}
				break;
			case 2:
				roomAllocation.viewList();
				break;

			default:
				System.out.println("Enter valid option:");
				break;
			}
			
		}
		
	}
	private void createMap(){
		for(int i=0;i<rooms;i++){
			hotelRoom.put(i,"vacent");
		}
	}
	
	private void alloteRoom(String name,int age) {
		int key = age%rooms;
		boolean flag = false;
		while(!flag){
			if(hotelRoom.get(key).equalsIgnoreCase( "vacent")){
				hotelRoom.put(key, name);
				flag=true;
				count++;
			}
			else if(key < rooms-2 ){
				key = key + 1;
			}
			else{
				key = 0;
			}
		}
		
		
	}

	public void viewList() {
		for(int i =0;i<rooms;i++){
			if(hotelRoom.get(i).equalsIgnoreCase( "vacent")){
				System.out.println("Room number -"+ i+" is " +hotelRoom.get(i));
			}
			else{
			System.out.println("Room number -"+ i+"  allocated to " +hotelRoom.get(i));
		}
		}
	}
}
