public class Test {
    public static void main(String[] args) {
        Professore prof=new Professore();
        int somma=prof.CalcolaSomma();
        System.out.println("Somma: "+somma);
        if(somma==prof.calcolaSommaImper())System.out.println("Ok somma");
        int max=prof.estraiMassimo();
        System.out.println("Massimo: "+max);
        System.out.println("Valori estratti: "+prof.estraiValori(67)+"\n");
        System.out.println("In string: "+prof.congiungi()+"\n");
    }
}
