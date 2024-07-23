package esercizio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Facciamo selezionare un numero all'utente
        System.out.println("Inserisci un numero:");
        int numero = Integer.parseInt(scanner.nextLine());

        // Ciclo che stampa i numeri da numero a 0
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}