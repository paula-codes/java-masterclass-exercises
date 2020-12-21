package com.paula;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real2, double imaginary2){
       real = real + real2;
       imaginary = imaginary + imaginary2;
    }

    public void add(ComplexNumber complexNumber2){
        real = real + complexNumber2.getReal();
        imaginary = imaginary + complexNumber2.getImaginary();
    }

    public void subtract(double real2, double imaginary2){
        real = real - real2;
        imaginary = imaginary - imaginary2;
    }

    public void subtract(ComplexNumber complexNumber2){
        real = real - complexNumber2.getReal();
        imaginary = imaginary - complexNumber2.getImaginary();
    }




}
