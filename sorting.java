
public class Sorting {

	Node<Integer> nextNew;
	Node<Integer> pre;
	Integer min=0,i,j,k;
	int count =0;
	public  Node<Integer>  sortedList(Node<Integer> first) {
		pre= first;
		
		while(pre.next != null){
			pre=pre.next;
			count++;
		}
		k=count;
		
		pre =first;
			for(int i = 0; i < (count+1); i++){
			pre=first;
			nextNew=pre.next;
			for(j=0;j < (count); j++){
				if(pre.nodeData> nextNew.nodeData){
					min=pre.nodeData;
					pre.nodeData=nextNew.nodeData;
					nextNew.nodeData= min;
			}
				pre= pre.next;
				nextNew = nextNew.next;
			}
			}
		
		return first;
	}

	}

