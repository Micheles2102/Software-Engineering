//CONCRETE FACTORY
package AbstractFactoryMethod;
public class createApple implements Computer {
    public Marchio getLogo(){//ABSTRACT PRODUCT->INTERFACE
        return new Apple();//CONCERETE PRODUCT->IMPLEMENTAZIONE DELL'INTERFACE
    }
    public Processore getProcessore(){
        return new Intel();
    }
}
