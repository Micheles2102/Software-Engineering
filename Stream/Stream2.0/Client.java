import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Optional;
public class Client {
    public static void main(String[] args) {
        List<Persona> list = List.of(new Persona("Pippo", 46, "Programmer",50),
                                     new Persona("Alessio", 23, "Teacher",39),
                                     new Persona("Giovanni", 42, "Builder",17),
                                     new Persona("Ferdinando", 18, "Programmer",69),
                                     new Persona("Lele", 62, "Plant Builder",2),
                                     new Persona("Liccardo",5,"Builder",20)
                                     );
        System.out.println(" "+" //Data una lista di persone,trovare i nomi dei programmatori con età minore di 30 anni.");
        //Data una lista di persone,trovare i nomi dei programmatori con età minore di 30 anni
        List<String> nomi=list.stream().filter(p->p.getEta()<30)
                            .filter(p->p.getImpiego().equals("Programmer"))
                            .map(p->p.getNome())
                            .collect(Collectors.toList());
        for (String s : nomi) {
            System.out.println(s);
        }
        //Data una lista di istanze di Persona trovare i diversi ruoli.
        System.out.println(" "+"//Data una lista di istanze di Persona trovare i diversi ruoli.");
        List<String> ruoli=list.stream().map(p->p.getImpiego()).distinct().collect(Collectors.toList());
        for (String ruolo : ruoli) {
            System.out.println(ruolo);
        }
        //Data una lista di stringhe,produrre una lista che contiene solo le stringhe che cominciano con un certo prefisso noto
        System.out.println(" "+"//Data una lista di stringhe,produrre una lista che contiene solo le stringhe che cominciano con un certo prefisso noto.");
        List<String> stringa=List.of("cane","casa","cancello","animele","gatto","bambino","castoro");
        String prefisso="ca";
        List<String> prefissa=stringa.stream().filter(x->x.startsWith(prefisso)).collect(Collectors.toList());
        for (String stringas : prefissa) {
            System.out.println(stringas);
        }
        //Data una lista di stringhe, produrre una stringa contenente le iniziali di ciascuna stringa della lista.
        System.out.println(" "+"//Data una lista di stringhe, produrre una stringa contenente le iniziali di ciascuna stringa della lista.");
        String iniziali=stringa.stream().map(p->p.substring(0,1)).reduce("",(m,v)->m.concat(v));
        System.out.println(iniziali);
        //Data una lista di prodotti, restituire il costo totale dei prodotti che hanno un prezzo maggiore di 10.
        System.out.println(" "+"//Data una lista di Persone, restituire il costo totale degli stipendi che hanno un prezzo maggiore di 20.");
        int totalestipendi=list.stream().filter(p->p.getStipendio()>20).mapToInt(Persona::getStipendio).sum();
        System.out.println(totalestipendi);
        System.out.println(" "+"Restituire l'impiegato con lo stipendio più basso");
        String impiegatostipendiobasso=list.stream().min((p1,p2)->Integer.compare(p1.getStipendio(),p2.getStipendio())).
                                        map(p->p.getNome()).toString();
        System.out.println(impiegatostipendiobasso);
        //Restituire l'impiegato con lo stipendio più basso"
        System.out.println(" "+"Restituire l'impiegato con lo stipendio più basso");
        String impiegatostipendioalto=list.stream().max((p1,p2)->Integer.compare(p1.getStipendio(),p2.getStipendio())).map(p->p.getNome()).toString();
        System.out.println(impiegatostipendioalto);
        
        //Prova esame
        System.out.println("PROVA ESAME");
        List<Triang> t1=List.of(new Triang(5,8,9,45,45,90),
                        new Triang(9,18,79,10,1605,10),
                        new Triang(39,13,15,60,60,60));
        //Un metodo che trova le istanze della lista t1 che sono triangoli rettangoli(verificare che un angolo sia di 90)
        List<Triang> t2=t1.stream().filter(p->p.angolo()==90 || p.angolo2()==90 ||p.angolo3()==90).collect(Collectors.toList());
        for (Triang triang : t2) {
            System.out.println(t2);
        }
        System.out.println("AREA TRIANGOLO RETTANGOLO");
        //un metodo che restituisce le aree dei triangoli rettangoli trovati precedentemente(contenuti in lista t2).(suggerimento:l'area del triangolo rettangolo è pari al semi-prodotto fra i lati che formano l'angolo di 90 gradi)
        int possible=t2.stream().filter(p->p.angolo()==90).mapToInt(p->p.lato1() + p.lato2()).sum();
        int possible2=t2.stream().filter(p->p.angolo2()==90).mapToInt(p->p.lato2() + p.lato3()).sum();
        int possible3=t2.stream().filter(p->p.angolo3()==90).mapToInt(p->p.lato1() + p.lato3()).sum();
        int area=possible+possible2+possible3;
        System.out.println("Area del triangolo= "+area);


        //data la classe Figura calcolare il valore più grande tra gli angoli
        List<Figura> Figura=List.of(new Figura(5,8,9,45,45,90),
                        new Figura(9,18,79,10,1605,10),
                        new Figura(39,13,15,60,60,60));

        Figura.forEach(s->{
            int maxlato=Math.max(Math.max(s.lato1(),s.lato2()),s.lato3());
            System.out.println("il massimo tra i lati è: "+maxlato);
        });
        
        //cerco di trovare il massimo degli angoli
        Figura.forEach(s->{
            int maxangolo=Math.max(Math.max(s.angolo(),s.angolo2()),s.angolo3());
            System.out.println("Il massimo degli angoli è: "+ maxangolo);
        });
        //cerco il massimo dei valori
        Figura.forEach(s->{
            int maxangolo=Math.max(Math.max(s.angolo(),s.angolo2()),s.angolo3());
            int maxlato=Math.max(Math.max(s.lato1(),s.lato2()),s.lato3());
            int massimo=maxangolo>maxlato ? maxangolo : maxlato;
            System.out.println("Il massimo  è: "+ massimo);
        });  
    
    }
}

