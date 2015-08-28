/****************************************************************************************
Name            : BST
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform all opertion of BinarySeachTree
                :
****************************************************************************************/

public class BinarySeachTree {
	
	int nodeData;
	BinarySeachTree leftChild;
	BinarySeachTree rightChild;
	static BinarySeachTree rootNode=null;
	
	BinarySeachTree(){
		nodeData=0;
		rightChild=null;
		leftChild=null;
	}
	
	BinarySeachTree createNode(int data){
		BinarySeachTree newnode=new BinarySeachTree();
		newnode.nodeData=data;
		return newnode;	
	}
	
	
	
	void addNode(int data){
		BinarySeachTree nnode=createNode(data);
		if(rootNode==null){
			rootNode=nnode;
		}
		
		
		else{
			BinarySeachTree first=rootNode;
			while(true){
				if(data<first.nodeData){
					if(first.leftChild!=null){
						first=first.leftChild;
						
					}
					else{
						break;
					}
				}
				else{
					if(first.rightChild!=null){
						first=first.rightChild;
					
					}
					else{
						break;
					}
					
				}
			}
			
			if(data<first.nodeData){
				first.leftChild=nnode;
			
			}
			else{
				first.rightChild=nnode;
			
			}
		}
	}
	
	 void preOrder(BinarySeachTree first){
		
		System.out.println(first.nodeData);
		
		
			if(first.leftChild!=null){
				preOrder(first.leftChild);
			}
			if(first.rightChild!=null){
				preOrder(first.rightChild);
			}
		
		
	}
	 
	 void postOrder(BinarySeachTree first){
			
				if(first.leftChild!=null){
					postOrder(first.leftChild);
				}
				if(first.rightChild!=null){
					postOrder(first.rightChild);
				}
				System.out.println(first.nodeData);
		
	 }
	 
	
	
	
	
	

}
