package com.Hillel;

import java.util.Scanner;

public class Main {
    private Multiply mClass;

    public static void main(String arg [])
    {
        System.out.println("Input any number:");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        System.out.println("You input next number:" + a);

        System.out.println("Input next number:");
        double b = scan.nextDouble();
        System.out.println("You input next number:" + b);

        System.out.println("Input any action: Multiply *; Divide /; Minus -; Plus +; ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();

        System.out.println(operation);

       double resultat = 0;
       if (operation.equalsIgnoreCase("*"))
       {
           Multiply mClass = new Multiply();
           resultat =  mClass.execution(a, b);
       }

        if (operation.equalsIgnoreCase("+")) {
            Plus pClass = new Plus();
            resultat = pClass.execution(a, b);
        }

        if (operation.equalsIgnoreCase("-"))
        {
            Minus mClass = new Minus();
            resultat =  mClass.execution(a, b);
        }

        if (operation.equalsIgnoreCase("/")) {
            Divide divideClass = new Divide();
            resultat = divideClass.execution(a, b);
        }



        System.out.println("Your result is:" + resultat);
    }
}



