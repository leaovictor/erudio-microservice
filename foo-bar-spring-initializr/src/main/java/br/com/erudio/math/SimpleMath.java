package br.com.erudio.math;

public class SimpleMath {
    public Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double division(Double firtNumber, Double secondNumber) {
        return firtNumber / secondNumber;
    }

    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double squareRoot(Double number) {
        return (Double) Math.sqrt(number);
    }

    public Double mean(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber / 2;
    }
}
