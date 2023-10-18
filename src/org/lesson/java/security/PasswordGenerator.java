package org.lesson.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Il suo nome ?");
        String name = scan.nextLine();
        System.out.println("Il suo cognome ?");
        String surname = scan.nextLine();
        System.out.println("Il suo colore preferito ?");
        String favoriteColor = scan.nextLine();
        System.out.println("Giorno di nascita");
        int dayOfBirth = scan.nextInt();
        System.out.println("Mese di nascita");
        int monthOfBirth = scan.nextInt();
        System.out.println("Anno di nascita");
        int yearOfBirth = scan.nextInt();
        int addictionOfBirthday = dayOfBirth + monthOfBirth + yearOfBirth;
        System.out.println(addictionOfBirthday);

        String total = String.valueOf(addictionOfBirthday);
        String generatorPassword = name + "-" + surname + "-" + favoriteColor + "-" + total;
        System.out.println(generatorPassword);

        scan.close();
    }
}
