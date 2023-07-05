package by.itstep.oop.casting;

public class ShapesTester {


    public static void shapeTest(Shape shape) {
        shape.calculateP();
        shape.calculateS();
        shape.print();
        shape.showInfo();

    }


    public static void main(String[] args) {
        Triangle t1 = new Triangle(11, 9, 6);
        t1.setColor("red");
        t1.calculateP();
        t1.calculateS();
        t1.print();
        t1.showInfo();
        Rectangle rec1 = new Rectangle(4, 13);
        Rectangle re2 = new Rectangle(4, 13);
        rec1.calculateP();
        rec1.calculateS();
        rec1.showInfo();
        rec1.print();

        // casting - приведение типов
        // casting (приведение типов) не меняет состояние типов


        //Upcasting-когда мы конкретный объект рассматриваем обобщенной ссылкой родительского класса

        Shape sh1 = new Triangle(3, 7, 6);

        //явный кастинг (<Super Type>) instance
        Shape sh2 = (Shape) new Rectangle(54);

        // up casting - позволяет расматривать конкретные экз ,под видом общихс ссылок ,тем самым этот функционал более конкретного класаа становится недоступнымsh


        Shape sh3 = new Triangle(5, 7, 11);
        //Down casting-это процесс  когда мы из общего экземпляра в более конкретный
        Triangle tr2 = (Triangle) sh3;// всегда в явной форме
        tr2.setC(9);
        Rectangle rectangle = new Rectangle(7);
        Triangle triangle = new Triangle(4, 5, 8);
        shapeTest(rectangle);
        shapeTest(triangle);

    }
}
