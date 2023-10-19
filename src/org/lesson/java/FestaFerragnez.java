package org.lesson.java;

import java.util.Scanner;

public class FestaFerragnez {
    public static void main(String[] args) {
        //istanzio uno scanner
        Scanner scan = new Scanner(System.in);

        //creo un array di invitati alla festa
        String[] invitatiFesta = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        //chiedo all'utente il suo nome e cognome
        System.out.println("Il suo nome e cognome ?");
        String presenteInvito = scan.nextLine();

        //setto una variabile booleana che traccia se l'invitato è presente nella lista
        boolean found = false;


        // ciclo for
        for (int i = 0; i < invitatiFesta.length; i++) {
            if (presenteInvito.equals(invitatiFesta[i])) {
                found = true;
                break;
            }
            ;

        }
        //se trovo l'invitato o meno stampo il risultato
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");

        }

        // ciclo while
        int index = 0;
        while (!found && index < invitatiFesta.length) {
            if (presenteInvito.equals(invitatiFesta[index])) {
                found = true;
            }
            index++;
        }

        System.out.println(found ? "Benvenuto alla festa" : "Non sei stato invitato");
        //chiudo lo scanner
        scan.close();
    }
}
