/**
 * This class act as class for titles table containing getter setter method
 * 
 * @author Shishir Date 16th September 2015
 */
public class Titles {
	private int title_id;// variable for title_id
	private String title_name;// variable for title_name
	private int subject_id;// variable for subject_id
	private int publisher_id;// variable for publisher_id

	// getter for title_id
	public int getTitle_id() {
		return title_id;
	}

	// setter for title_id
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	// getter for title_name
	public String getTitle_name() {
		return title_name;
	}

	// setter for title_name
	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}

	// getter for subject_id
	public int getSubject_id() {
		return subject_id;
	}

	// setter for subject_id
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	// getter for publisher_id
	public int getPublisher_id() {
		return publisher_id;
	}

	// setter for publisher_id
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

}
