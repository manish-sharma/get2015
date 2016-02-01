public class ComponentController {
    Public Integer noOfRecords{get; set;}
    public Integer selectedValue{get;set;}
    public String sortField{get;set;}
    public Integer size{get  ; set;}
    public ApexPages.StandardSetController setCon {
        get{
            if(setCon == null) {
                size = 10;
                string queryString = 'Select Name,Id from Account';
                setCon = new ApexPages.StandardSetController(Database.getQueryLocator(queryString));
                setCon.setPageSize(10);
                noOfRecords = setCon.getResultSize();
            }    
            return setCon;
        }set;
    }
    
    Public List<Account> getaccList(){
        return setCon.getRecords();
    }
    public void sort() {
        size = 10;
        System.debug(sortField);
        string queryString = 'Select Name,Id from Account order by '+sortField;
        setCon = new ApexPages.StandardSetController(Database.getQueryLocator(queryString));
        setCon.setPageSize(10);
        noOfRecords = setCon.getResultSize();
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
    public void Go() {
        if(selectedValue <= 1 ) {
            first();
        }
        else{
            first();
        for(Integer i = 1; i< selectedValue-1 ;i++)
    	next();
        next();
        }
    }
}