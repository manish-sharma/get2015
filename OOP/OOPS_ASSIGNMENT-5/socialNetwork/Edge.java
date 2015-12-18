package socialNetwork;

public class Edge extends Graph{
	
	@Override
	public void addConnection(Entity e1, Entity e2) {
		//Add connection
        e1.friends.put(e2.email,e2.email);
        e2.friends.put(e1.email,e1.email);
        System.out.println("Now "+e2.name+" is your friend");
    }
	
	@Override
	public void removeConnection(Entity e1, Entity e2) {
		//Remove Connection
	    e1.friends.remove(e2.email);
	    e2.friends.remove(e1.email);
	    System.out.println(e2.name+" Has been removed from your friend list");
	    }
}
