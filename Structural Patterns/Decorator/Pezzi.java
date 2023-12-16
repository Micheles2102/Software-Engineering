package DesignPatternStrutturali.Decorator;

public abstract class Pezzi implements Computer{
    protected Computer computer;

    public Pezzi(Computer computer){
        this.computer=computer;
    }

    public int getCosto(){
        System.out.println("sono dentro Pezzi");
        return  computer.getCosto();
    }

    public String getDescription(){
        return computer.getDescription();
    }
}
