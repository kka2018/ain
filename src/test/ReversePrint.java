package test;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        System.out.println();
        reversePrint(n);
        sc.close();
    }

    public static void reversePrint(int n){
        if(n==0)
            return;
        else{
            System.out.print(n + " ");
            reversePrint(n-1);
        }
    }

    public static void print(int n){
        if(n==0)
            return;
        else{
            print(n-1);
            System.out.print(n + " ");
        }
    }
}
