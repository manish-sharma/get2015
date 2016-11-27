@isTest
public class TestVerifyStack {
    
    @isTest static void insertItem()
    {  
        Stack TestStack=new Stack();
        integer ExpectedSize=2;
        TestStack.push(2);
        TestStack.push(-5);
        integer ExtualSize=TestStack.size();
        System.assertEquals(ExpectedSize,ExtualSize);
        
        
    }
    
     @isTest static void RemoveItem()
     {  
        Stack TestStack=new Stack();
        integer ExpectedSize=0;
        TestStack.push(7);
        TestStack.push(-35);
        TestStack.pop();
         TestStack.pop();
        System.assertEquals(ExpectedSize,ExpectedSize);
        
        
     }
       @isTest static void StackPeekValue()
     {  
        Stack TestStack=new Stack();
        integer ExpectedSize=74;
        TestStack.push(74);
        TestStack.push(-35);
        TestStack.pop();
        integer ExtualValue = (Integer)TestStack.peek();
        System.assertEquals(ExpectedSize,ExtualValue);
            
     }
       @isTest static void StackPeekValueIfStackIsEmpty()
     {  
        Stack TestStack=new Stack();
        Object ExpectedValue=null;
        Object ExtualValue =TestStack.peek();
        System.assertEquals(ExpectedValue,ExtualValue);
            
     }
        @isTest static void  RemoveItemIfStackIsEmpty()
        {  
        Stack TestStack=new Stack();
         Object ExpectedValue=null;
        Object ExtualValue =TestStack.pop();
        System.assertEquals(ExpectedValue,ExtualValue);
           
       }
}