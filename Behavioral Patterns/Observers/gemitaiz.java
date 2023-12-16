package DesignPatternComportamentali.Observers;
public class gemitaiz implements Observer {
    @Override
    public void update(boolean statocantante){
        if(!statocantante)
            System.out.println("Gemitaiz non è al momento al conerto");
        System.out.println("Gemitaiz è presente all'interno del concerto");

    }
}
