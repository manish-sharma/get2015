public class PDFAttachOFStudent {
 Student__c student ;
   private Id studentID ;
    private String alreadySet;
     LIST<Attachment> attatchment=new LIST<Attachment>();
    public PDFAttachOFStudent(ApexPages.StandardController controller) {
    
    studentId= System.currentPageReference().getParameters().get('id');
    // this is new constructor which should fix your problem
    // savePdf();\
        student = [SELECT First_Name__c,LastName__c,Age__c,Email__c,Married__c,WifeName__c,Sex__c FROM Student__c where Student__c.Id =:studentID];
        
   //alreadySet = System.currentPageReference().getParameters().get('check');
   }
   
   
   public PageReference savePdf() {
       PageReference pdf = Page.StudentDetailPage;
       pdf.getParameters().put('Id', student.Id);
       //pdf.getParameters().put('check', 'YES');
       // create the new attachment
       
       Attachment attach = new Attachment();   
       //Delete of Attach if there already Attachment Exists
       attatchment = [SELECT Id,Name FROM Attachment  where ParentId=:studentID];
        if(attatchment.size() > 0)
            {
              delete attatchment;
            }
      
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
               attach.Name = student.First_Name__c;
               //attach.IsPrivate = false;
               // attach the pdf to the account
               attach.ParentId= student.Id;
               insert attach;
       //}
       // send the user to the account to view results
      return new PageReference('/'+student.Id);
      // return null;
   }
   
}