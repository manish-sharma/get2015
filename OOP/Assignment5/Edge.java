
import java.util.List;

public class Edge {
	private Node adjacentNode;
	
	
	public Edge()
	{
		adjacentNode=new Node(0); //default value of data in Node
		
	}
	
	public Node getAdjacentNode() {
		return adjacentNode;
	}



	public void setAdjacentNode(Node adjacentNode) {
		this.adjacentNode = adjacentNode;
	}

	public boolean addEdge(Graph graph , Node sourceNode ,Node destinationNode)
	{
			if(sourceNode==null||destinationNode==null)
				return false;
			int isAvailable1=searchNode(graph, sourceNode);
			int isAvailable2=searchNode(graph, destinationNode);
			if(isAvailable1==-1||isAvailable2==-1)
				return false;
			
			Edge edge1 = new Edge();
			edge1.adjacentNode=destinationNode;
			edge1.adjacentNode.setData(destinationNode.getData());
			sourceNode.getEdgeList().add(edge1);
			Edge edge2 = new Edge();
			edge2.adjacentNode=sourceNode;
			edge2.adjacentNode.setData(sourceNode.getData());
			destinationNode.getEdgeList().add(edge2);
			return true;
	}
	
	public boolean deleteEdge(Graph graph, Node sourceNode,Node destinationNode)
	{
		int index;
		if(sourceNode==null)
			return false;
		
		
	
		index=searchAdjacentNode(sourceNode.getEdgeList(), destinationNode);
		sourceNode.getEdgeList().remove(index);
		index=searchAdjacentNode(destinationNode.getEdgeList(), sourceNode);
		destinationNode.getEdgeList().remove(index);
		return true;
	}
		
		
	public  int searchNode(Graph graph,Node nodeToSearch) 
	{
			int index=-1;
			for(int vertex=0;vertex<graph.getAdajenceyList().size();vertex++)
			{
				
				if(nodeToSearch.equals(graph.getAdajenceyList().get(vertex)))
				{
					index=vertex;
					break;
				}
			}
			return index;
	}
	public int searchAdjacentNode(List<Edge> edgeList,Node noToSearch)
	{
		int index=-1;
		for(int adjacent=0;adjacent<edgeList.size();adjacent++)
		{
			if(noToSearch.getData()==edgeList.get(adjacent).getAdjacentNode().getData())
			{
				index=adjacent;
				break;
			}
		}
		return index;
	}
	
}

