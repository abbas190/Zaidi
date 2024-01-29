package com.abbas;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
        public static int ans(int n){
            return fibonacci(n + 2) - 1;
        }
    }
