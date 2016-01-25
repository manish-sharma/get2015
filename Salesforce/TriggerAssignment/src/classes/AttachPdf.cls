/*
 * Name: AttachPdf
 * Since: 21 January,2016
 * Description: Adds To the Attachment
 */
public with sharing class AttachPdf {
    // AlreadySet to check the status
    public String alreadySet;
    Student__c student;
    //Constructor to Get the Record And Set the Value
    public AttachPdf(ApexPages.StandardController controller) {
        student = (Student__c)controller.getRecord();
        alreadySet = System.currentPageReference().getParameters().get('check');
    }
    /**
     * Name: savePdf
     * Description: To save the Pdf Using Blob
     */
    public PageReference savePdf(){
       
        PageReference pdf = Page.StudentPdf;
        pdf.getParameters().put('id',student.Id);
        pdf.getParameters().put('check','YES');
        // create the new attachment
        Attachment attach = new Attachment();    
        // the contents of the attachment from the pdf
        Blob body;
        if(alreadySet != 'YES'){
            try {
                body = pdf.getContent();  
            } catch (VisualforceException e) {
                body = Blob.valueOf('Some Text');
            }
            attach.Body = body;
            // add the user entered name
            attach.Name = student.First_Name__c+'.pdf';
            attach.IsPrivate = false;
            // attach the pdf to the account
            attach.ParentId= student.Id;
            insert attach;
        }
        return null;
    }
}