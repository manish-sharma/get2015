public class Members {
	/**
	 * This class act as class for members table containing getter setter method
	 * 
	 * @author Shishir Date 16th August 2015
	 */
	private int member_id; // variable for member_id
	private int member_nm;// variable for member_nm
	private String address1;// variable for address
	private String address2;// variable for address
	private String category;// variable for category

	// getter for member_id
	public int getMember_id() {
		return member_id;
	}

	// setter for member_id
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	// getter for member_nm
	public int getMember_nm() {
		return member_nm;
	}

	// setter for member_nm
	public void setMember_nm(int member_nm) {
		this.member_nm = member_nm;
	}

	// getter for address1
	public String getAddress1() {
		return address1;
	}

	// setter for address1
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	// getter for address2
	public String getAddress2() {
		return address2;
	}

	// setter for address2
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	// getter for category
	public String getCategory() {
		return category;
	}

	// setter for category
	public void setCategory(String category) {
		this.category = category;
	}

}
