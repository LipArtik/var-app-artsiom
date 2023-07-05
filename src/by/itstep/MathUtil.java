package by.itstep;

public class MathUtil {
    /**
     * Returns a integer value  with a positive sign, greater than or equal than Max Bound.
     *
     * @param maxBound
     * @returna pseudorandom integer from 0 to maxBound inclusive .
     */
    public static int genRandom(int maxBound) { // 100=> should be from 0 to 100[]
        int x = (int) (Math.random() * (maxBound + 1));
        return x;
    }

    public static int genRandom(int minBound, int maxBound) {
        //20,50
        //TODO: case when maxBound less then minBound
        int x = (int) (Math.random() * (maxBound - minBound + 1)) + minBound;
        return x;
    }

    public static int genRandom() {
        return genRandom(10);
    }


    public static void varTester(double val) {
        double d;
        d = val;
        System.out.println(d);
        d = d + d;
        System.out.println(d);
    }

    public static void forTester(int num, double val, boolean flag) {
        System.out.println("for Tester begin...");
        for (int i = 0; i < num; i++) {
            if (flag) {
                System.out.print("Value is :" + (val += val) + "  ");
            } else {
                System.out.println("Value is" + (val += val));
            }

            System.out.println("For tester end");

        }


        System.out.println("for Tester end...");
    }

    public static void main(String[] args) {
        System.out.println("Main starter");
//        varTester(5.55);
//        forTester(5, 10, true);
//        int val= genRandom(10);
//        System.out.println(val);
//        System.out.println("Main end.");
//        int val2=genRandom(100,200);
//        System.out.println(val2);
//    int x=genRandom();
//        System.out.println(x);
        int[] result = ArraysUtil.genRandomArray(20);
        ArraysUtil.printArray(result, true);
        int max = ArraysUtil.findMax(result);
        System.out.println("Max is "+ max);


    }


}
