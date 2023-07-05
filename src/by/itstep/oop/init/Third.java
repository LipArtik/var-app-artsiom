package by.itstep.oop.init;

public class Third extends Child {

        private int p;
        private static int pStatic;

        static {

            System.out.println("Third static block start");
            System.out.println(pStatic);
            pStatic = 123;
            System.out.println(pStatic);
            System.out.println(" Third  static block end");
        }

        {

            System.out.println("Third non- static block start");
            System.out.println(p);
            p = 123;
            System.out.println(p);
            System.out.println("Third static block end");
        }

        public Third() {
            System.out.println("Third constructor begin");
            p = 321;
            System.out.println(p);

            System.out.println("Parent constructor end");
        }

        public int getP() {
            return p;
        }

        public static int getpStatic() {
            return pStatic;
        }

        public void setP(int p) {
            this.p = p;
        }

        public static void setpStatic(int pStatic) {
          Third.pStatic = pStatic;
        }
    }


