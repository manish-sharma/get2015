package SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class Node {
	private int Id;
	private List<Edge> edgeList;
	
	 public int getData() {
		return Id;
	}

	public void setData(int data) {
		this.Id = data;
	}

	public Node(int data) {
		this.Id=data;
		edgeList=new ArrayList<Edge>();
	   }
	
	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

	@Override
	public boolean equals(Object obj) {
		
		Node node=(Node)obj;
		if(node!=null&&this.Id==node.Id)
			return true;
		return false;
	}
	public void display() {
	
		System.out.println("Node id is "+Id);
	}

}
