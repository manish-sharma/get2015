public class ShoppingController {
    
    public  List <product2> products { get; set; }
    
    public  ID orderId {get;set;}
    
    public String idOfProductToAdd {get;set;}
  
    public String SelectedCategoty { get; set; }
    
    public List<PurchaseOrderLineItem__c> items {
        get
          {
            List<PurchaseOrderLineItem__c> item = [select ID,ProductCode__c,Name,Price__c,Quantity__c,TotalPrice__c from PurchaseOrderLineItem__c where PurchaseOrder__c =: orderId];
            return item;
          }
    set;}
   
    public List<SelectOption> Category
    {
        get
        {
         List<SelectOption> options = new List<SelectOption>();
         Schema.DescribeFieldResult fieldResult = product2.category__c .getDescribe();
         List<Schema.PicklistEntry> ple = fieldResult.getPicklistValues();
         
         for( Schema.PicklistEntry f : ple)
             options.add(new SelectOption(f.getLabel(), f.getValue()));
         
        return options;
        }
    }
  
      public ShoppingController(ApexPages.StandardController controller)
       { 
        orderId = System.currentPageReference().getParameters().get('id');
       }
    
      public  void calcPricing()
       {
        products = [select ID,ProductCode,Name,Price__c,category__c from product2 where category__c =:SelectedCategoty];
        system.debug(products);
       }
      
      public void RemoveFromCart()
       {
         List <PurchaseOrderLineItem__c> product = [select ID,name from PurchaseOrderLineItem__c where ID =:idOfProductToAdd Limit 1];
         PurchaseOrderLineItem__c getProduct;
         if(product.size()>0)
           {
            getProduct=product.get(0);
           }
        delete getProduct;
       }
    
      public void AddToCart()
       { 
        List<PurchaseOrderLineItem__c> ListItems; 
        
        List <product2> product=[select ID,ProductCode,Name,Price__c,category__c from product2 where ID =:idOfProductToAdd Limit 1];
       
        Product2 getProduct;
        PurchaseOrderLineItem__c PurchaseOrder;
    
        if(product.size()>0)
          {
           getProduct=product.get(0);
          }
        ListItems = [select ID,name,Quantity__c,Price__c,TotalPrice__c from PurchaseOrderLineItem__c where Product__r.id =:getProduct.id and purchaseOrder__c =:orderId Limit 1];
  
        if(ListItems.size()>0)
         {				
          PurchaseOrder=ListItems.get(0);
          PurchaseOrder.Quantity__c+=1;
          update PurchaseOrder;
         }    
       else
        {
         PurchaseOrder =new PurchaseOrderLineItem__c(name=getProduct.name,price__c=getProduct.Price__c,ProductCode__c=getproduct.ProductCode,Product__c=getProduct.id,PurchaseOrder__c = orderId);
         insert PurchaseOrder;
        }
    }
    
}