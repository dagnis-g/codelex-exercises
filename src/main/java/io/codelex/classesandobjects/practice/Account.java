package io.codelex.classesandobjects.practice;

public class Account {

    public static void main(String[] args) {
        Account account1 = new Account("user1", 100);
        account1.deposit(20);
        System.out.println(account1);

        Account mattsAccount = new Account("Matt's Account", 1000);
        Account myAccount = new Account("My account", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(mattsAccount);
        System.out.println(myAccount);

        Account a = new Account("A",100);
        Account b = new Account("B",0);
        Account c = new Account("C",0);

        transfer(a,b,50);
        transfer(b,c,25);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
