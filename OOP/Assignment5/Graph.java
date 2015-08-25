/****************************************************************************************
Name            : Graph
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to create graph of social network
                :
****************************************************************************************/



public class Graph implements Connection{

    @Override
    public void addConnection(Entity e1, Entity e2) {
        e1.friends.put(e2.email,e2.email);
        e2.friends.put(e1.email,e1.email);
        
    System.out.println("Friend/Member Added Successfully");
    
    }
    //End of addConnection method

    @Override
    public void removeConnection(Entity e1, Entity e2) {
    e1.friends.remove(e2.email);
    e2.friends.remove(e1.email);
    System.out.println("Friend/Member Removed Successfully");
    }
    //End of removeConnection method

   
    
}
//End of class