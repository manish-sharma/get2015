package WorkStation;

import java.util.*;
import model.Engineer;;

public interface WorkStation {
  public static List<Engineer> engineerList = new ArrayList<Engineer>();
  public void addEngineer(Engineer engineer);
  public List<Engineer> getEnginnerList();
 
}
