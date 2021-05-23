package ru.main;

public class Calculator {
    private int a = 0;
    private int b = 0;

    public Calculator(int a, int b) {
        if (a < 1 || b < 1)
            throw new NumberFormatException("Числа должны быть больше 0!");
        if (a > 10 || b > 10)
            throw new NumberFormatException("Значения операндов не должны превышать 10!");
        this.a = a;
        this.b = b;
    }

    public int perform(char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new ArithmeticException("У калькулятора нет такой операции!");
        }
        return result;
    }
}