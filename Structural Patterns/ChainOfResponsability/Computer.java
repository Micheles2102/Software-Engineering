package DesignPatternStrutturali.ChainOfResponsability;

public class Computer {
    public static void main(String[] args){
        Kernel A=new CpuA();
        Kernel B=new CpuB();
        Kernel C=new CpuC();
        String operation="Sottrazione";
        A.setNextKernel(B);
        B.setNextKernel(C);
        A.operation(operation);
    }
}
