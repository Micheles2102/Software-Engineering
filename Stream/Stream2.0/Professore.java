import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Professore {
    private List<Integer> importi=Arrays.asList(12,34,56,78,90,45);

    //somma in stile funzionale
    public int CalcolaSomma(){
        return importi.stream().reduce(0,(acc,v)->acc+v);
    }

    //somma in stile funzionale mediante un ciclo for
    public int calcolaSommaImper(){
        int risultato=0;
        for(int v:importi)risultato +=v;
        return risultato;
    }
    //calcolare il massimo
    public int estraiMassimo(){
        return importi.stream().max(Integer::compare).get();
    }
    //trovare gli elementi più grandi di un certo valore tramite filter e li mette all'interno di una nuova lista
    public List<Integer> estraiValori(int val){
        return importi.stream().filter(s->s>val).collect(Collectors.toList());
    }
    //convertire ed accumulare i valori tramite map e reduce
    public String congiungi(){
        return importi.stream().map(s->String.valueOf(s)).reduce("",(res,v)->res.concat(v));
    }
}
