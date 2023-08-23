package ru.notology;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(1, 5));
        System.out.println(calc.mult(6, 3));
        System.out.println(calc.pow(2, 3));
    }
}