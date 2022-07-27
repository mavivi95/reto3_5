/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class Candidato extends Persona {
    
    //Parametros 
    
    private String PartidoPolitico;
    //private String CiudadOrigen ;
    private String Descripcion;
    private String MensajeCampaña;
    //private ArrayList<String> propuestas;
    private String propuestas;

    public Candidato(String PartidoPolitico,String Descripcion, String MensajeCampaña, String propuestas, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.PartidoPolitico = PartidoPolitico;
        //this.CiudadOrigen = CiudadOrigen;
        this.Descripcion = Descripcion;
        this.MensajeCampaña = MensajeCampaña;
        this.propuestas = propuestas;
    }
    
    //getters

    public String getPartidoPolitico() {
        return PartidoPolitico;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getMensajeCampaña() {
        return MensajeCampaña;
    }

    public String getPropuestas() {
        return propuestas;
    }
    
    //Setters 

    public void setPartidoPolitico(String PartidoPolitico) {
        this.PartidoPolitico = PartidoPolitico;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setMensajeCampaña(String MensajeCampaña) {
        this.MensajeCampaña = MensajeCampaña;
    }

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }
    
    
    
}
