package DesignPatternStrutturali.Decorator;

public  class Mac implements Computer{
    public int getCosto(){
        System.out.println("Sono dentro Mac costo 1900");
        return 1900;
    }

    public String getDescription(){
        return "Computer Mac";
    }
} 
