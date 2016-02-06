global class XMLParser implements Messaging.InboundEmailHandler{

    global Messaging.InboundEmailResult handleInboundEmail(Messaging.InboundEmail email,Messaging.InboundEnvelope envelope) {
         Messaging.InboundEmailResult result = new Messaging.InboundEmailresult();
        for (Messaging.Inboundemail.TextAttachment file : email.textAttachments) {
            List<Contact> contactList = new List<Contact>();
            String fileBody = (String)file.body;
            Dom.Document doc = new Dom.Document();
            doc.load(fileBody);
            for(DOM.XMLNode xmlnodeobj:doc.getRootElement().getChildElements()){
                Contact con = new Contact();
                con.FirstName = xmlnodeobj.getChildElement('FirstName',null).getText();
                con.LastName = xmlnodeobj.getChildElement('LastName',null).getText();
                con.Phone = xmlnodeobj.getChildElement('Mobile',null).getText();
                con.Email = xmlnodeobj.getChildElement('Email',null).getText();
                con.Subjects__c = xmlnodeobj.getChildElement('Subject',null).getText();
                contactList.add(con);
            }
            if(contactList.size()>0)
                insert contactList;
         }
        return result;
    }
}