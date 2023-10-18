package org.lesson.java;


import java.text.DecimalFormat;
import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
        //istanzio lo scanner
        Scanner scan = new Scanner(System.in);
        //richiedo quanti chilometri deve percorrere
        System.out.print("Quanti chilometri deve percorrere?");
        int rateKm = scan.nextInt();
        //richiedo l'eta del passeggero
        System.out.print("Quanti anni ha?");
        int age = scan.nextInt();

        DecimalFormat format = new DecimalFormat("#.##");
        //settiamo il prezzo finale

        double total = rateKm * 0.21;

        double underDiscount = total * 0.2;
        double overDiscount = total * 0.4;


        //setto l'if per far si di inserire lo sconto in riferimento dell'eta del passeggero
        if (age < 18) {
            total = (total - underDiscount);
            System.out.println("Il costo del suo biglietto è " + format.format(total) + "€");

        } else if (age > 65) {
            total = total - overDiscount;
            System.out.println("Il costo del suo biglietto è " + format.format(total) + "€");
        } else {
            System.out.println("Il costo del suo biglietto è " + format.format(total) + "€");
        }
        scan.close();
    }
}
