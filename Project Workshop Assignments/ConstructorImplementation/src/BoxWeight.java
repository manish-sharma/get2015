
public class BoxWeight extends Box {

	double weight;
	
	BoxWeight(BoxWeight ob){
		super(ob);
		weight=ob.weight;
	}
	
	BoxWeight(double width,double length,double depth,double weight){
		super(width,length,depth);
		this.weight=weight;
	}
	BoxWeight(){
		super();
		weight=-1;
	}
	
	BoxWeight(double length,double weight){
		super(length);
		this.weight=weight;
	}
}
