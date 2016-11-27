global class CreateStudent {
   webservice static String CreateStudentWithRequiredField(String firstName,String lastName,String className) {
       Class__c newClass = new Class__c(name=className);
       insert newClass;
       student__c newStudent =new student__c(First_Name__c=firstName,LastName__c=lastName,Class__c=newclass.id);
       insert newStudent;
       return newStudent.id;
    }
     webservice static String CreateStudentWithClassid(String firstName,String lastName,String ClassId) {
       student__c newStudent =new student__c(First_Name__c=firstName,LastName__c=lastName,Class__c=ClassId);
       insert newStudent;
       return newStudent.id;
    }
}