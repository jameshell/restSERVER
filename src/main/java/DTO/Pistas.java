/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author james
 */
public class Pistas {
    private String pista;
    private int numeroPista;

    public Pistas(String pista, int numeroPista) {
        this.pista = pista;
        this.numeroPista = numeroPista;
    }
    
    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public int getNumeroPista() {
        return numeroPista;
    }

    public void setNumeroPista(int numeroPista) {
        this.numeroPista = numeroPista;
    }

    @Override
    public String toString() {
        return "Pistas{" + "pista=" + pista + ", numeroPista=" + numeroPista + '}';
    }
    
    
}
