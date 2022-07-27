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
public class CtroVotantes {
    
    ModeVotante modelo;

    public CtroVotantes() {
        this.modelo = new ModeVotante();
    }
    
    public boolean agregarCandidato(Votante vot){
        
        return this.modelo.agregarCandidato(vot);
    }

    public ArrayList<Votante> ObtenerCandidatos(){
        
       return this.modelo.ObtenerCandidatos();
     
    }
    
    
}
