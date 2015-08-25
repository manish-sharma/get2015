/****************************************************************************************
Name            : Connection
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This interface is used to handle connection of social network
                :
****************************************************************************************/


public interface Connection {
    
    public void addConnection(Entity e1,Entity e2);
    public void removeConnection(Entity e1,Entity e2);
    
    
}
//End of interface
