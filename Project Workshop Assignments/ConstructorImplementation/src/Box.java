
public class Box {
 
	private double width;
	private double length;
	private double depth;
	
	Box(Box ob)
	{
		width=ob.width;
		length=ob.length;
		depth=ob.depth;
	}
	
	Box(double width,double length,double depth){
		this.width=width;
		this.length=length;
		this.depth=depth;
	}
	
	Box(){
		width=-1;
		length=-1;
		depth=-1;
	}
	
	Box(double len){
	  width=length=depth=len;
	}
	
	double volume(){
		return width*length*depth;
	}
}
