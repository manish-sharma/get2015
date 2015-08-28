/****************************************************************************************
Name            : BinaryTree
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform binary tree operation
                :
****************************************************************************************/


public class BinaryTree {
	
	int nodeData;
	BinaryTree leftChild;
	BinaryTree rightChild;
	BinaryTree rootNode=null;
	BinaryTree  result=null;
	String output="";
	
	//Start of constructor
	BinaryTree(){
		nodeData=0;
		rightChild=null;
		leftChild=null;
	}
	
	BinaryTree createNode(int data){
		BinaryTree newnode=new BinaryTree();
		newnode.nodeData=data;
		return newnode;	
	}
	
	
	//Method is used to find data node
	BinaryTree findNode(BinaryTree rootNode2,int data){
		
		if(rootNode2.leftChild!=null){
			result=(findNode(rootNode2.leftChild, data));
		}
		if(data==rootNode2.nodeData&&(rootNode2.leftChild==null||rootNode2.rightChild==null)){
			return rootNode2;
		}
		if(rootNode2.rightChild!=null){
				result=(findNode(rootNode2.rightChild, data));
		}
			
		return result;
		
	}
	
	//Method is used to find addNode
	void addNode(int data,int leftData){
		
		BinaryTree leftnode=createNode(leftData);
		if(this.rootNode==null){
			rootNode=leftnode;
			result=null;
		}
		else{
			BinaryTree node=findNode(this.rootNode, data);
			if(node!=null)
			{  
				if(node.leftChild==null){
					node.leftChild=leftnode;
				}
				else{
					node.rightChild=leftnode;
				}
			}
			else{
				System.out.println("Not found");
			}
		}
	}
	
	//Method for preOrder Traversal
	String preOrder(BinaryTree first){
		 output+=first.nodeData+" ";
			
		 if(first.leftChild!=null){
			 preOrder(first.leftChild);
		 }
		 if(first.rightChild!=null){
			 preOrder(first.rightChild);
		 }
		 return output;
	
			
	}
	
	//Method for inOrder Traversal
	String inOrder(BinaryTree first){
		 
			
		if(first.leftChild!=null){
			inOrder(first.leftChild);
		}
		output+=first.nodeData+" ";
		
		if(first.rightChild!=null){
			inOrder(first.rightChild);
		}
		return output;
	
			
	}
	
	//Method for postOrder Traversal
	String postOrder(BinaryTree first){
				if(first.leftChild!=null){
					postOrder(first.leftChild);
				}
				if(first.rightChild!=null){
					postOrder(first.rightChild);
				}
				output+=first.nodeData+" ";
				return output;	
	}
	 
	////Method for mirrorOrder Traversal
	String mirrorOrder(BinaryTree first){
		 
			
		 output+=first.nodeData+" ";
			
		 if(first.rightChild!=null){
			 mirrorOrder(first.rightChild);
		 }
		 if(first.leftChild!=null){
			 mirrorOrder(first.leftChild);
		 }
		 return output;	
		
	}
	
	
}
//End of class
