package FactoryMethod;

import java.util.ArrayList;
import java.util.List;
//CREATOR
public class Azienda {
    public static Computer getSistLinux(){
        System.out.println("Crea un sistema operativo Linux: ");
        return new Computer(new Linux());
    }
    
    public static Computer getSistAndroid(){
        System.out.println("Crea un sistema operativo Android: ");
        return new Computer(new Android());
    }

    public static Computer getSistDos(){
        System.out.println("Crea un sistema operativo Dos: ");
        return new Computer(new Dos());
    }
    //Andando ad utilizzare una pool
    private static List<Computer> pool=new ArrayList<>();
    public static Computer getFromPool(){
        if(!pool.isEmpty())return pool.remove(0);
        return new Computer(new Android());
    }

    public static void relase(Computer t){
        pool.add(t);
    }
}
