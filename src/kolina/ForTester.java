package kolina;

public class ForTester {
    public static void task1(){
        for (int i= 0; i<2000; i = i +2){
            System.out.print(i + " " );
        }
        System.out.println();
    }
    public static void task2() {
        for (int a = 1; a < 1000; a = a + 2) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
// 10 20 30 40 50 (50 times )
    public static void task3() {
        for (int i = 0, number =10; i < 50; i ++) {
            System.out.print(number + " ");
            number = number +10;
        }
        System.out.println();
    }
    public static void task4() {
        for (int i = -1, number =-1; i < 100; i ++) {
            System.out.print(number + " ");
            number = number -1;
        }
        System.out.println();
    }
    // -1 2 -3 4 -5 (100 times)
    public static void task5() {
        for (int i = 0, number =-1; i < 100; i ++) {
            if (number % 2==0) {//четное число если(для всех четных чисел)
                System.out.print(((-1) * number) + " ");
            }else {
                System.out.print(number + " ");
            }
            number -- ;
        }
        System.out.println();
    }

// random 0 -10 (25 times)
    public static void task6() {
        for ( int i=0 , x;i <25;i++ ){
            x =(int) (Math.random()*11);
            System.out.print(x + " ");
            System.out.println(  );

        }
    }


// таблица умножения
public static void task7() {
    for (int a=2; a<=9;a++){
        for (int b = 2;  b<= 10; b ++) {
            int result = a*b;
            System.out.println(a+ " X " + b +" = " + result);
        }
    }

    System.out.println("********");


    }
    public static void task8(){
        for (int num= 1; num<9; num ++){
            int studentNumber= ((int) (Math.random()*12))+1;
            System.out.println(studentNumber);

        }
    }








    public static void main(String[] args) {
        //       0         1          3           2
        // for (<var>;<condition>;<iteration>) {<body>)
        // <var> - выполняется всего единожды;
        //<condition> - true/false ;
        //<iteration> выполняется каждый раз перед  проверкой <condition> ;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        for (; true; ) {
//            System.out.println("Inside for");
//            int x = (int) (Math.random() * 10);
//            if (x == 5)
//                break;//безоговорочный выход из цикла
//        }
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

        // %
        int number = 3;
        int number2 =2;
        int result = number % number2;
        System.out.println(result);


    }

}
