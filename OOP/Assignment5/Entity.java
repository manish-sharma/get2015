/****************************************************************************************
Name            : Entity
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to handle Entity of social network
                :
****************************************************************************************/
import java.util.HashMap;



public class Entity {
    String email;
    String name;
    HashMap<String,String> friends=new HashMap<String,String>();
    public Entity(String email, String name) {
        this.email = email;
        this.name = name;
    }
    //End of constructor
}
//End of Entity class
