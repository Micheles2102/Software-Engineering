package DecoratorProvaù;

public abstract class Condimenti implements Panino {
    protected Panino panino;
    public Condimenti(Panino panino){
        this.panino=panino;
    }

    public double getCosto(){
        return panino.getCosto();
    }

    public String getDescription(){
        return panino.getDescription();
    }
}
