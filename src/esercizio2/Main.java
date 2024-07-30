/*
 *Scrivere una funzione che accetti un intero N e restituisca una lista
 * ordinata di N interi casuali da 0 a 100. Scrivere una seconda funzione
 * che accetti una lista e restituisca una nuova lista composta dagli
 * elementi della prima lista seguiti dagli stessi elementi disposti in ordine inverso.
 * Scrivere una terza funzione che accetti una lista ed un booleano:
 * se il booleano è true stampa i valori in  posizioni pari, altrimenti stampa i valori
 * in posizioni dispari. Creare un main che utilizzi le tre funzioni. Utilizzare
 * l'interfaccia List e l'implementazione ArrayList.
 *  */

package esercizio2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> numeriRandom(int N) {
        Random NumeriRand = new Random();
        ArrayList<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            randomNumber.add(NumeriRand.nextInt(101));
        }

        return randomNumber;
    }

    public static ArrayList<Integer> listaEInversa(ArrayList<Integer> originalList) {
        ArrayList<Integer> newList = new ArrayList<>(originalList);
        for (int i = originalList.size(); i > 0; i--) {
            newList.add(originalList.get(i - 1));
        }

        return newList;
    }

    public static void pariODispari(ArrayList<Integer> numbers, boolean c) {
        if (c == true) {
            for (int i = 0; i < numbers.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(numbers.get(i));
                }
            }
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (i % 3 == 0) {
                    System.out.println(numbers.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> valoriRandom = numeriRandom(5);
        System.out.println(valoriRandom);

        ArrayList<Integer> newList = listaEInversa(valoriRandom);
        System.out.println(newList);


        pariODispari(valoriRandom, true);
    }
}
