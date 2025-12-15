/*
   PerformOperation
     This program performs basic arithmetic operations based on user input.
     It takes two integers and an operator as input and outputs the result.
    example:
     Enter number1:
     10
     Enter number2:
     5
     Enter Operation:
     +
     Output:
     15
 */
import java.util.*;

public class PerformOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Operation: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            case '%':
                System.out.println(n1 % n2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
