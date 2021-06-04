package _20190245;


import java.util.Scanner;

public class Test{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        char operator;
        double result;
        System.out.println("Enter first number:");
        num1=input.nextInt();
        System.out.println("Enter second number:");
        num2=input.nextInt();
        System.out.println("Enter operator:");
        operator=input.next().charAt(0);
        switch (operator)
        {
            case'+':
                result=num1+num2;
                break;
            case'-':
                result=num1-num2;
                break;
            case'/':
                result=num1/num2;
                break;
            case'*':
                result=num1*num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        System.out.println("Result=" + result);
    }

}