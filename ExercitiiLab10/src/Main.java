import model.Magazin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        Integer[] lista={1,2,3,4,5};
        // Sa se sorteze descrescator folosind lambda expression
        Arrays.sort(lista, (a, b) -> b.compareTo(a));
        // Sa se calculeze suma intregilor folosind reduce
        Integer sumaLista= Arrays.stream(lista).reduce(0,(a,b)->a+b);
        System.out.println(sumaLista);
        // Sa se calculeze suma intregilor folosind summingInt
        Integer sumaLista2= Arrays.stream(lista).collect(summingInt(a->a));
        System.out.println(sumaLista2);
        // Sa se calculeze media folosind lambda averagingInt
        Double medieLista= Arrays.stream(lista).collect(averagingInt(a->a));
        System.out.println(medieLista);
        // Sa se afiseze min folosind lambda.
        System.out.println(Arrays.stream(lista).min((a, b) -> a.compareTo(b)));
        // Sa se afiseze max folosind lambda
        System.out.println(Arrays.stream(lista).max((a, b) -> a.compareTo(b)));
        // Sa se afiseze intregii mai mari de o anumita valoare folosind filter
        System.out.println(Arrays.stream(lista).filter(a->a>2).collect(toList()));


        int[] lista2={9,0,2,10};
        // Sa se sorteze crescator
        Arrays.sort(lista2);

        // Sa se sorteze descrescator -> se foloseste stream
        Integer[] listaInteger2 = Arrays.stream(lista2).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.stream(listaInteger2).sorted((a,b)->b.compareTo(a)).collect(toList()));

        // Lista ar2 cu elementele ridicate la patrat (map)
        List<Integer> ar2=Arrays.stream(listaInteger2).map(a->a*a).collect(Collectors.toList());
        System.out.println(ar2);

        //3. Se defineste o lista de obiecte Magazin
        // Magazin are: numeMagazin, numarAngajati
        List<Magazin> listaMagazine=new ArrayList<>();

        listaMagazine.add(new Magazin("emag",20));
        listaMagazine.add(new Magazin("carrefour",50));
        listaMagazine.add(new Magazin("altex",10));

        // sa se afiseze magazinele grupate by numarAngajati
        System.out.println(listaMagazine.stream().collect(groupingBy(Magazin::getNumarAngajati)));
        // sa se afiseze suma angajatilor din toate magazinele
        System.out.println(listaMagazine.stream().collect(summingInt(Magazin::getNumarAngajati)));
    }

}