package com.company;

 abstract class Shape {

     String shapeName;

     public Shape(String shapeName) {
         this.shapeName = shapeName;
     }

     public abstract double area(); //abstract method declaration.

     @Override
     public String toString(){ //method for returning the name of the shape.
         return shapeName;
     }
 }

