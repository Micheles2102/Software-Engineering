
package DecoratorProvaù;

public class Cetrioli extends Condimenti{
    public Cetrioli(Panino panino){
        super(panino);
    }

    public double getCosto(){
        return (panino.getCosto()+0.5);
    }

    public String getDescription(){
        return (panino.getDescription()+" Sono stati aggiunti i Cetrioli ");
    }
}