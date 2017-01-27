
public class Mentor implements Authority{
     Authority nextAuthority;
	@Override
	public void process(int dayOfLeave) {
		if(dayOfLeave <= 1 )
		{
			System.out.println("Leave Approved by Mentor for "+ dayOfLeave+" days");
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
