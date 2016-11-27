public with sharing class SiteHomeController {
   public List<Student__c> stdList{set ;get ;} 
   public Student__c student{set ;get ;}
   public String selectedValue{set ;get ;}
   public boolean showDetail{set ;get ;}
   public ApexPages.StandardController controller;
   public SiteHomeController(ApexPages.StandardController con) {
showDetail = false;
       student = new Student__c();
   }
   
   public List<SelectOption> getselectList() {
       System.debug('hii');
       List<SelectOption> selectList = new List<SelectOption>();
       stdList = [select Name from Student__c];
       for(Student__c std : stdList) {
           selectList.add(new SelectOption(std.Id,std.Name));
       }
       return selectList;
   }
   
   public PageReference getStudent() {
       try{
           showDetail = true;
           student = [select Id,Name,Age__c,Class__c,DOB__c from Student__c where id =:selectedValue limit 1] ;
       	return null ;
       }
       catch(Exception e){
           return new PageReference('/apex/errorfinder');
       }
   }
 }