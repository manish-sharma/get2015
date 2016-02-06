public with Sharing class SearchRecordWith {
    public Integer noOfRecords{get;set;}
    public Integer size{get;set;}
    public String billingCity {get;set;}
    public String billingState{get;set;}
    public String billingCountry{get;set;}
    public ApexPages.StandardSetController setCon{
        get;
        set;
    }
   Public List<Account> getAccounts(){
       if(setCon == null)
       {
           return null;
       }
        List<Account> accList = new List<Account>();
        for(Account a : (List<Account>)setCon.getRecords())
            accList.add(a);
        return accList;
    }
    
    public pageReference refresh() {
        setCon = null;
        getAccounts();
        setCon.setPageNumber(1);
        return null;
    }
    
    public void search(){
        size=5;
        if(string.isBlank(billingCity)&&string.isBlank(billingState)&&string.isBlank(billingCountry)){
                    String queryString = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account';
                    setCon = new ApexPages.StandardSetController(Database.getQueryLocator(queryString));
                    setCon.setPageSize(size);
                    noOfRecords = setCon.getResultSize();
        }
        else{
        String queryString = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account WHERE (billingcity LIKE \'%'+billingCity+'%\' OR billingCity = NULL)  AND (billingcountry  LIKE  \'%'+billingCountry+'%\' OR billingcountry = NULL) AND (billingstate LIKE  \'%'+billingState+'%\' OR billingstate = NULL)';
        setCon = new ApexPages.StandardSetController(Database.getQueryLocator(queryString)); 
        setCon.setPageSize(size);
        noOfRecords = setCon.getResultSize();
        }
    }
    
    public Boolean hasNext {
        get {
            return setCon.getHasNext();
        }
        set;
    }
    public Boolean hasPrevious {
        get {
            return setCon.getHasPrevious();
        }
        set;
    }
  
    public Integer pageNumber {
        get {
            return setCon.getPageNumber();
        }
        set;
    }
  
    public void first() {
        setCon.first();
    }
  
    public void last() {
        setCon.last();
    }
  
    public void previous() {
        setCon.previous();
    }
  
    public void next() {
        setCon.next();
    }
}