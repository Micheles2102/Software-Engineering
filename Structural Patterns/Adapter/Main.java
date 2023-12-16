package DesignPatternStrutturali.Adapter;
public class Main {
    public static void main(String[] args){
        Password password=new Password("nino", 1);
        Computer computerutente=new GeneratorePassword(password);
        computerutente.setPassword("Stellina");
        System.out.println(computerutente.getPassword());
    }

}
