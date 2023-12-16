package DecoratorProvaù;

public class Ham implements Panino{
    public double getCosto(){
        return 4.5;
    }    

    public String getDescription(){
        return "Hai selezionato come panino un Ham.";
    }
}
