package deadlock;

public class BankAccountDeadLockSolution {
	double balance;
    int id;
     
    BankAccountDeadLockSolution(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
     
    void withdraw(double amount) {
        // Wait to simulate io like database access ...
        try {Thread.sleep(10l);} catch (InterruptedException e) {}
        balance -= amount;
        System.out.println("withdraw amount = " + amount+" from "+ this.id);
    }
     
    void deposit(double amount) {
        // Wait to simulate io like database access ...
        try {Thread.sleep(10l);} catch (InterruptedException e) {}
        balance += amount;
        System.out.println("Deposited amount = " + amount+" to " +this.id);
    }
     
    static void transfer(BankAccountDeadLockSolution from, BankAccountDeadLockSolution to, double amount) {
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
        final BankAccountDeadLockSolution fooAccount = new BankAccountDeadLockSolution(1, 100d);
        final BankAccountDeadLockSolution barAccount = new BankAccountDeadLockSolution(2, 100d);
         
        new Thread() {
            public void run() {
            	 System.out.println(currentThread().getName()+" starts..");
                BankAccountDeadLockSolution.transfer(fooAccount, barAccount, 10d);
            }
        }.start();
         
        new Thread() {
            public void run() {
            	 System.out.println(currentThread().getName()+" starts..");
                BankAccountDeadLockSolution.transfer(fooAccount,barAccount,10d);
            }
        }.start();
         
    }

}
