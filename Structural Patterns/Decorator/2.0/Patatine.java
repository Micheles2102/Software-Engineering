package DecoratorProvaù;

public class Patatine extends Condimenti{
    public Patatine(Panino panino){
        super(panino);
    }

    public double getCosto(){
        return (panino.getCosto()+1.5);
    }

    public String getDescription(){
        return (panino.getDescription()+" e sono state aggiunte le patatine.");
    }
}
