package dev.lieno;

public class Contatore {
    private int valore;
    private int valoreMassimo;

    public Boolean incrementa(String t) {
        if( valore > valoreMassimo )
            return false;
        
        valore++;

        System.out.println(t + " ha incrementato il valore a: " + valore);

        return true;
    }
}
