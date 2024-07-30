/*Scrivere una classe Java che permetta di gestire una rubrica telefonica. La lista
* dei contatti è realizzata mediante una HashMap in cui le
* chiavi sono i nomi delle persone e i valori sono i numeri di telefono.
* Realizzare i metodi per:
* 1. L'inserimento di una coppia <Nome,telefono>
2. La cancellazione di una coppia <Nome,Telefon> a partire dal nome
* 3. La ricerca di una Persona di cui si conosce il numero di telefono
* 4.La ricerca del numero di telefono di una Persona di cui si conosce il nome
* 5. La stampa di tutti i contatti con nome e numero*/


package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    public void cercaTelefono(String chiave) {
        for (int i = 0; i < rubrica.size(); i++) {
            if (rubrica.containsKey(chiave)) {
                System.out.println(rubrica.get(chiave));
            }
        }
    }

    public void stampaContatti() {
        System.out.println(rubrica);
    }

    public void inserisciCoppia(String nome, String telefono) {
        rubrica.put(nome, telefono);

    }

    public Map<String, String> getRubrica() {
        return rubrica;
    }

    public void rimuoviCoppia(String key) {
        rubrica.remove(key);
    }
}
