package by.itstep.swing.films;

public class Actor {

    private long id;
    public long getId() {
        return id;
    }

    public Actor(String name){
        this.name=name;
    }

    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
      //  return id + " : "+name;
        return name;
    }
    //TODO
}
