/*
Write a program to simulate basic bank account operations.

Create a class BankAccount with:

An instance variable balance

A constructor to initialize the balance

Implement methods:

deposit(amount) → adds money to balance

withdrawal(amount) → subtracts money only if sufficient balance exists

In the main program:

Take user input for:

Initial balance

Deposit amount

Withdrawal amount

Perform deposit and withdrawal operations

Print the final account balance

example:
Input: 1000 500 200
Output: 1300

 */
import java.util.*;

class BankAccount {

    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withDrawal(int amt) {
        if (this.balance > amt) {
            this.balance -= amt;
        }
    }
}

public class BankMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amts (1. Balance 2.Deposit 3.WithDrawal:");
        int b = sc.nextInt();
        int d = sc.nextInt();
        int w = sc.nextInt();

        BankAccount bc = new BankAccount(b);
        bc.deposit(d);
        bc.withDrawal(w);
        System.out.println(bc.balance);
    }
}
