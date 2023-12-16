package AbstractFactoryMethod;
public class Intel implements Processore {//ABSTRACT PRODUCT(PROCESSORE) CHE DIVENTA IL CONCRETE PRODUCT(INTEL)
    public void CPU(){
        System.out.println("Il processore è un intel, complimenti ottima scelta!");
    }
}
