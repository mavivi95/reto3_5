/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author Sofia
 */
public class Votante extends Persona {
    
    //Parametros 
    String CiudadResidencia; 

    public Votante(String CiudadResidencia, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.CiudadResidencia = CiudadResidencia;
    }
    
    //getters 

    public String getCiudadResidencia() {
        return CiudadResidencia;
    }
    
    //setters<<<<<

    public void setCiudadResidencia(String CiudadResidencia) {
        this.CiudadResidencia = CiudadResidencia;
    }
    
    
}
