package vehicles;

import java.util.List;

public class TestRead {
  public static void main(String args[]) {
    StaXParserForVehicle read = new StaXParserForVehicle();
    List<Vehicle> readConfig = read.readConfig("C:/Users/Ravika/Desktop/config.xml");
    for (Vehicle vehicle : readConfig) {
      System.out.println(vehicle);
    }
  }
} 

