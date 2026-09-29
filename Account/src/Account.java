class Account {
    double balance;
    Account() {
        balance = 0;
    }
    Account(double b, double x) {
        balance = b;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    public static void main(String[] args) {

        Account a = new Account(2000, 0);

        a.deposit(978);
        a.withdraw(444);

        System.out.println("Balance = " + a.balance);
    }
}