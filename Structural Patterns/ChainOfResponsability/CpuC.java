package DesignPatternStrutturali.ChainOfResponsability;

public class CpuC implements Kernel {
    private Kernel nextKernel;

    public void setNextKernel(Kernel kernel){
        this.nextKernel=kernel;
    }

    public void operation(String operation){
        if(operation.equals("Divisione"))
            System.out.println("La richiesta è gestita dalla cpuC");
        else{
            if(nextKernel!=null)
                nextKernel.operation(operation);
            else
                System.out.println("Nessuna cpu può gestire la richiesta");
        }
    }
}
