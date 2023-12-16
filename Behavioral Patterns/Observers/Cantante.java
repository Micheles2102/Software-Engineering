package DesignPatternComportamentali.Observers;
import java.util.List;
import java.util.ArrayList;

public class Cantante {
    
    private List<Observer> obs=new ArrayList<>();
    private boolean canta=false;

    public void setCanta(Observer fan){
        canta=true;
        for(Observer o: obs) {
            if(o==fan){
            o.update(this.canta);}
            else{o.update(!this.canta);}
        }
    }
    public void abbonato(Observer o){
        obs.add(o);
    }

    public void annullaabbonamento(Observer o){
        obs.remove(o);
    }


}
