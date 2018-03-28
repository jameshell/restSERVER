/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author james
 */
public class Pregunta {
    private int numero;
    private boolean verificada;
    private ArrayList<Respuesta> listaRespuestas;
    private ArrayList<Pistas> listaPistas;
    private int dificultad;

    public Pregunta(int numero, boolean verificada, ArrayList<Respuesta> listaRespuestas, ArrayList<Pistas> listaPistas, int dificultad) {
        this.numero = numero;
        this.verificada = verificada;
        this.listaRespuestas = listaRespuestas;
        this.listaPistas = listaPistas;
        this.dificultad = dificultad;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVerificada() {
        return verificada;
    }

    public void setVerificada(boolean verificada) {
        this.verificada = verificada;
    }

    public ArrayList<Respuesta> getListaRespuestas() {
        return listaRespuestas;
    }

    public void setListaRespuestas(ArrayList<Respuesta> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }

    public ArrayList<Pistas> getListaPistas() {
        return listaPistas;
    }

    public void setListaPistas(ArrayList<Pistas> listaPistas) {
        this.listaPistas = listaPistas;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "numero=" + numero + ", verificada=" + verificada + ", listaRespuestas=" + listaRespuestas + ", listaPistas=" + listaPistas + ", dificultad=" + dificultad + '}';
    }
    
    
}
