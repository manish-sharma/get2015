/**
* Author: Dheeraj Kumar	
* Created Date: 28/01/2016
* Name: TemplateController
* Desc: Tempalate with pagination show account name and billing city
*/
public class TemplateController {
    
    public List<Account> accountList { get; set; }
    private integer totalRecs = 0;
    private integer OffsetSize = 0;
    private integer LimitSize = 10;
    
    private String sortType = 'ASC';
    private String sortField = 'Name';
    
    
    
    /**
*    @param  void
*    @return 
*    @desc constructor
*/
    Public TemplateController() {
        fetch();
        
    }
    
    /**
*    @param  void
*    @return void
*    @desc fetch record and put into account List
*/
    private void fetch() {
        String query = 'SELECT Name, BillingCity FROM Account ORDER BY ' + sortColumn  + ' ' + sortType + ' LIMIT ' + LimitSize + ' OFFSET ' + OffsetSize;
        accountList = Database.query(query);
        totalRecs = accountList.size();
        
    }
    /**
*    @param  void
*    @return void
*    @desc showing first page
*/
    public void FirstPage() {
        OffsetSize = 0;
        fetch();
    }
    /**
*    @param  void
*    @return void
*    @desc showing previous page
*/
    public void previous() {
        OffsetSize = OffsetSize - LimitSize;
        fetch();
    }
    
    /**
*    @param  void
*    @return void
*    @desc showing next page
*/
    public void next() {
        OffsetSize = OffsetSize + LimitSize;
        fetch();
    }
    /**
*    @param  void
*    @return void
*    @desc showing last page
*/    
    public void LastPage() {
        OffsetSize = totalrecs - math.mod(totalRecs, LimitSize);
        fetch();
    }
    /**
*    @param  void
*    @return void
*    @desc check is previous page is available or not
*/    
    public boolean getprev() {
        if(OffsetSize == 0)
            return true;
        return false;
    }
    /**
*    @param  void
*    @return void
*    @desc check is next page is available or not
*/   
    public boolean getnxt() {
        if((OffsetSize + LimitSize) > totalRecs)
            return true;
        return false;
    }
    /**
*    @param  void
*    @return void
*    @desc used for changing the state of order asc and desc
*/   
    public String sortColumn {
        get { return sortField; }
        
        set {
            if (value == sortField)
                sortType = (sortType == 'ASC')? 'DESC' : 'ASC';
            else
                sortType = 'ASC';
            sortField = value;
        }
    }
    /**
*    @param  void
*    @return void
*    @desc getter sortType 
*/   
    public String getSortType() {
        if (sortColumn == null || sortColumn == '')
            return 'ASC';
        else
            return sortType;
    }
    /**
*    @param  void
*    @return void
*    @desc setter sortType 
*/   
    public void setSortType(String value) {  
        sortType = value;
    }
    /**
*    @param  void
*    @return void
*    @desc getting  data after page is loaded  
*/    
    public PageReference sortData() {
        fetch();
        return null;
    }
}