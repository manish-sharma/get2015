/**
 * @author Girdhari
 * Program to implement job scheduling using heap
 */
package heap;

/* Starting of Job class */
public class Job {
	private int jobPriority;
	private String jobData;
	Job() {
		this.jobData = null;
		this.jobPriority = 0;
	}

	/* Starting of Getters and Setters */
	public int getJobPriority() {
		return jobPriority;
	}
	public void setJobPriority(int jobPriority) {
		this.jobPriority = jobPriority;
	}
	public String getJobData() {
		return jobData;
	}
	public void setJobData(String jobData) {
		this.jobData = jobData;
	}
	/* Ending of Getters and Setters */
}

/* End of Job class */
