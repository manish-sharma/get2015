
/**
 * @author Sumitra
 *this is the POGO class for node.
 */
public class StackNode {

	char data;
	StackNode link;
	public StackNode(char data, StackNode link) {
		super();
		this.data = data;
		this.link = link;
	}
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public StackNode getLink() {
		return link;
	}
	public void setLink(StackNode link) {
		this.link = link;
	}

}
