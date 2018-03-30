/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author james
 */
@Entity
@Table (name="pregunta")
public class Pregunta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name="numero")
    private int numero;
    @Column (name="verificada")
    private boolean verificada;
    @Column (name="listaRespuestas")
    private ArrayList<Respuesta> listaRespuestas;
    @Column (name="listaPistas")
    private ArrayList<Pistas> listaPistas;
    @Column (name="dificultad")
    private int dificultad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
