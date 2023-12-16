package DesignPatternStrutturali.ChainOfResponsability;

public class CpuB implements Kernel{
    private Kernel nextKernel;

    public void setNextKernel(Kernel kernel){
        this.nextKernel=kernel;
    }

    public void operation(String operation){
        if(operation.equals("Sottrazione"))
            System.out.println("La richiesta è stata gestita dalla CpuB");
        else{
            if(nextKernel!=null)
                nextKernel.operation(operation);
            else
                System.out.println("La richiesta non è gestita da nessuna cpu");
        }
    }
}
