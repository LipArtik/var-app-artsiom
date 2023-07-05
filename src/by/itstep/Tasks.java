package by.itstep;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        System.out.println("Begin main.");
        System.out.println("Main method logic.");
        squareInfo();
        // run method ,
        System.out.println("Main END.");
    }

    public static void task1() {
        System.out.println("Begin method body");
        System.out.println("Logic is here...");
        System.out.println("End of method.");
    }

    public static void task2() {
        System.out.println("Task 2 Begin.");
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input B:");
        int b = sc.nextInt();
        System.out.println("Input C:");
        int c = sc.nextInt();
        System.out.println("Result: " + a + "*x*x + " + b + "*x + " + c + " =0");

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D is " + d);
        if (d > 0) {
            System.out.println("2 roots");
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 is" + x1);
            System.out.println("x2 is" + x2);

        } else if (d == 0) {
            System.out.println("single root");
            double x1;
            x1 = -b / (2 * a);
            System.out.println("x1 is" + x1);

        } else {
            System.out.println("no roots");
        }

    }

    public static void summa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number");

        int a = sc.nextInt();
        System.out.println("input second number");
        int b = sc.nextInt();
        System.out.println("input third number");
        int c = sc.nextInt();


        System.out.println(a + b + c);

    }

    public static void rectangleInfo() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        long s = a * b;
        long p = (a = b) * 2;

        System.out.println("S = " + s);
        System.out.println("P = " + p);
        // a&b
        //calculate s & p
        //is it square?
    }

    public static void squareInfo() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Input A:");
        int a = sc.nextInt();
        System.out.println("Input b:");
        int b = sc.nextInt();
        long s = a * b;
        long p = (a = b) * 2;
        if (a == b) {
            System.out.println("it is square");
        } else {
            System.out.println("it is not square");

        }

    }


    public static void runSomeTask(){

        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");



        Scanner sc = new Scanner(System.in);

        System.out.println("input menu");
        int num = sc.nextInt();
        if (num==1) {
            runSomeTask();
        }else if (num==2){
            rectangleInfo();
        }else if (num==2){
            task2();
        }else if (num==2){
            summa();
        }else if (num==2){
        }else if (num==2){



        }
    }
}

