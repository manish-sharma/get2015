
public class SeniorMentor implements Authority{
     Authority nextAuthority;
	@Override
	public void process(int dayOfLeave) {
		if(dayOfLeave <= 2 )
		{
			System.out.println("Leave Approved by Senior Mentor for "+ dayOfLeave+" days");
		}
		else {
			nextAuthority.process(dayOfLeave);
		}
	}

	@Override
	public void setNextAuthority(Authority authority) {
		 nextAuthority = authority;
	}
   
}
