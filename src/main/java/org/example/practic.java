package org.example;
import java.util.Scanner;

public class practic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        int a = scanner.nextInt();
        System.out.print("Введите сторону b: ");
        int b = scanner.nextInt();
        System.out.print("Введите сторону c: ");
        int c = scanner.nextInt();

        int value = 0;

        if (a + b <= c || b + c <= a || c + a <= b) {
            value = 4; // "a, b и c не являются сторонами треугольника"
        } else if (a == b && b == c) {
            value = 3; // "a, b и c являются сторонами равностороннего треугольника"
        } else if (a == b || b == c || c == a) {
            value = 2; // "a, b и c являются сторонами равнобедренного треугольника"
        } else if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
            value = 1; // "a, b и c являются сторонами прямоугольного треугольника"
        } else {
            value = 5; // "a, b и c являются сторонами обычного треугольника"
        }

        switch (value) {
            case 1:
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
                break;
            case 2:
                System.out.println("a, b и c являются сторонами равнобедренного треугольника");
                break;
            case 3:
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
                break;
            case 4:
                System.out.println("a, b и c не являются сторонами треугольника");
                break;
            default:
                System.out.println("a, b и c являются сторонами обычного треугольника");
        }
    }
}
