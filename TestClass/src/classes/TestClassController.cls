@isTest
public class TestClassController {
    public static testMethod void testgetRecords() {
        ClassController cc = new ClassController();
		Class__c cls = new Class__c();
        cls.Name = 'Test Class';
        cls.Board__c = 'RAJ';
        cls.Fee__c = 1000;
    	cc.idToUpdate = Database.insert(cls).getId();
        cc.saveRecords = cls;
        cc.saveDetails();
        Class__c clsActual = [SELECT Id, Name, fee__c, board__c from Class__c where id =: cc.idToUpdate];
        System.assertEquals(cls,clsActual);
        List<Class__c> classListActual = new List<Class__c>();
        classListActual = cc.getRecords();
        List<Class__c> classListExpected = new List<Class__c>([SELECT Id, Name, fee__c, board__c FROM Class__c]);
        System.assertEquals(classListExpected, classListActual);
        
        cc.thisClass = 'Class';
        System.assertEquals('Class', cc.thisClass);
        
        cc.ShowDataToEdit();
        clsActual = [SELECT Id, Name, fee__c, board__c FROM Class__c where id =:cc.idToUpdate];
        System.assertEquals(clsActual, cls);
        
        cc.deleteDetails();
        try {
        	clsActual = [SELECT Id, Name, fee__c, board__c FROM Class__c where id =:cc.idToUpdate];
        }catch(Exception e) {
            
        }
    }
}