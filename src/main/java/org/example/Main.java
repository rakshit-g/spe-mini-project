package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main obj= new Main();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = scanner.nextInt();
        System.out.println(obj.factorial(n));
    }
    public int factorial(int n){
        int res =1;
        for(int i=1;i<=n;i++){
            res = res*i;
        }
        return res;
    }
}