/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class ModeCandidato {
    
    
    Coneccion c1 = new Coneccion();

    public ModeCandidato() {
        
        c1.crearconeccion();
    }
    
    
    
    public boolean agregarCandidato(Candidato cdatos){
        
        //c1.ObtenerCandidatos();
        try{
            
        //ArrayList<String> nombrescandidatos = new ArrayList<>();
        //String [][] matriz = {{"", "", ""},{"",""}};
        
        String insertar ="INSERT INTO candidato VALUES (?,?,?,?,?,?,?,?)";
        
        PreparedStatement sentencia = this.c1.coneccion.prepareStatement(insertar);
               
        sentencia.setString(1, cdatos.getNumeroDocumento());
        sentencia.setString(2, cdatos.getNombre());
        sentencia.setString(3, cdatos.getTelefono());
        sentencia.setString(4, cdatos.getCorreo());
        sentencia.setString(5, cdatos.getPartidoPolitico());
        sentencia.setString(6, cdatos.getDescripcion());
        sentencia.setString(7, cdatos.getMensajeCampaña());
        sentencia.setString(8, cdatos.getPropuestas());
        //ResultSet resultados = sentencia.executeQuery();
        int Resultadoenii= sentencia.executeUpdate();
        
        return Resultadoenii >=1;
        
       }catch (Exception e){
            System.out.println("No ingresoo"+e.getMessage());
            return false;
        }  
    }
    
    public ArrayList<Candidato> ObtenerCandidatos(){
        
        try{
            
        ArrayList<Candidato> nombrescandidatos = new ArrayList<>();
        //String [][] matriz = {{"", "", ""},{"",""}};
        
        String consulta ="SELECT * FROM candidato";
        
        PreparedStatement sentencia = this.c1.coneccion.prepareStatement(consulta);
        
        ResultSet resultados = sentencia.executeQuery();
        
        
        while (resultados.next()){
            
            String nombre = resultados.getString("nombre");
            String partidopol = resultados.getString("partido_politico");
            String Descripcion = resultados.getString("descripcion");
            String MensajeCampaña = resultados.getString("mensaje_campaña");
            String propuestas = resultados.getString("propuestas");
            String numeroDocumento = resultados.getString("id_cadidato");
            String telefono = resultados.getString("telefono");
            String correo = resultados.getString("correo");
            
            Candidato c2 = new Candidato(partidopol,Descripcion,MensajeCampaña, propuestas, numeroDocumento, nombre, telefono, correo);
            
            
            
            nombrescandidatos.add(c2);
            System.out.println("bien");
            
        }return nombrescandidatos;
    }catch (Exception e){
            System.out.println("No conexion"+e.getMessage());
        return null;
        }
    
    }
    
}
