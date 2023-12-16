package DesignPatternStrutturali.ChainOfResponsability;

public interface Kernel {
    void setNextKernel(Kernel kernel);
    void operation(String operation); 
}
