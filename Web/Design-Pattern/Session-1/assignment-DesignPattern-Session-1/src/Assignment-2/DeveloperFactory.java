
public class DeveloperFactory extends Developer {
	
	static Developer developer = null;

	public static Developer getDeveloper()
	{
		developer = new Developer();
		return developer;
	}
}
