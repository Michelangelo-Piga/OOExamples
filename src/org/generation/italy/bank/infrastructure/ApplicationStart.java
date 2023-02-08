package org.generation.italy.bank;

import org.generation.italy.bank.model.Account;
import java.util.Date;


public class ApplicationStart {
    public static void main(String[] args) {
        System.out.println("Starting Application..");

        Account a1 = new Account();
        Account a2 = new Account();

        System.out.println(a1.balance);
        a1.balance = 1000.0;
        System.out.println(a1.balance);


        System.out.println(a1.deposit(1000.0));
        System.out.println(a1.withDraw(500.0));
        System.out.println(a1.deposit(1000.0));



    }
}
