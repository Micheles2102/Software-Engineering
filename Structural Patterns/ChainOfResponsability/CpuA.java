package DesignPatternStrutturali.ChainOfResponsability;

public class CpuA implements Kernel {
    private Kernel NextKernel;
    public void setNextKernel(Kernel kernel){
        this.NextKernel=kernel;
    }

    public void operation(String operation){
        if(operation.equals("Addizione"))
            System.out.println("La richiesta A è stata gestita dalla CpuA");
        else{
            if(NextKernel!=null)
                NextKernel.operation((operation));
            else    
                System.out.println("Nessuna Cpu può gestire la richiesta");
        }
    }
}
