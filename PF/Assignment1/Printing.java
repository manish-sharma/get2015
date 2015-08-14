public class Printing {
	/*Starting of main function*/
	public static void main(String []args){
		
		Matrix mat = new Matrix(2,2);
		mat.addElements(0, 0, 1);
		mat.addElements(0, 1, 2);
		mat.addElements(1, 0, 3);
		mat.addElements(1, 1, 4);
		Matrix temp = mat.transpose();
		temp.show();
		
	}
	/*Ending of main function*/
}
