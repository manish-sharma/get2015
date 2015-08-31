package com.tree.mirror.similar;

import com.tree.binary.searchTree.BinarySearchTree;

public class VerifyMirrorSimilarTrees {
	static String firstTreeElements="";
	static String secondTreeElements="";
	public void areTreeMirrorSimiliar(Tree<Object> rootNodeOfFirstTree,
		Tree<Object> rootNodeOfSecondTree) {
		if(rootNodeOfFirstTree!=null){
			if(rootNodeOfSecondTree!=null){
				firstTreeElements=preOrderTraversingOfFirstTree(rootNodeOfFirstTree);
				secondTreeElements=postOrderTraversingOfSecondTree(rootNodeOfSecondTree);
				if(firstTreeElements.equalsIgnoreCase(secondTreeElements)){
					System.out.println("Both trees are mirror similiar\n");
				}
				else{
					System.out.println("Both trees are mirror similiar\n");
				}
			}
			else{
				System.out.println("second tree is empty");
			}
		}
		else{
			System.out.println("first tree is empty");
		}
		
		}

	private String preOrderTraversingOfFirstTree(Tree<Object> rootNodeOfFirstTree) {
		firstTreeElements=rootNodeOfFirstTree.nodeValue+firstTreeElements;
		 if(rootNodeOfFirstTree.leftChild!=null){
			
			 preOrderTraversingOfFirstTree(rootNodeOfFirstTree.leftChild);
		 }
		 if(rootNodeOfFirstTree.rightChild!=null){
			 preOrderTraversingOfFirstTree(rootNodeOfFirstTree.rightChild);
		 }
			return firstTreeElements; 
					
		}
		private String postOrderTraversingOfSecondTree(Tree<Object> rootNodeOfSecondTree){
		
		 if(rootNodeOfSecondTree.leftChild!=null){
			
			 postOrderTraversingOfSecondTree(rootNodeOfSecondTree.leftChild);
		 }
		 if(rootNodeOfSecondTree.rightChild!=null){
			 postOrderTraversingOfSecondTree(rootNodeOfSecondTree.rightChild);
		 }
		 secondTreeElements=secondTreeElements+rootNodeOfSecondTree.nodeValue;
		return secondTreeElements;
			 
		
		}
		
			
		

		
	}


