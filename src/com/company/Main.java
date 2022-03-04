package com.company;

import java.util.Scanner;

public class Main {

    static void addition(double num1,double num2){
        System.out.println("Answer is " +(num1+num2));
    }

    static void substraction(double num1,double num2){
        System.out.println("Answer is " +(num1-num2));
    }

    static void multiply(double num1,double num2){
        System.out.println("Answer is " +(num1*num2));
    }

    static void divide(double num1,double num2){
        System.out.println("Answer is " +(num1/num2));
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?\n\nPress num 1 for sum\nPress num 2 for diff\nPress num 3 for multi\nPress num 4 for divide ");
        System.out.println("Press your option :"  );

        int operator = scanner.nextInt();

        System.out.println("Enter the number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the number 2 : ");
        double num2 = scanner.nextDouble();

        switch (operator){
            case 1:
                addition(num1,num2);
                break;
            case 2:
                substraction(num1,num2);
                break;
            case 3:
                multiply(num1,num2);
                break;
            case 4:
                divide(num1,num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
