package by.itstep.oop.inh;

public class Student extends Person {
    private double avg;
    private String havchik;

    public String getHavchik() {
        return havchik;
    }

    public void setHavchik(String havchik) {
        this.havchik = havchik;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", gender=" + getGender() +
                ",salary=" + avg +havchik+
                '}';
    }
    public Student(int id,String name,String lastname, char gender, double avg,String havchik){

    }

    public Student(int id ,String name , String lastname , char gender , double avg) {
        super (id,name ,lastname,gender);
        this.avg=avg;
    }
}
