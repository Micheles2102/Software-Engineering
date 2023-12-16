package DesignPatternStrutturali.Decorator;

public class SchedaVideo extends Pezzi {
    public SchedaVideo(Computer computer){
        super(computer);
    }
    
    public int getCosto(){
        System.out.println("sono dentro ShedaVideo,costo"+ computer.getCosto());
        return (computer.getCosto()+300);
    }

    public String getDescription(){
        return(computer.getDescription()+" Scheda Video Alta Definizione");
    }
}
