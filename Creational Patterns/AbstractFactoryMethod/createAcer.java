//CONCRETE FACTORY
package AbstractFactoryMethod;
public class createAcer implements Computer {
    public Marchio getLogo(){//ABSTRACT PRODUCT
        return new Acer();//CONCRETE PRODUCT
    }
    public Processore getProcessore(){
        return new Ryzen();
    }
}
