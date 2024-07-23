package esercizio_1;


public class Main {
    public static void main(String[] args) {
        // Richiamato il primo metodo per verificare se un numero è pari o dispari
        padiDispari(4); //<—— il numero va qui

//Richiamiamo il metodo e passiamo il parametro richiesto un anno a tua scelta
        annoBisestile(1728);//  <—— Inseriamo l'anno da verificare
    }

    //Metodo Pari Dispari con il costrutto IF ELSE
    public static void padiDispari(int numero) {
        if (numero % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //Metodo per verificare se l'anno è bisestile
    public static void annoBisestile(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}