package FactoryMethod;

public class Dos implements SistemaOperativo {
    @Override
    public String crea(){
        String x=("è stato creato il sistema operativo Dos");
        return x;
    }  
    @Override
    public String modifica(String word){
        String x=("Il sistema operativo è cambiato da Dos a "+ word);
        return x;
    }  
}
