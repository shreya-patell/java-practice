package com.company;

//implementing the comparable interface
public class RationalNumber implements Comparable<RationalNumber> {
    private int numerator, denominator;

    public RationalNumber(int numer, int denom) {
        if (denom == 0)
            denom = 1;
        if (denom < 0) {
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;
        reduce();
    }

    //returns numerator of this rational number
    public int getNumerator() {
        return numerator;
    }

    //returns denominator of this rational number
    public int getDenominator() {
        return denominator;
    }

    //returns the reciprocal of this rational number
    public RationalNumber reciprocal() {
        return new RationalNumber(denominator, numerator);
    }

    // Adds this rational number to the one passed as a parameter.
// A common denominator is found by multiplying the individual denominators
    public RationalNumber add(RationalNumber op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;
        return new RationalNumber(sum, commonDenominator);
    }

    //Subtracts the rational number passed as a parameter from this rational number.
    public RationalNumber subtract(RationalNumber op2) {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;
        return new RationalNumber(difference, commonDenominator);
    }

    // Multiplies this rational number by the one passed as a parameter.
    public RationalNumber multiply(RationalNumber op2) {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();
        return new RationalNumber(numer, denom);
    }

    //Divides this rational number by the one passed as a parameter
// by multiplying by the reciprocal of the second rational.
    public RationalNumber divide(RationalNumber op2) {
        return multiply(op2.reciprocal());
    }

    // Determines if this rational number is equal to the one passed
// as a parameter. Assumes they are both reduced.
    public boolean isLike(RationalNumber op2) {
        return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
    }

    //Returns this rational number as a string.
    public String toString() {
        String result;
        if (numerator == 0)
            result = "0";
        else if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;
        return result;
    }

    //Reduces this rational number by dividing both the numerator
//and the denominator by their greatest common divisor.
    private void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);
            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    // Computes and returns the greatest common divisor of the two
// positive parameters. Uses Euclid's algorithm.
    private int gcd(int num1, int num2) {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        return num1;
    }

    @Override
    public int compareTo(RationalNumber obj) {
        float n1 = numerator / denominator; //current object
        float n2 = obj.numerator / obj.denominator; //passed object
        float n = n2 - n1;                  //gets the difference
        if (n <= 0.0001)
            return 0;                       //if the number is the practically the same, it will return 0
        else if (n > 0.0001)
            return 1;                       //if the number has a tolerance value of more than 0.0001, it will return 1
        else
            return -1;
    }
}
