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
public class Respuesta {
    private String resCorrecta;
    private ArrayList<String> resIncorrectas;

    public Respuesta(String resCorrecta, ArrayList<String> resIncorrectas) {
        this.resCorrecta = resCorrecta;
        this.resIncorrectas = resIncorrectas;
    }

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

    @Override
    public String toString() {
        return "Respuesta{" + "resCorrecta=" + resCorrecta + ", resIncorrectas=" + resIncorrectas + '}';
    }
    
    
}
