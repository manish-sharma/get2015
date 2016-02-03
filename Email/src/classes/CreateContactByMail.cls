global class CreateContactByMail implements Messaging.InboundEmailHandler {
    global Messaging.InboundEmailResult handleInboundEmail(Messaging.inboundEmail email,Messaging.InboundEnvelope env){
        Messaging.InboundEmailResult result = new Messaging.InboundEmailResult();
        for(Messaging.Inboundemail.TextAttachment file : email.textAttachments) {
            list<Contact>contactList=new list<Contact>();
            String fileBody = file.body;
            Dom.Document doc = new Dom.Document();
            doc.load(fileBody);
            for(DOM.XMLNode xmlnodeobj:doc.getRootElement().getChildElements())
            {          
                System.debug('xmlnodeobj ' + xmlnodeobj);
                Contact con = new Contact();
                String fName = xmlnodeobj.getChildElement('fname', null).getText();
                String lName = xmlnodeobj.getChildElement('lname', null).getText();
                String phone = xmlnodeobj.getChildElement('Phone',null).getText();
                String Title = xmlnodeobj.getChildElement('Title',null).getText();
                String EmailForCnt = xmlnodeobj.getChildElement('Email',null).getText();
                con.FirstName = fName;
                con.LastName = lName;
                con.phone = phone;
                con.Email = EmailForCnt;
                con.Title = Title;
                contactList.add(con);
            }
           	 insert contactList;
        }
        return result;
    }
}