package esercizio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi il primo numero");
        int numero = Integer.parseInt(scanner.nextLine());
        switch (numero) {
            case 1:

                System.out.println("uno");
                break;
            case 2:

                System.out.println("due");
                break;
            case 3:

                System.out.println("tre");
                break;
            default:
                System.out.println("il numero non e presente nei possibili casi ");
                break;

        }
        scanner.close();
    }


}