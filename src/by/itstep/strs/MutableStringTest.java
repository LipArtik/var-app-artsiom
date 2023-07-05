package by.itstep.strs;

public class MutableStringTest {
    public static void main(String[] args) {
        StringBuffer sBuff;


        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        String str = null;
        sBuild.append(str);
        sBuild.append(123).append("x").append("World");
        System.out.println(sBuild.toString());

        StringBuilder sBuild2 = new StringBuilder(128);
        sBuild.append("Hello World");
        sBuild.append("Hello World");
        sBuild.append("Hello World");
        System.out.println(sBuild);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild.append(sBuild2));
        System.out.println(sBuild3);
        System.out.println(sBuild4);

        System.out.println(sBuild4.reverse());
        System.out.println("capasity" + sBuild4.capacity());
        System.out.println("length:" + sBuild4.length());
        System.out.println("fREE:" + sBuild4.capacity() + sBuild4.length());

        String words[] = sBuild.toString().split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        HTMLTableBuilder htmlTable = new HTMLTableBuilder();
        htmlTable.addHeaders("ID", "Name", "AVG");
        System.out.println(htmlTable.build());


    }
}
