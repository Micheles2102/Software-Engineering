package DesignPatternComportamentali.Observers;
//CONCRETE OBJECT

public class FanMadonna implements Observer {
    
    @Override
    public void update(boolean statocantante){
        if(!statocantante)
            System.out.println("Madonna non è al momento al conerto");
        System.out.println("Madonna è presente all'interno del concerto");

    }
}
