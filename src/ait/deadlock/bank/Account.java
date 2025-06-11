package ait.deadlock.bank;

import java.util.Objects;

public class Account {
    private int accNumer;
    private int balance;

    public Account(int accNumer) {
        this.accNumer = accNumer;
    }

    public int getAccNumer() {
        return accNumer;
    }

    public int getBalance() {
        return balance;
    }

    public  void debit(int sum){
        balance += sum;
    }

    public  void credit(int sum){
        balance -= sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accNumer == account.accNumer;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(accNumer);
    }
}
