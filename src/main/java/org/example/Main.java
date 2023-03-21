package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main obj= new Main();

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 for factorial function, 2 for Square root function, 3 for logarithm function or 4 for power function:");
            int inp = scanner.nextInt();

            switch(inp) {
                case 1:
                    System.out.print("(Factorial Function) Enter a number : ");
                    double n1 = scanner.nextDouble();
                    System.out.println("Factorial of "+n1+" is : " + obj.factorial(n1));
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("(FSquareRoot Function) Enter a number : ");
                    double n2 = scanner.nextDouble();
                    System.out.println("Square root of "+n2+" is : " + obj.SquareRoot(n2);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("(log Function) Enter a number : ");
                    double n3 = scanner.nextDouble();
                    System.out.println("Natural Log of "+n3+" is : " + obj.log(n3));
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.print("(Power Function) Enter a number1 : ");
                    double n4 = scanner.nextDouble();
                    System.out.print("(Power Function) Enter a number2 : ");
                    double n5 = scanner.nextDouble();
                    System.out.println(n4+ " raised to power "+n5+" is : " + obj.power(n4, n5));
                    System.out.println("\n");
                    break;
            }
        }
    }
    public double factorial(double n){
        double res =1;
        for(double i=1;i<=n;i++){
            res = res*i;
        }
        return res;
    }
    public double SquareRoot(double n){
        double res = Math.sqrt(n);
        return res;

    }

    public double log(double n){
        return Math.log(n);
    }

    public double power(double n1, double n2){
        return Math.pow(n1,n2);
    }
}