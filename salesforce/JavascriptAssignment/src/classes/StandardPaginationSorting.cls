public class StandardPaginationSorting {

    // Variables required for Sorting.
    public String soql {get;set;}
    public List <Student__c> CandidateList1 = New List <Student__c>();
    public String soqlsort {get;set;}
    public List <Student__c> CandidateList2 = New List <Student__c>();

                // List used in to display the table in VF page.
                public List<Student__c> getCandidateList() {
                    // Passing the values of list to VF page.
                    return con.getRecords();
                }

                // instantiate the StandardSetController from a query locator
                public ApexPages.StandardSetController con {
                    get {
                                                if(con == null) {
                                                                // String Query to have a list of cases for a respective End-user.
                                                                soql = 'SELECT Name, Email__c, Experience__c,Candidate_Full_Name__c,JoiningDate__c,Contact_Number__c FROM Candidate__c';

                                                                // Passing the String array to a list with Selected field sorting.
                                                                CandidateList1 = Database.query(soql + ' order by ' + sortField + ' ' + sortDir ); 

                                                                // setting values of List in StandardSetController.
                                                                con = new ApexPages.StandardSetController(CandidateList1);

                                                                // sets the number of records in each page set
                                                                con.setPageSize(5);
                                                }
                                                return con;
        }
        set;
    }

    // indicates whether there are more records after the current page set.
    public Boolean hasNext {
        get {
            return con.getHasNext();
        }
        set;
    }

    // indicates whether there are more records before the current page set.
    public Boolean hasPrevious {
        get {
            return con.getHasPrevious();
        }
        set;
    }

    // returns the page number of the current page set
    public Integer pageNumber {
        get {
            return con.getPageNumber();
        }
        set;
    }

    // returns the first page of records
    public void first() {
        con.first();
    }

    // returns the last page of records
    public void last() {
        con.last();
    }

    // returns the previous page of records
    public void previous() {
        con.previous();
    }

    // returns the next page of records
    public void next() {
        con.next();
    }

    // returns the PageReference of the original page, if known, or the home page.
    public void cancel() {
        con.cancel();
    }

    // Method for Constructor is used for Test Class.
    public StandardPaginationSorting(){
    }

   //Toggles the sorting of query from asc<-->desc
    public void toggleSort() {
        // simply toggle the direction
        sortDir = sortDir.equals('asc') ? 'desc' : 'asc';

                                // run the query again for sorting other columns
                                soqlsort = 'SELECT Name, Email__c, Experience__c,Candidate_Full_Name__c,JoiningDate__c,Contact_Number__c FROM Candidate__c'; 

                                // Adding String array to a List array
                                CandidateList2 = Database.query(soqlsort + ' order by ' + sortField + ' ' + sortDir ); 

                                // Adding Caselist to Standard Pagination controller variable
                                con = new ApexPages.StandardSetController(CandidateList2);

                                // Set Page Size to 5
                                con.setPageSize(5);

    }

    // the current sort direction. defaults to asc
    public String sortDir {
        // To set a Direction either in ascending order or descending order.
                                get  { if (sortDir == null) {  sortDir = 'asc'; } return sortDir;}
        set;
    }

    // the current field to sort by. defaults to last name
    public String sortField {
        // To set a Field for sorting.
                                get  { if (sortField == null) {sortField = 'Name'; } return sortField;  }
        set;
    } 

}