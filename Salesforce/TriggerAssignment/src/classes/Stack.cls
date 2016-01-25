public class Stack {
    public class MyStack {
        private List<sObject> al;
        
        public MyStack() {
        al = new List<sObject>();
        }
        
        public void push(sObject item) {
        al.add(item);
        }
        
        public sObject pop() {
        if (!isEmpty())
        return al.remove(size()-1);
        else
        return null;
        }
        
        public boolean isEmpty() {
        return (al.size() == 0);
        }
        
        public sObject peek() {
        if (!isEmpty())
        return al.get(size()-1);
        else
        return null;
        }
        
        public Integer size() {
        return al.size();
        }

}



}