package esercizio_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String text = scanner.nextLine();

        StringBuilder newText = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            newText.append(text.charAt(i));
            if (i < text.length() - 1) {
                newText.append(',');
            }
            i++;
        }
        System.out.println(newText.toString());
    }
}