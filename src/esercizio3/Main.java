/*Scrivere una classe Java che permetta di gestire una rubrica telefonica. La lista
* dei contatti è realizzata mediante una HashMap in cui le
* chiavi sono i nomi delle persone e i valori sono i numeri di telefono.
* Realizzare i metodi per:
* 1. L'inserimento di una coppia <Nome,telefono>
2. La cancellazione di una coppia <Nome,Telefon a partire dal nome
* 3. La ricerca di una Persona di cui si conosce il numero di telefono
* 4.La ricerca del numero di telefono di una Persona di cui si conosce il nome
* 5. La stampa di tutti i contatti con nome e numero*/

package esercizio3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rT = new RubricaTelefonica();
        rT.inserisciCoppia("Rosario", "123");
        rT.inserisciCoppia("Giovanni", "456");

        Map<String, String> stampaRubrica = rT.getRubrica();
        System.out.println(stampaRubrica);

     /*   rT.rimuoviCoppia("Giovanni");
        System.out.println(stampaRubrica);*/

        rT.cercaTelefono("Rosario");

        rT.stampaContatti();

    }
}
