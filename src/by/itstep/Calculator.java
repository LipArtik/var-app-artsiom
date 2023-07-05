package by.itstep;

import java.util.Scanner;

public class Calculator {

    public static void printSumma(int a, int b) {
        System.out.println("S = " + (a + b));

    }


    public static void printSumma1(int a, int b) {

        System.out.println("Result = " + (a * b));
    }

    public static void printSumma3x(int a) {

        System.out.println("Result = " + (a * 2));
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int summa(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Summa");
        System.out.println("2.Multiplication");
        System.out.println("3.Div");
        System.out.println("4.Square");
        System.out.println("5.Pif");
        int methodNumber = sc.nextInt();
        switch (methodNumber) {
            case 1: {
                System.out.println("Input A : ");
                int a = sc.nextInt();
                System.out.println("Input B :");
                int b = sc.nextInt();
                int r = summa(a, b);
                System.out.println("Result is" + r);
                break;

            }
            case 2: {
                System.out.println("Input A : ");
                int a = sc.nextInt();
                System.out.println("input B : ");
                int b = sc.nextInt();
                int r = mult(a, b);
                System.out.println("Result is = ");
                break;
            }
            case 3: {
                System.out.println("Input A : ");
                double a = sc.nextInt();
                System.out.println("input B : ");
                double b = sc.nextInt();
                double r = div(a, b);
                System.out.println("Result is = ");
                break;
            }
            case 4: {
                System.out.println("input number: ");
                int a = sc.nextInt();
                double r = squareRoot(a);
                System.out.println("Result is =  " + r);
                break;
            }
            default: {
                System.out.println("Not such menu ");
                menu();
            }
        }
        System.out.println("1 - Повторить ");
        System.out.println("2 - Закончить ");
        int methodNumber1 = sc.nextInt();
        switch (methodNumber1) {
            case 1: {
                menu();
            }
            case 2: {
                break;
            }

        }


    }


    // Client
    public static void main(String[] args) {
        printSumma(10, 10);
        int s = summa(10, 20);
        System.out.println(s);
        int r = sub(200, -200);
        System.out.println("S result is " + r);
        int c = mult(3, 5);
        System.out.println("Result = " + c);
        double n = div(5, 1);
        System.out.println("res = " + n);
        System.out.println(sub(sub(2, 2), summa(4, 4)));
        System.out.println(squareRoot(9));
        System.out.println("pif = " + pif(3, 4));

        menu();
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by Zero ");
        }
        return a / b;

    }

    public static int mult(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int squareRoot(double base) {
        int result = (int) Math.sqrt(base);
        return result;
    }

    public static int speedTest(int v, int t) {
        return v * t;
    }

    public static int pif(int a, int b) {
        int c = squareRoot((Math.pow(a, 2) + Math.pow(b, 2)));
        return c;
    }

    public static void randomMethod(int times) {
        if (times < 1) {
            System.out.println("Wrong times number ");

        } else {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < times; i++) {
                int mNum = (int) (Math.random() * 4) + 1;

            }
        }

    }

}







