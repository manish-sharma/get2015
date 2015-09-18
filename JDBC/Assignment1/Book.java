import java.util.Date;

public class Book {
	private int accessionNumber;
	private int titleId;
	private double price;
	private String status;
	private Date purchaseDate;
	Title t=new Title();

	public int getAccessionNumber() {
		return accessionNumber;
	}

	public void setAccessionNumber(int accessionNumber) {
		this.accessionNumber = accessionNumber;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(Title t) {
		this.titleId=t.getTitleId();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date date) {
		this.purchaseDate = date;
	}

}


