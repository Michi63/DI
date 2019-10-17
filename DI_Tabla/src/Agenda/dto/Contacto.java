/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.dto;

/**
 *
 * @author miguel
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;

    public Contacto(String nombre, String apellidos, String dni, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String[] contactoArray(){
        String[] contacto = new String[4];
        contacto[0] = nombre;
        contacto[1] = apellidos;
        contacto[2] = dni;
        contacto[3] = telefono;
        return contacto;
    }
       
}
