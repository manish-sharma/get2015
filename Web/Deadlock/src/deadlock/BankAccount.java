package deadlock;

public class BankAccount {
	double balance;
    int id;
     
    BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
     
    void withdraw(double amount) {
        // Wait to simulate io like database access ...
        try {Thread.sleep(10l);} catch (InterruptedException e) {}
        balance -= amount;
        System.out.println("In Withdraw method: withdraw amount = " + amount);
    }
     
    void deposit(double amount) {
        // Wait to simulate io like database access ...
        try {Thread.sleep(10l);} catch (InterruptedException e) {}
        balance += amount;
        System.out.println("In deposit method : deposited amount = " + amount);
    }
     
    static void transfer(BankAccount from, BankAccount to, double amount) {
    	 System.out.println("transferring amount from " + from.id +" to "+ to.id);
        synchronized(from) {
        	 System.out.println("withdrawing amount from " + from.id);
            from.withdraw(amount);
            synchronized(to) {
            	System.out.println("adding to " + to.id);
                to.deposit(amount);
            }
        }
    }
     
    public static void main(String[] args) {
        final BankAccount fooAccount = new BankAccount(1, 100d);
        final BankAccount barAccount = new BankAccount(2, 100d);
         
        new Thread() {
            public void run() {
            	 System.out.println(currentThread().getName()+" starts..");
                BankAccount.transfer(fooAccount, barAccount, 10d);
            }
        }.start();
         
        new Thread() {
            public void run() {
            	 System.out.println(currentThread().getName()+" starts..");
                BankAccount.transfer(barAccount, fooAccount, 10d);
            }
        }.start();
         
    }

}
