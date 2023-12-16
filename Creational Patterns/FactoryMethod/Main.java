package FactoryMethod;

public class Main {
    public static void main(String[] args){
        Computer cp1 = Azienda.getSistAndroid();//Crea un sistema operativo Android:è stato creato il sistema operativo Android
        Azienda.relase(cp1);
        cp1.getSistema();
        System.out.println("------");
        Computer cp2 = Azienda.getSistDos();//Crea un sistema operativo Dos:è stato creato il sistema operativo Dos
        Azienda.relase(cp2);
        cp2.getSistema();
        System.out.println("------");
        Computer cp3 = Azienda.getSistLinux();//Crea un sistema operativo Linux:è stato creato il sistema operativo Linux
        Azienda.relase(cp3);
        cp3.getSistema();
        System.out.println("------");
        Computer cp4=Azienda.getFromPool();//è stato creato il sistema operativo Android
        cp4.getSistema();
        cp4.modificaSistema("Dos");//Il sistema operativo è cambiato da Android a Dos
        Azienda.relase(cp4);
        System.out.println("------");
        cp1.getSistema();
        cp2.getSistema();
        cp3.getSistema();//è stato creato il sistema operativo Linux
        //dunque cp4 non lavora come reference ma crea un nuovo oggetto con le stesse cose del oggetto nella pool
    }
}
