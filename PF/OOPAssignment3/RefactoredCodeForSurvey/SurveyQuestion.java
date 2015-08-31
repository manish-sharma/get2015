

/**
 * @author Sumitra
 *this class is for questions to set them
 */
public class SurveyQuestion implements Question
{
	/* method to return Age question */
	public String age(boolean flag)
	{
		if(flag == false)
			return "Enter your age: ";
		else
			return "Age: ";
	}
	
	/* method to return nationality question */
	public String nationality(boolean flag)
	{
		if(flag == false)
			return "Enter your Nationality: ";
		else
			return "Nationality: ";
	}
	
	/* method to return gender question */
	public String gender(boolean flag)
	{
		if(flag == false)
		{
			return "Enter Gender: ";
		}
		else
			return "Gender: ";
	}
	
	/* method to return rating question */
	public String ratingHaritages(boolean flag)
	{
		if(flag == false)
			return "Overall rating of trip:(Only single selection is allowed)\n 1. Excellent\n 2. Good \n 3. Fair \n 4. bad\n";
		else
			return "Overall rating of trip: ";
	}
	
	 /* method to return favorite haritage question */
	
	public String favouriteHaritages(boolean flag)
	{
		if(flag == false)
			return "Enter the Haritages which you like the most (use comma seperated list)";
		else
			return "Favourite Haritages:";
	}
	 
	 /* method to return feedback question */
	public String feedback(boolean flag)
	{
		if(flag == false)
			return "Submit Feedback\n";
		else
			return "Feedback:";
	}

	

	
}
