class Account {
    double balance;
    String account;
    Account() {
        balance = 0;
    }
    Account(double b, String x) {
        balance = b;
        account = "ah789";
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    public static void main(String[] args) {

        Account a = new Account(2000, "ah789");

        a.deposit(978);
        a.withdraw(444);

        System.out.println("Balance = " + a.balance);
    }
}