package CollegeAllotment;


/**
 * @author Sumitra
 *this is to use the college and to do all functions.
 */
public class CollegeUse {
College college[]=new College[5];
/**
 * set the entry for all colleges.
 */
public CollegeUse()
{
	college[0]=new College("GWECA",1,5);
	college[1]=new College("ECA",2,5);
	college[2]=new College("GIT",3,5);
	college[3]=new College("SKIT",4,5);
	college[4]=new College("JEC",5,5);
}
/**
 * will show all the list of college.
 */
public void show()
{
	System.out.println("-------------COLLEGE LIST------------");
	System.out.println("COLLEGE ID 		COLLEGE NAME		SEATS");
	for(int i=0;i<college.length;i++)
	{
		System.out.println(college[i].getI()+" 			"+college[i].getName()+"			 "+college[i].getSeats());
	}
}
/**
 * 
 * @param id college id in which student want to enroll
 * @param peek the student data who want to enroll
 * @return true if college is allocated else false
 */
public boolean allocate(int id, Student peek) {
	// TODO Auto-generated method stub
	for(int i=0;i<college.length;i++)
	{
		if(college[i].getI()==id)
		{
			if(college[i].getSeats()!=0)
			{
			college[i].setSeats(college[i].getSeats()-1);
			college[i].setStudentName(peek.getName());
			return true;
			}
			
			else
			{
				System.out.println("seats are full");
				return false;
			}
		}
			}
	
	return false;
	}
/**
 * will show all the list of college and students of that college.
 */
public void showList()
{
	System.out.println("----------ALLOCATED SEATS-----------");
	System.out.println("COLLEGE ID  	COLLEGE NAME 	SEATS 		STUDENTS");
	for(int i=0;i<college.length;i++)
	{
		System.out.println(college[i].getI()+"			"+college[i].getName()+"		 "+college[i].getSeats()+"		 "+college[i].getStudentName());
	}
}
}
