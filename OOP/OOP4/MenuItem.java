import java.util.ArrayList;
public interface MenuItem {
	ArrayList<String> name=new ArrayList<String>();
	 ArrayList<String> ans1=new ArrayList<String>();
	 ArrayList<ArrayList<String>> ans2=new ArrayList<ArrayList<String>>();
	 ArrayList<String> ans3=new ArrayList<String>();
	public void display();
	

	public void takeAction(int i);

}
