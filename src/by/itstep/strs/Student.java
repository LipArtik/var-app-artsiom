package by.itstep.strs;

public class Student {
    private int id ;
    private String name;
    private String Lastname;
    private int courseNum;
    private double avg;


    public Student(){

    }
    public Student(int id, String name, String lastname, int courseNum, double avg) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.courseNum = courseNum;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
