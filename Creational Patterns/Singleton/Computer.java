package Singleton;

public class Computer {
    private String nomeComputer;
    private static Computer computer=new Computer();
    private Computer(){
        this.nomeComputer="Acer";
    }

    public static Computer getIstance(){
        if(computer==null)return new Computer();
        return computer;
    }

    public String getNomeComputer(){
        return nomeComputer;
    }

    public void setnomeComputer(String nomecomputer){
        this.nomeComputer=nomecomputer;
    }
}
