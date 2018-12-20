package com.company;

public class Main {

//    Write a program that takes three integer command-line arguments and prints
//    equal if all three are equal, and not equal otherwise.

    public static void main(String[] args) {
        // write your code here
        int a = 5;
        int b = 5;
        int c = 5;
        isEqual(a, b, c);
    }

    public static void isEqual(int a, int b, int c) {
        if(a == b && b == c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
