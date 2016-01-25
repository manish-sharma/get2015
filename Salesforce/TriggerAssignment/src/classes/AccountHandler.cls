public class AccountHandler 
{
	public static Account insertNewAccount(String input)
    {
        Account acct = new Account(Name=input);
        try
        {
            insert acct;
        }

        catch(DmlException e)
        {
            return null;
        }
        return acct;
    }
}