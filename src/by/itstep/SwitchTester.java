package by.itstep;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args) {
        task1();
        task2();
        int num = 1;
        // switch (var) {body with case}
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not ONE and Two");


        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Input week day number: ");
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thirday");
                break;
            case 4:
                System.out.println("Четверг ");
                break;
            case 5:
                System.out.println("Пятинца");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("[From 1 to 7 ].Incorrect number of day!");
        }

    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input week day number: ");
        int monthNum = sc.nextInt();
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("[From 1 to 12 ].Incorrect number of Month!");


        }

    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input letter (single) : ");
        char ch= sc.next().charAt(0);
        int code = (int)ch;// получаем код символа .
        System.out.println(" Code is" + code);
        if (Character.isLetter(ch)){//((code >= 65 && code <= 90 )|| (code >= 97 && code <= 122)) {
            System.out.println("Letter");
            switch (ch){
                case 'a':
                case 'o':
                case 'y':
                case 'i':
                case 'u':
                case 'e':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("constant");
                    break;

            }
        }else{
            System.out.println("it is not letter");

        }
    }
}
