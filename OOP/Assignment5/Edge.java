package SocialNetwork;

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
			int isAvailable1=searchNode(graph, sourceNode);
			int isAvailable2=searchNode(graph, sourceNode);
			if(isAvailable1==-1||isAvailable2==-1)
				return false;
			
			Edge edge1 = new Edge();
			edge1.adjacentNode=destinationNode;
			sourceNode.getEdgeList().add(edge1);
			Edge edge2 = new Edge();
			edge2.adjacentNode=sourceNode;
			destinationNode.getEdgeList().add(edge2);
			return true;
	}
	
	public boolean deleteEdge(Graph graph, Node sourceNode,Node destinationNode)
	{
		int index;
		int isAvailable1=searchNode(graph, sourceNode);
		int isAvailable2=searchNode(graph, sourceNode);
		if(isAvailable1==-1||isAvailable2==-1)
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
			if(noToSearch.equals(edgeList.get(adjacent)))
			{
				index=adjacent;
				break;
			}
		}
		return index;
	}
		
			

}

