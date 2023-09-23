package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println("Сумма чисел : " + calc.sum(3, 7));
        System.out.println("Произведения чисел : " + calc.mult(2, 6));
        System.out.println("Степень : " + calc.pow(2, 5));
    }
}