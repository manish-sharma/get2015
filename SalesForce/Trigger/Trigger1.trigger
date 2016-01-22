trigger Trigger1 on Contact (before insert,before update) {
    for(Contact cnt : trigger.new) {
        if(cnt.subjects__c != null) {
            if(cnt.subjects__c.contains('Hindi')) {
            cnt.addError('Can not insert or update');
        	}
        }
        
    }
}