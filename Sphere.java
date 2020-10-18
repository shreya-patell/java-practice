package com.company;

public class Sphere {
    private double diameter;    //instance data of the diameter

    public Sphere(double d) {
        diameter = d;   //constructor
    }
    //getters
    double getDiameter() {
        return diameter;  
    }
    double getVolume() {
        double radius = diameter / 2.0;
        double volume = (4 / 3) * Math.PI * radius * radius * radius; //volume = 4/3*Pi*r^3
        return volume;
    }
    double getSurface() {
        double radius = diameter / 2.0;
        double surface = 4.0 * Math.PI * radius * radius;   //SA = 4*Pi*r^2
        return surface;
    }
    //returns string description of the sphere
    @Override
    public String toString() {
        return "diameter = " + getDiameter() + " volume = " + getVolume() + " surface area = " + getSurface();
    }
}
    class MultiSphere {
        public static void main(String[] arg) {    // main method
            //instantiates 3 sphere objects with 3 possible diameters
            Sphere sphere1 = new Sphere(12.0);
            Sphere sphere2 = new Sphere(15.0);
            Sphere sphere3 = new Sphere(20.0);
            // outputs surface area and volume for respective diameter values
            System.out.println("Sphere 1: " + sphere1);
            System.out.println("Sphere 2: " + sphere2);
            System.out.println("Sphere 3: " + sphere3);
        }
    }