import java.util.Date;

/**
 * This class act as class for the book Books table
 * 
 * @author Shishir Date 16th September 2015
 */
public class Books {
	private int accession_number;// variable for accession number
	private int title_id;// variable for title id
	private Date purchase_date;// variable for purchase date
	private double price;// variable for price
	private String status;// variable for status

	// getter for accession number
	public int getAccession_number() {
		return accession_number;
	}

	// setter for return date
	public void setAccession_number(int accession_number) {
		this.accession_number = accession_number;
	}

	// getter for title id
	public int getTitle_id() {
		return title_id;
	}

	// setter for return date
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	// getter for purchase date
	public Date getPurchase_date() {
		return purchase_date;
	}

	// setter for purchase date
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}

	// getter for price
	public double getPrice() {
		return price;
	}

	// setter for price
	public void setPrice(double price) {
		this.price = price;
	}

	// getter for status
	public String getStatus() {
		return status;
	}

	// setter for status
	public void setStatus(String status) {
		this.status = status;
	}

}
