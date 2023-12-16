package DesignPatternStrutturali.Decorator;

public class Processore extends Pezzi {
    public Processore(Computer computer){
        super(computer);
    }
    
    public int getCosto(){
        System.out.println("sono dentro processore,costo "+ computer.getCosto());
        return (computer.getCosto()+150);
    }

    public String getDescription(){
        return(computer.getDescription()+" Processore multicore");
    }
}
