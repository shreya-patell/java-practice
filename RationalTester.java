package com.company;

public class RationalTester {

        public static void main(String[] args) {
            RationalNumber r1 = new RationalNumber(2,4);
            RationalNumber r2 = new RationalNumber(1,2);
            System.out.println(r1.compareTo(r2)); //compares the 2 numbers using the comparable interface
            System.out.println("Rational Number 1: " + r1);
            System.out.println("Rational Number 2: " + r2);
            if (r1.isLike(r2)){
                System.out.println("Both Rational Numbers ARE equal");
            }
            else
            System.out.println("Both Rational Numbers are NOT equal");
        }

    }
