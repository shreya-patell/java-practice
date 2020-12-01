package com.company;

public class Commission extends Hourly {
    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
                      double commRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commRate;
    }
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    public double pay(){
        double payment = super.pay() + totalSales*commissionRate;
        return payment;

    }public String toString(){
        return super.toString() + ", with a commission rate of " + commissionRate;
    }
}

