package SocialNetwork;
import java.util.ArrayList;
import java.util.List;


public class Graph {
	private  int  noOfVertices;
	private  List<Node> AdjacencyList;
	
	public  int getNoOfVertices() {
		return noOfVertices;
	}
	public  void setNoOfVertices(int noOfVertices) {
		this.noOfVertices = noOfVertices;
	}
	public List<Node> getAdajenceyList() {
		return AdjacencyList;
	}
	public void setAdajenceyList(List<Node> adajenceyList) {
		AdjacencyList = adajenceyList;
	}
	public Graph()
	{	
		AdjacencyList=new ArrayList<Node>();
	}
	public boolean addNode(Node nodeToAdd){
		
	
		
		for(int index=0;index<AdjacencyList.size();index++)
		{
			if(AdjacencyList.get(index).equals(nodeToAdd))
				return false;
		}
		AdjacencyList.add(nodeToAdd);
		noOfVertices=AdjacencyList.size();
		return true;
	}
	public boolean deleteNode(Node nodeToRemove)
	{
		
		for(int index=0;index<AdjacencyList.size();index++)
		{
			if(AdjacencyList.get(index).equals(nodeToRemove))
			{
				AdjacencyList.remove(index);
				noOfVertices=AdjacencyList.size();
				return true;
			}
		}
		return false;
	}
		
	public void printGraph()
	{
		if(noOfVertices==0)
		{
			System.out.println("The List is empty");
			return;
		}
		Node node=null;
		for (int vertexNo=0;vertexNo<noOfVertices;vertexNo++)
	    {
	        node=AdjacencyList.get(vertexNo);
	        System.out.print("Node no ->" +node.getData()+"Has following adjacent");
	        
	        for(int adjacent=0;adjacent<node.getEdgeList().size();adjacent++)
	        {
	        	  System.out.print("->"  +node.getEdgeList().get(adjacent).getAdjacentNode().getData());
	        }
	        System.out.println();
	    }
		
	}
}




