/*
* Name: SearchRecords
* author: Anurag
* Since: 20 January, 2016
*/
public class SearchRecords {
    // For the city
    public string getBillingCitystring{get;set;}
    // For the State
    public string getBillingStatestring{get;set;}
    // For the Country
    public string getBillingCountrystring{get;set;}
    // To store the Account
    public List<Account> createAccountList{get;set;}
    // To store the Total Records
    private integer totalRecs = 0;
    // To store the offset Size
    private integer OffsetSize = 0;
    // For the Limit Size
    private integer LimitSize = 10;
    /**
* Name: searchRecords
* Description: Finds the Records on the Given Filter Option
*/
    public void searchRecords(){
        //CreateAccountList is Populated
        createAccountList= new list<Account>();
        // Total Records of the Accounts
        totalRecs = [select count() from account];
        // Query to be Build
        string Query = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account where ';
        // Checking the Query for being Blank
        if(string.isBlank(getBillingCitystring)  && string.isBlank(getBillingStatestring) && string.isBlank(getBillingCountrystring)) 
        {
            Query = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account';
        }    
        // Checking City if blank
        if(!(string.isBlank(getBillingCitystring)))
        {
            Query = Query + 'billingcity LIKE \'%'+getBillingCitystring+'%\' AND ';
            
        }
        // Checking Country if blank
        if(!(string.isBlank(getBillingCountrystring)))
        {
            Query = Query + ' billingcountry  LIKE  \'%'+getBillingCountrystring+'%\' AND ';
        }
        // Checking state if blank
        if(!(string.isBlank(getBillingStatestring)))
        {
            Query = Query +  ' billingstate LIKE  \'%'+getBillingStatestring+'%\' AND ';
        }
        // Removing SubString
        if(Query.substring(Query.length()-4,Query.length()).equals('AND '))
        {
            Query= Query.substring(0,Query.length()-4);
        }
        Query = Query +  ' LIMIT ' + LimitSize + ' OFFSET ' + OffsetSize;
        createAccountList= Database.query(Query);                  
    }
    /*
     * Name: FirstPage
     * Description:Sets the Offset Page to Zero
     */
    public void FirstPage() {
        OffsetSize = 0;
        searchRecords();
    }
    /*
     * Name:previous
     * Description: Sets the OffsetSize by decreasing the Limitsize
     */
    public void previous() {
        OffsetSize = OffsetSize - LimitSize;
        searchRecords();
    }
    /*
     * Name:next
     * Description: Sets the Offset By increasing the Limitsize
     */
    public void next() {
        OffsetSize = OffsetSize + LimitSize;
        searchRecords();
    }
    /*
     * Name:LastPage
     * Description: Sets the Offset Size
     */
    public void LastPage() {
        OffsetSize = totalrecs - math.mod(totalRecs,LimitSize);
        searchRecords();
    }
    /*
     * Name: getprev
     * Description: returns the OffsetSize true when to enable and disable
     */
    public boolean getprev() {
        if(OffsetSize == 0)
            return true;
        else
            return false;
    }
    /*
     * Name: getnxt/**
     * 
     * Description: returns the OffsetSize true when to enable and disable
     */
    public boolean getnxt() {
        if((OffsetSize + LimitSize) > totalRecs)
            return true;
        else
            return false;
    }
}