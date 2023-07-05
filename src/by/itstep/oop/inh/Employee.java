package by.itstep.oop.inh;

public class Employee extends Person {
    private long salary;

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(){
//прежде всего запускается конструктор родительского класса (либо базового )..Дабы обеспечить иницилизацию

        // явный вызов родительского класса (супер конструктора) если это не написать ,вызов пройдет неявно
        super();
    }

    public Employee(int id,String name , String lastname){
//вызов супер конуструктора с параметрами (причем конструктор должен существоать )
        super (id,name);
        this.setLastname(lastname);

    }
    public Employee(int id,String name , String lastname, char gender,long salary){
        super (id,name,lastname,gender);
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", gender=" + getGender() +
                ",salary=" + salary +
                '}';
    }
}
