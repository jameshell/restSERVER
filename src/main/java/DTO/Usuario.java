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
public class Usuario {
    private String nombre;
    private int cedula;
    private String correo;
    private String contraseña;
    private int quizid;

    public Usuario(String nombre, int cedula, String correo, String contraseña, int quizid) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.contraseña = contraseña;
        this.quizid = quizid;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getQuizid() {
        return quizid;
    }

    public void setQuizid(int quizid) {
        this.quizid = quizid;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", quizid=" + quizid + '}';
    }
    
    
}
