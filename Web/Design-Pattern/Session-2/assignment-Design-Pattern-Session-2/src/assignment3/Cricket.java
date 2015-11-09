package assignment3;

public abstract class Cricket {
	protected abstract void initialization();
	protected abstract void startCricket();
	protected abstract void teaBreak();
	protected abstract void endCricket();
	
	public final void play()
	{
		initialization();
		startCricket();
		teaBreak();
		endCricket();
	}

}
