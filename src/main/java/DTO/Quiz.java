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
public class Quiz {
    private ArrayList<Pregunta> listaPreguntas;

    public Quiz(ArrayList<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
    
    public ArrayList<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }

    public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }

    @Override
    public String toString() {
        return "Quiz{" + "listaPreguntas=" + listaPreguntas + '}';
    }
    
    
}
