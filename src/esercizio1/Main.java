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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi da inserire");

        try {
            int N = scanner.nextInt();
            /*String[] words = new String[N];*/
            System.out.println("Inserisci le N parole");
            HashSet<String> hashWord = new HashSet<>();
            for (int i = 0; i < N; i++) {
                hashWord.add(scanner.nextLine());
            }
            /*OPPURE ANCHE INIZIALIZZABILE CREANDO UN ARRAY, POPOLANDOLO E ESEGUENDO L'ISTRUZIONE SOTTO*/
            /*HashSet<String> hashWord = new HashSet<>(Arrays.asList(words));*/
            PrintWord pw = new PrintWord(N, hashWord);
            pw.stampaNumeroDiParoleDistinte();
            pw.stampaElencoDiParoleDistinte();

        } catch (InputMismatchException e) {
            System.out.println("Errore " + e.getMessage());
        }

    }
}