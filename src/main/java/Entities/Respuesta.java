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
@Table (name="respuesta")
public class Respuesta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name="resCorrecta")
    private String resCorrecta;
    @Column (name="resIncorrectas")
    private ArrayList<String> resIncorrectas;

    public String getResCorrecta() {
        return resCorrecta;
    }

    public void setResCorrecta(String resCorrecta) {
        this.resCorrecta = resCorrecta;
    }

    public ArrayList<String> getResIncorrectas() {
        return resIncorrectas;
    }

    public void setResIncorrectas(ArrayList<String> resIncorrectas) {
        this.resIncorrectas = resIncorrectas;
    }
    
}
