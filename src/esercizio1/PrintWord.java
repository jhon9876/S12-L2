/*
Scrivere un programma che chieda all'utente di inserire un intero N che rappresenti
* il numero di elementi da inserire e poi gli chieda di inserire N parole.
* Il programma dovrà:
* -stampare tutte le parole duplicate
* -stampare il numero di parole distinte
* -stampare l'elenco delle parole distinte
* utilizzare l'interfaccia set e l'implementazione HashSet
*
*/

package esercizio1;

import java.util.HashSet;

public class PrintWord {
    private int N;
    private HashSet<String> words;


    public PrintWord(int N, HashSet<String> words) {
        this.N = N;
        this.words = words;
    }

    public void stampaNumeroDiParoleDistinte() {
        System.out.println(words.size());
        
    }

    public void stampaElencoDiParoleDistinte() {
        for (String word : words) {
            System.out.println(word);
        }

    }


}
