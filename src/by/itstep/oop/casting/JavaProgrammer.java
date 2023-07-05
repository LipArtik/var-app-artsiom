package by.itstep.oop.casting;

public abstract class JavaProgrammer {

    abstract void makeCode();

    public void playTennis() {
        System.out.println("playing tennis...");
    }

}

class MiddleJavaDeveloper extends JavaProgrammer {
    @Override
    void makeCode() {
        System.out.println("Write some code");
        playTennis();
    }
}

class SeniorJavaDeveloper extends JavaProgrammer {
    @Override
    void makeCode() {
        System.out.println("Write some perfect code");
        playTennis();
    }

    void leaveOffice() {
        System.out.println("Left office");
    }
}

    class juniorJavaDeveloper extends JavaProgrammer {
        @Override
        void makeCode() {
            System.out.println("Write some bad code");


        }
        void learn(){
            System.out.println("learning");
        }
    }

class Company{
    public static void main(String[] args) {
        juniorJavaDeveloper junior = new juniorJavaDeveloper();
        JavaProgrammer programmer = (JavaProgrammer) junior; // upcasting

        Object o = (Object)new SeniorJavaDeveloper();
        Object o2 =(Object)(JavaProgrammer)new MiddleJavaDeveloper();

        JavaProgrammer jp = new juniorJavaDeveloper(); // new SeniorJavaDeveloper();

        if(jp instanceof SeniorJavaDeveloper){
            SeniorJavaDeveloper sjd = (SeniorJavaDeveloper)jp;
            sjd.leaveOffice();
        } else if(jp.getClass() == juniorJavaDeveloper.class){
            juniorJavaDeveloper jun = (juniorJavaDeveloper)jp;
            jun.learn();
        }
        //
        JavaProgrammer[] programmers={junior,(JavaProgrammer) o,(JavaProgrammer) o2,jp};
        System.out.println("programmers"+programmers.length);
        for(JavaProgrammer prog: programmers){
            prog.makeCode();
        }










    }
}


