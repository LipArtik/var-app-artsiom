package by.itstep.oop.inh.task;

public class VIPClient extends Client{
    private String functions;

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions;
    }
    public VIPClient(){
       // super (0,null,null,null,null,null,"VIP"); так правильнее было ...
        this.setRole("VIP");

    }
}
