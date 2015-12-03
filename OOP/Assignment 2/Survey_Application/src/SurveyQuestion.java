
/**
 * @author Amit
 *
 */
public class SurveyQuestion
{
	/** Method to return age question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String age(boolean flag)
	{
		if(flag == false)
			return "Enter your age: ";
		else
			return "Age: ";
	}
	
	/** Method to return nationality question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String nationality(boolean flag)
	{
		if(flag == false)
			return "Enter your Nationality: ";
		else
			return "Nationality: ";
	}
	
	/** Method to return Gender question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String gender(boolean flag)
	{
		if(flag == false)
		{
			return "Enter Gender: ";
		}
		else
			return "Gender: ";
	}
	
	/** Method to return rating question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String ratingHeritages(boolean flag)
	{
		if(flag == false)
			return "Overall rating of trip:(Only single selection is allowed)\n 1. Excellent\n 2. Good \n 3. Fair \n 4. bad\n";
		else
			return "Overall rating of trip: ";
	}
	
	/** Method to return Favorite Heritages question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String favoriteHeritages(boolean flag)
	{
		if(flag == false)
			return "Enter the Haritages which you like the most (use comma seperated list)";
		else
			return "Favourite Haritages: ";
	}
	 
	/** Method to return Feedback question
	 *@param flag : boolean type parameter. false is passed then question is displayed for survey and true
	 * is passed when survey result is being displayed 
	 */
	public String feedback(boolean flag)
	{
		if(flag == false)
			return "Submit Feedback\n";
		else
			return "Feedback: ";
	}
}
