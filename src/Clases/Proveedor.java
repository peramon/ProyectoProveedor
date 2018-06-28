/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tania Granda
 */
public class Proveedor {
    String apellidos;
    String nombres;
    String cedula;
    String celular;
    String correo;
    String pais;
    String direccion;
    int id_proveedor;

    public Proveedor(String apellidos, String nombres, String cedula, String celular, String correo, String pais, String direccion, int id_proveedor) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula = cedula;
        this.celular = celular;
        this.correo = correo;
        this.pais = pais;
        this.direccion = direccion;
        this.id_proveedor = id_proveedor;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
    
    
}
