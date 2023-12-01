// Scrivere una funzione che controlli se un numero int è in un determinato range
//Se lo è ritorna true se non lo è lancia un'eccezione

import org.w3c.dom.ranges.RangeException;

public class Main {
    public static void main(String[] args) {
        int numMax = 20;
        int numMin = 5;
        System.out.println(numRange(numMin, numMax, 5));
    }

    public static boolean numRange(int numMin, int numMax, int confrontoNum) {
        if (confrontoNum >= numMin && confrontoNum <= numMax) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è determinato nel rango");
        }
    }
}
