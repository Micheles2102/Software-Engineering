package FactoryMethod;

public class Linux implements SistemaOperativo{
    @Override
    public String crea(){
       String x=("è stato creato il sistema operativo Linux");
       return x;
    }
    @Override
    public String modifica(String word){
        String x=("Il sistema operativo è cambiato da Linux a "+ word);
        return x;
    }  
}
