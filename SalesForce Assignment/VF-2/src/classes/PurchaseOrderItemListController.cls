public class PurchaseOrderItemListController {
    public List<Product2> products {get;set;}
    public List<PurchaseOrderListItem__c> items{
        get{
            List<PurchaseOrderListItem__c> item = [SELECT ID,ProductCode__c,Name,Price__c,Quantity__c,TotalPrice__c From PurchaseOrderListItem__c];
            return item;
            }
        set;
    }
    public List<SelectOption> category {
        get {
            List<SelectOption> categoryList = new List<SelectOption>();
            Schema.DescribeFieldResult fieldResult = Product2.Category_Value__c.getDescribe();
            List<Schema.PicklistEntry> ple = fieldResult.getPickListvalues();
            for(Schema.PicklistEntry f:ple)
                categoryList.add(new SelectOption(f.getLabel(),f.getValue()));
            return categoryList;
        }
    }
    public String idOfProduct {get;set;}
    public String selectedCategory{get;set;}
    public void calculatePricing(){
        products = [SELECT ID,ProductCode,Name,Price__C,Category_Value__c from Product2 where Category_Value__c =:selectedCategory];
        System.debug(products);
    }
    public void removeFromCart() {
        List<PurchaseOrderListItem__c> product = [SELECT Id,Name from PurchaseOrderListItem__c where ID =: idOfProduct LIMIT 1];
        PurchaseOrderListItem__c getProduct;
        if(product.size() > 0){
            getProduct = product.get(0);
        }
        delete getProduct;
    }
    
    public void addToCart(){
        List<PurchaseOrderListItem__c> purchaseOrderItems;
        List<Product2> product = [SELECT ID,ProductCode,Name,Price__c,Category_Value__c FROM Product2 where ID=:idOfProduct LIMIT 1];
        Product2 getProduct;
        PurchaseOrderListItem__c purchaseOrder;
        if(product.size() > 0){
            getProduct=product.get(0);
        }
        purchaseOrderItems = [SELECT ID,Name,Quantity__c,Price__c,TotalPrice__c from PurchaseOrderListItem__c where Product3__r.id =:getProduct.id LIMIT 1];
        if(purchaseOrderItems.size()>0){
            purchaseOrder =purchaseOrderItems.get(0);
            purchaseOrder.Quantity__c += 1;
            update purchaseOrder;
        }
        else{
        purchaseOrder = new PurchaseOrderListItem__c (name = getProduct.name,Price__c = getProduct.Price__c,ProductCode__c = getProduct.ProductCode,Product3__c=getProduct.id);
        insert purchaseOrder;
        }
    }
    
}