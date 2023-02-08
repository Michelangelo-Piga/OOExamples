package bank.model;

import java.time.LocalDate;

public class Account {


    public double balance;
    public LocalDate openDate;
    public String customer;



    //Method Overload
    public double deposit(double amount){

        balance += amount;

        return balance;
    }

    //Method Overload
    public double deposit(double amount, double extra){

        balance += amount;
        balance += extra/2;

        return balance;
    }


    public double withDraw(double amount){

        balance -= amount;

        return balance;
    }


}
