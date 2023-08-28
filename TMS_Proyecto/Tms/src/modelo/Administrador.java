/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author braya
 */
public class Administrador {

    //atributos    
    private int id_cedula;
    private String nombre_admin;
    private String apellido_admin;
    private String telefono;
    private String contraseña;
    private String email;
    private int estado;

    //Contructor
    public Administrador() {

        this.id_cedula = 0;
        this.nombre_admin = "";
        this.apellido_admin = "";
        this.telefono = "";
        this.contraseña = "";
        this.email = "";
        this.estado = 0;

    }
    //set and get

    public int getId_cedula() {
        return id_cedula;
    }

    public void setId_cedula(int id_cedula) {
        this.id_cedula = id_cedula;
    }

    public String getNombre_admin() {
        return nombre_admin;
    }

    public void setNombre_admin(String nombre_admin) {
        this.nombre_admin = nombre_admin;
    }

    public String getApellido_admin() {
        return apellido_admin;
    }

    public void setApellido_admin(String apellido_admin) {
        this.apellido_admin = apellido_admin;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
        

}
