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
public class Tutor {
    private String nombre;
    private String correo;
    private String contrase�a;

    public Tutor(String nombre, String correo, String contrase�a) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrase�a = contrase�a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    @Override
    public String toString() {
        return "Tutor{" + "nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contrase�a + '}';
    }
    
    
}
