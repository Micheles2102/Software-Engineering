package DesignPatternComportamentali.Observers;

public class Main {
    public static void main(String[] args){
        Cantante cantante=new Cantante();
        Observer fanMadonna1=new FanMadonna();
        Observer fangemitaiz=new gemitaiz();
        cantante.abbonato(fanMadonna1);
        cantante.abbonato(fangemitaiz);
        cantante.setCanta(fanMadonna1);
    }
}
