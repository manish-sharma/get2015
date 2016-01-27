public class OnlinePurchaseController {
    public List<Product__c> productList {set ;get;}
    public string selectedCategory {set ;get;}
    public List<PurchaseLineItem__c> PurchaseLineItemList {set ;get ;}
    public String productID {get ;set ;}
    public String orderID {get ;set ;}
    public List<Id> numberOfLineItems {get ;set;}
    public Boolean isAllCorrect{get ; set;}
    
    public OnlinePurchaseController() {
        isAllCorrect = true;
        numberOfLineItems = new List<Id>();
    }
    
    public List<SelectOption> getCategory() {
        
        List<SelectOption> category = new List<SelectOption>();
        for(Product__c product : [select category__c from Product__c]) {
            category.add(new SelectOption(product.category__c,product.category__c));
        }
        return category;
    }
    
    public PageReference getProducts() {
        productList = [select Name,Price_Per_Item__c from Product__c where category__c =: selectedCategory];
        return null;
    }
    
    public PageReference addToCart() {
        isAllCorrect = true;
        Integer index = 0;
        Product__c prdct = [select Name,Price_Per_Item__c from Product__c where Id =:productID];
        PurchaseLineItem__c ordrLine = new PurchaseLineItem__c();
        ordrLine.Custom_Product__c = productID;
        ordrLine.Price_Per_Unit__c = prdct.Price_per_item__c;
        ordrLine.Quantity__c = 0;
        String orderId = Database.insert(ordrLine).getId();
        ordrLine.Id = orderId;
        if(PurchaseLineItemList == null) {
            PurchaseLineItemList = new List<PurchaseLineItem__c>();
        }
        for(Product__c prdct1 : productList) {
            if(prdct1.Id == prdct.Id) 
                break;
            index++;
        }
        productList.remove(index);
        PurchaseLineItemList.add(ordrLine);
 		return null;       
    }
    
    public PageReference remove() {
       	System.debug('orderID' + orderID);
        Integer index = 0;
        for(PurchaseLineItem__c item : PurchaseLineItemList ) {
            if(item.id == orderID) {
                PurchaseLineItem__c item1= PurchaseLineItemList.remove(index);
                System.debug('item1' + item1);
                productList.add([select Name,Price_Per_Item__c from Product__c where Id =:item1.Custom_Product__c]);
       			Database.delete(orderID);
                break;
            }
                
                index++;
        }
        index = 0;
        for(Id idFromList : numberOfLineItems) {
           	   if(idFromList == orderID) {
                   break;
            	}
            index++;
       	    } 
        numberOfLineItems.remove(index);
        if(numberOfLineItems.size() == PurchaseLineItemList.size()) {
            isAllCorrect = false;
        }
        if(numberOfLineItems.size() == 0) {
            isAllCorrect = true;
        }
        System.debug('numberOfLineItems.size() == PurchaseLineItemList.size()  '+numberOfLineItems.size() +' '+ PurchaseLineItemList.size());
        return null;
    }
    
    public PageReference addToOrder() {
        PurchaseOrder__c ordr = new PurchaseOrder__c();
        String orderId = Database.insert(ordr).getId();
        ordr.Id = orderId;
        for(PurchaseLineItem__c lineItem : PurchaseLineItemList) {
            lineItem.PurchaseOrder__c = orderId;
        }
        upsert PurchaseLineItemList; 
        return null;
    }
    
    public PageReference checkQuantity() {
        Integer index = 0;
        for(PurchaseLineItem__c item : PurchaseLineItemList ) {
            if(item.id == orderID) {
                break;
            }
            index++;
        }
        PurchaseLineItem__c item = PurchaseLineItemList[index];
        Product__c prdct = [select Quantity__c from Product__c where id =: item.Custom_Product__c];
        if(prdct.Quantity__c < item.Quantity__c) {
            remove();
            System.debug('prdct.Quantity__c'+prdct.Quantity__c+'item.Quantity__c ' +item.Quantity__c);
            ApexPages.AddMessage(new ApexPages.Message(ApexPages.Severity.ERROR, 'Sorry Quantity is not as your expectation! you can only order  '+prdct.Quantity__c +' items'));
        }
        Boolean isAvail = false;
        if(numberOfLineItems.size() == 0) {
             numberOfLineItems.add(orderID);
        }
        else {
           for(Id idFromList : numberOfLineItems) {
           	   if(idFromList == orderID) {
                   isAvail=true;
               		
                	break;
            	}
       	    } 
            if(isAvail == false) {
                numberOfLineItems.add(orderId);
            }
        }
        System.debug('numberOfLineItems.size() == PurchaseLineItemList.size()  '+numberOfLineItems.size() +' '+ PurchaseLineItemList.size());
        if(numberOfLineItems.size() == PurchaseLineItemList.size()) {
            isAllCorrect = false;
        }
        return null;
    }
}