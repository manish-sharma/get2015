public with sharing class ClassController {
    
    public Class__c recordsToDisplay { get; private set; }
    public Class__c saveRecords { get; private set; }
    public String idToUpdate {get;set;}
    public boolean displayPopup {get; set;} 
    
    public String thisClass {get; set;}
    String query = 'SELECT Id, Name, fee__c, board__c FROM Class__c ';
    public ClassController(ApexPages.StandardController controller) {
    }
    
    public void saveDetails() {  
        displayPopup = false;
        update saveRecords;
        
    }  
    
    public void deleteDetails() { 
        saveRecords = [SELECT id,Name,fee__C FROM Class__c WHERE id = :idToUpdate];
        delete saveRecords;
    }  
   
    public void ShowDataToEdit() { 
        saveRecords = [SELECT id, Name, fee__c,board__C FROM Class__c WHERE id = :idToUpdate];
        displayPopup = true;    
    }   
    
    public List<Class__C> getRecords() 
    {
        return Database.query(query);
    }  
}