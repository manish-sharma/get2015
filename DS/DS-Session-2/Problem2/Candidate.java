
public class Candidate {
   private String name;
   private String registrationNumber;
   private int rank;
   public Candidate(String name, String regNumber,int rank)
   {
	   this.name = name;
	   this.registrationNumber = regNumber;
	   this.rank = rank;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public String getRegistrationNumber()
   {
	   return registrationNumber;
   }
   
   public int getRank()
   {
	   return rank;
   }

   
}
