public with sharing class ManageClassController {
   
   // To Display the Records
   public Class__c recordsToDisplay { get; private set; }
   // To save the Records
   public Class__c saveRecords { get; private set; }
   // To Update the Record
   public String idToUpdate {get;set;}
   // To display the Popup
   public boolean displayPopup {get; set;} 
   
   public String thisClass {get; set;}
   // Query to get the Details
   String query = 'SELECT Id, Name__c, RAJ_CBSE_BIHAR__c, board__c FROM Class__c ';
   // Constructor
   public ManageClassController(ApexPages.StandardController controller) {
   }
   /*
    * Name:saveDetails
    * Description: Save the Class afterEdit
    */
   public void saveDetails() {  
       displayPopup = false;
       update saveRecords;
       
   }  
   /*
    * Name:deleteDetails
    * Description: Delete the Details 
    */
   public void deleteDetails() { 
       saveRecords = [SELECT 
                      id,name__c,RAJ_CBSE_BIHAR__c 
                      FROM
                      Class__c 
                      WHERE id = :idToUpdate];
       delete saveRecords;
   }  
   /*
    * Name:ShowDataToEdit
    * Description: Displays the Data to Edit
    */
   public void ShowDataToEdit() { 
       // Query to fetch the Records
       saveRecords = [SELECT
                      id, name__c, RAJ_CBSE_BIHAR__c,board__C 
                      FROM Class__c
                      WHERE id = :idToUpdate];
       displayPopup = true;    
   }   
   /*
    * Name:getRecords
    * Description: Fetches the Data 
    */ 
   public List<Class__C> getRecords() 
   {
       return Database.query(query);
   }  
}