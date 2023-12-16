package DesignPatternStrutturali.Decorator;

public class Client {
    public static void main(String[] args) {
        Computer computer=new Mac();
        System.out.println("holllaaaaaaaaaaa");
        computer=new Processore(new SchedaVideo(computer));//M->S->M
        System.out.println(computer.getCosto());
        System.out.println(computer.getDescription());        
    }
}
