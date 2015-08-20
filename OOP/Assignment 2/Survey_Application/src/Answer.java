import java.util.ArrayList;
import java.util.List;


/**
 * @author Amit
 *
 */
public class Answer 
{
	/** list of Age of tourists */ 
	List<Integer> ageList = new ArrayList<Integer>();
	
	/** list of Rating given by tourists */
	List<Integer> ratingList = new ArrayList<Integer>();
	
	/** list of Gender of tourists */
	List<String> genderList = new ArrayList<String>();
	
	/** list of Nationality of tourists */
	List<String> nationalityList = new ArrayList<String>();
	
	/** list of Favorite Heritages of tourists */
	List<String> favoriteHeritagesList= new ArrayList<String>();
	
	/** list of Feedbacks of tourists */
	List<String> feedbackList = new ArrayList<String>();
	
	/** this method stores age of a tourist in ageList 
	 * @param age : Age of Tourist
	 */
	void setAge(int age)
	{
		ageList.add(age);
	}
	/** this method stores rating given by a particular tourist in ratingList
	 *@param rating : rating given by a particular tourist
	 */
	void setRating(int rating)
	{
		ratingList.add(rating);
	}
	
	/** this method stores gender of a particular tourist in genderList
	 *@param gender : Gender of Tourist
	 */
	void setGender(String gender)
	{
		genderList.add(gender);
	}
	 
	/** this method stores favorite heritages of a particular tourist in favoriteHeritagesList
	 *@param favoriteHeritage : Favorite Heritages of tourist 
	 */
	void setFavoriteHeritages(String favoriteHeritage)
	{
		favoriteHeritagesList.add(favoriteHeritage);
	}
	
	/** this method stores nationality of a particular tourist in nationalityList
	 *@param nationality : Nationality of particular Tourist
	 */
	void setNationality(String nationality)
	{
		nationalityList.add(nationality);
	}
	
	/** this method stores feedback of tourist in feedbackList
	 *@param answer : feedback of tourist 
	 **/
	void setFeedback(String feedback)
	{
		feedbackList.add(feedback);
	}
	
	/** This method returns age of a particular tourist 
	 *@param count : Tourist Number 
	 *@return age : Age of Tourist
	 */
	int getAge(int count)
	{
		int age;
		age = (int)ageList.get(count-1);
		return age;
	}
	
	/** This method returns nationality of a particular tourist 
	 *@param count : Tourist Number 
	 *@return nationality : Nationality of Tourist
	 */
	String getNationality(int count)
	{
		String nationality;
		nationality = nationalityList.get(count-1);
		return nationality;
	}
	
	/** This method returns rating given by a particular tourist
	 * @param count : Tourist Number 
	 * return rating : rating given by particular Tourist
	 */
	int getRating(int count)
	{
		int rating;
		rating = (int)ratingList.get(count-1);
		return rating;
	}
	
	/** This method returns gender of a  particular tourist
	 * @param count : Tourist Number 
	 * return gender : Gender of particular Tourist
	 */
	String getGender(int count)
	{
		String gender;
		gender = genderList.get(count-1);
		return gender;
	}
	
	/** This method returns favoriteHeritages of a  particular tourist
	 * @param count : Tourist Number 
	 * return favoriteHeritage : favoriteHeritage of particular Tourist
	 */
	String getfavoriteHeritages(int count)
	{
		String favoriteHeritage;
		favoriteHeritage = favoriteHeritagesList.get(count-1);
		return favoriteHeritage;
	}
	
	/** This method returns feedback of a  particular tourist
	 * @param count : Tourist Number 
	 * return feedback : feedback of particular Tourist
	 */
	String feedbackGet(int count)
	{
		String feedback;
		feedback = feedbackList.get(count-1);
		return feedback;
	}
}
