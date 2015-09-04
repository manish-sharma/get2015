package firstprogram;
/**
 * Class that stores information about the jobs entered by the user
 * @author Riddhi
 *
 */
public class Jobs {

	private String name;      //job name
	private int priority;     //job priority
	
	public Jobs(String name,int priority)
	{
		this.name=name;
		this.priority=priority;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String toString()
	{
		return this.name;
		}
	}
