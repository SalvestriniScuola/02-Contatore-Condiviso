package dev.lieno;

public class Contatore {
    private int valore;
    private int valoreMassimo;

    public Contatore(int valoreMassimo) {
        this.valoreMassimo = valoreMassimo;
        this.valore = 0;
    }




    public synchronized Boolean incrementa(String t) {
        if( valore >= valoreMassimo )
            return false;
        
        valore++;

        System.out.println(t + " ha incrementato il valore a: " + valore);

        return true;
    }
}
