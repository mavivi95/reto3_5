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
public class CntroCandidato {
    
    ModeCandidato modelo;

    public CntroCandidato() {
        this.modelo = new ModeCandidato();
    }
    
    public boolean agregarCandidato(Candidato cdatos){
        
        return this.modelo.agregarCandidato(cdatos);
    }

    public ArrayList<Candidato> ObtenerCandidatos(){
        
       return this.modelo.ObtenerCandidatos();
     
    }
    
    
}
