package ru.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите выражение:");

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String operation = in.next();
        String b = in.next();

        int aInt = 0;
        int bInt = 0;
        boolean aIsRoman = false, bIsRoman = false, isRoman = false;
        try {
            aInt = Integer.parseInt(a);
        } catch (NumberFormatException ex) {
            aIsRoman = true;
        }
        try {
            bInt = Integer.parseInt(b);
        } catch (NumberFormatException ex) {
            bIsRoman = true;
        }

        if (aIsRoman && bIsRoman) {
            isRoman = true;
        } else if (aIsRoman != bIsRoman) {
            throw new NumberFormatException("Числа должны быть в одной системе счисления!");
        }

        if (isRoman) {
            aInt = Numbers.toArabic(a);
            bInt = Numbers.toArabic(b);
        }

        Calculator calculator = new Calculator(aInt, bInt);
        int result = calculator.perform(operation.charAt(0));

        if (isRoman) {
            System.out.println("Результат выражения: " + Numbers.toRoman(result));
        } else {
            System.out.println("Результат выражения: " + result);
        }
    }
}
