/*
 * This class contains the information of Candidate
 * @author Banwari kevat
 */
public class Candidate {
   private String name;
   private String registrationNumber;
   private int rank;
   /*
    * parameterized constructor
    * @param name is the name of candidate
    * @param registrationNumber is the registration number
    * @param rank is the rank of student in entrance exam
    */
   public Candidate(String name, String regNumber,int rank)
   {
	   this.name = name;
	   this.registrationNumber = regNumber;
	   this.rank = rank;
   }
   
   //get name
   public String getName()
   {
	   return name;
   }
   //get registration number
   public String getRegistrationNumber()
   {
	   return registrationNumber;
   }
   
   //get rank
   public int getRank()
   {
	   return rank;
   }

   
}
