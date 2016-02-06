public with sharing class PDFAttachTest {
    Student__c student ;
    private Id studentID ;
     private String alreadySet;
    private List<Attachment> attatchment;
    private Integer countOfAttatchment;
     public PDFAttachTest(ApexPages.StandardController controller) {
     studentId= System.currentPageReference().getParameters().get('id');
     // this is new constructor which should fix your problem
     // savePdf();\
         student = [SELECT Name,First_Name__c,Last_Name__c,AgeBox__c,Email__c,Married__c,WifeName__c,Sex__c FROM Student__c where Student__c.Id =:studentID];
         System.debug(student);
    //alreadySet = System.currentPageReference().getParameters().get('check');
    }
    
    
    public PageReference savePdf() {
        
        PageReference pdf = Page.StudentDetailPdf;
        pdf.getParameters().put('Id', student.Id);
        //pdf.getParameters().put('check', 'YES');
        // create the new attachment
        
        Attachment attach = new Attachment();   
       
         Blob body;
        // the contents of the attachment from the pdf
        //flag to check pdf generated only once - to avoid recursive calls
        //if(alreadySet !='YES') {
    		try {
               
                // returns the output of the page as a PDF
                body = pdf.getContent(); 
                System.debug(body);
                // need to pass unit test -- current bug    
            } catch (VisualforceException e) {
                system.assert(false, e.getMessage());
                system.debug('my Exception==' + e.getMessage());
                body = Blob.valueOf('there is error ');
            }
            attach.Body = body;
                // add the user entered name
                attach.Name = student.Name;
                //attach.IsPrivate = false;
                // attach the pdf to the account
                attach.ParentId= student.Id;
                attatchment = [SELECT Id,Name FROM Attachment  where ParentId=:studentID];
         countOfAttatchment = attatchment.size();
         System.debug(countOfAttatchment);
        if(countOfAttatchment > 0)
           {
               delete attatchment;
                   
            }
          
         
                insert attach;
        //}
        // send the user to the account to view results
       return new PageReference('/'+student.Id);
       // return null;
    }
    
}