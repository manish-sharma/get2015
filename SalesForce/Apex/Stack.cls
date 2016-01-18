public class Stack{
    Node top = null;
    public Boolean isEmpty() {
        if(top == null) {
            return true;
        }
        else {
            return false;
        }
    }
    public void push(Integer info) {
        Node newNode = new Node(info);
        if(top == null) {
            top = newNode;
            newNode.next = null;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }
    public Integer pop() {
        if(isEmpty()) {
            return null;
        }
        else if(top.next == null) {
            Integer poppedInfo = top.info;
            top = null;
            return poppedInfo;
        }
        else {
            Integer poppedInfo = top.info;
            top = top.next;
            return poppedInfo;
        }
    }
    public void print() 
    {
        if(top == null) {
            System.debug('Empty');
        }
        else {
            while(top != null) {
                System.debug(top.info);
                top = top.next;
            }
        }
    }
}