/*
Write a program that demonstrates inheritance and constructor usage.

Create a base class A that stores an integer value x.

Initialize x using a constructor.

Create a derived class B that:

Inherits class A

Calls the parent constructor using super

Modifies the value of x by multiplying it by 2

Prints the updated value of x

Take input from the user and create an object of class B.

Example:
Input: 5
Output: 10
 */
import java.util.*;

class A {

    int x;

    public A(int x) {
        this.x = x;
    }
}

class B extends A {

    public B(int x) {
        super(x);
        this.x = x * 2;
        System.out.println(this.x);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
        B b = new B(x);
    }
}
