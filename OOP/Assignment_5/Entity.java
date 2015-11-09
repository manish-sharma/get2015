package socialNetwork;

import java.util.HashMap;

public class Entity {
	String email;
	String name;

	public Entity(String email, String name) {
		this.email = email;
		this.name = name;
	}

	HashMap<String, String> friends = new HashMap<String, String>();
}
