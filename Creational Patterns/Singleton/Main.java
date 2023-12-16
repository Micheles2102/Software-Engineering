package Singleton;

public class Main {
    public static void main(String[] args){
        Computer computer= Computer.getIstance();
        Computer computer2=Computer.getIstance();
        System.out.println(computer.getNomeComputer());
        computer.setnomeComputer("Apple");
        System.out.println(computer2.getNomeComputer());
    }
}

