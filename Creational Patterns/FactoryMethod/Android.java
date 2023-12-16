package FactoryMethod;

public class Android implements SistemaOperativo{
    @Override
    public String crea(){
       String x=("è stato creato il sistema operativo Android");
       return x;
    }  
    @Override
    public String modifica(String word){
        String x=("Il sistema operativo è cambiato da Android a "+ word);
        return x;
    }  
}
