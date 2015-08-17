import java.util.ArrayList;
import java.util.List;


/**
 * @author Amit
 *
 */
public class Answer 
{
	List<Integer> ageList = new ArrayList<Integer>();
	List<Integer> ratingList = new ArrayList<Integer>();
	List<String> genderList = new ArrayList<String>();
	List<String> nationalityList = new ArrayList<String>();
	List<String> favoriteHeritagesList= new ArrayList<String>();
	List<String> feedbackList = new ArrayList<String>();
	
	/* this method stores age of a tourist */
	void age(int number)
	{
		ageList.add(number);
	}
	/* this method stores rating given by a particular tourist */
	void rating(int rating)
	{
		ratingList.add(rating);
	}
	
	/* this method stores gender of a particular tourist */
	void gender(String gender)
	{
		genderList.add(gender);
	}
	
	/* this method stores favorite heritages of a particular tourist */
	void favoriteHeritages(String favoriteHeritage)
	{
		favoriteHeritagesList.add(favoriteHeritage);
	}
	
	/* this method stores nationality of a particular tourist */
	void nationality(String nationality)
	{
		nationalityList.add(nationality);
	}
	
	/* this method stores feedback question */
	void feedbackSet(String answer)
	{
		feedbackList.add(answer);
	}
	
	/* This method returns age of a particular tourist */
	int getAge(int count)
	{
		int result;
		result = (int)ageList.get(count-1);
		return result;
	}
	
	/* This method returns Nationality of a particular tourist */
	String getNationality(int count)
	{
		String result;
		result = nationalityList.get(count-1);
		return result;
	}
	
	/* This method returns rating given by a particular tourist */
	int getRating(int count)
	{
		int result;
		result = (int)ratingList.get(count-1);
		return result;
	}
	
	/* This method returns gender of a particular tourist */
	String getGender(int count)
	{
		String result;
		result = genderList.get(count-1);
		return result;
	}
	
	/* This method returns favorite heritages of a particular tourist */
	String getfavoriteHeritages(int count)
	{
		String result;
		result = favoriteHeritagesList.get(count-1);
		return result;
	}
	
	/* this method returns feedback of a particular tourist */
	String feedbackGet(int count)
	{
		String result;
		result = feedbackList.get(count-1);
		return result;
	}
}
