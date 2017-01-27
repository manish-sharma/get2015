
public class HrManager implements Authority{
     Authority nextAuthority;
	@Override
	public void process(int dayOfLeave) {
		if(dayOfLeave > 2 )
		{
			System.out.println("Leave Approved by HR Manager for "+ dayOfLeave+" days");
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
