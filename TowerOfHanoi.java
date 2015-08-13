import java.util.*;
public class TowerOfHanoi {
	int numOfDisk;
	TowerOfHanoi(int numOfDisk) {
		this.numOfDisk = numOfDisk;
	}
	
   List<String> list = new ArrayList<String>();
   public List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk) {
	   int diskNumber = this.numOfDisk - numOfDisk + 1;
       if (numOfDisk == 1) {
    	   String str = "Move Disk " + diskNumber + " from " + source + " to " + destination;
           list.add(str);
       } else {
    	  
           towerOfHanoi(source, temp, destination, numOfDisk - 1);
           String str = "Move Disk " + diskNumber + " from " + source + " to " + destination; 
           list.add(str);
           towerOfHanoi(temp, destination,source , numOfDisk - 1);
       }
	return list;
   }

   public static void main(String[] args) {
       
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       TowerOfHanoi towersOfHanoi = new TowerOfHanoi(discs);
       List<String> result = new ArrayList<String>();
       result = towersOfHanoi.towerOfHanoi("A", "B", "C", discs);
       scanner.close();
       Iterator itr=result.iterator();//getting Iterator from arraylist to traverse elements  
       while(itr.hasNext()){  
        System.out.println(itr.next());  
       }  
   }
}
