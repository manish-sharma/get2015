public class ClickMeController {
    public String recordId{set ;get ;}
    public String name{set;get;}
    public String classs{set;get;}
    public ClickMeController(ApexPages.StandardController con) {
    	recordID = ApexPages.CurrentPage().getparameters().get('id');
        System.debug(recordID);
    }
}