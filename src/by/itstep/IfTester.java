package by.itstep;

public class IfTester {
    public static void main(String[] args) {
        System.out.println("Begin");
        int t = -30;
        //if(<condition>) {<body>}, where condition can be TRUE or FAlSE!
        // if condition is true -> BODY
        if (t > 20) {
            System.out.println("Майка");
        }
        if (t < -15 ) {
            System.out.println("Шуба");
        }

       int m1=8, m2= 8, m3=9 , m4=10 , m5=10;
        double avg = (m1 + m2 +m3 +m4 +m5) / 5.0;
        System.out.println("AVG=" + avg);

        if (avg >=9 ) {
            System.out.println("=)");
        } else if(avg >= 6){
            System.out.println(":|");
        } else {
            System.out.println("=(");
        }

        int a = 7, b = 5 ,c = 3;
        if((a + b) <= c){
            System.out.println("Invalid triangle");
        } else if((a + c) <= b){
            System.out.println("Invalid triangle");
        }  else if((b + c) <= a) {
            System.out.println("Invalid triangle");
        } else {
            System.out.println("Correct triangle");
        }

        int n1=3 , n2=5 ;
        if(n1>n2){
            System.out.println("n1>n2");
        }else if (n1<n2){
            System.out.println("n1<n2");
        } else  {
            System.out.println("n1=n2");
        }
        int s1=1, s2=2,s3=3;
        if (s1<s2){
            System.out.println("min");
        }


        System.out.println("End.");
    }







    }

