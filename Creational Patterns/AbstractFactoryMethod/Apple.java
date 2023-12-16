package AbstractFactoryMethod;
public class Apple  implements Marchio{//ABSTRACT PRODUCT(MARCHIO) IMPLEMENTATO DIVENTA CONCRETE PRODUCT(APPLE)
    public void getMarchio(){
        System.out.println("Il computer creato è del marchio Apple, complimenti per la scelta!");
    }
}
