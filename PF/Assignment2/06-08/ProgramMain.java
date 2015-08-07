

public class ProgramMain {

	public static void main(String[] args) {
		
		Day2Assignment assign=new Day2Assignment();
		String[] pyramid=	assign.printPyramid(9);
		for (String str : pyramid)
		System.out.println(str);
		
		System.out.println();
		Day2AssignmentII assign2=new Day2AssignmentII();
		
		String[] pyramid2=	assign2.printPyramid(5);
		for (String str : pyramid2)
		System.out.println(str);

	}

}
