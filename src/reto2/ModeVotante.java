/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class ModeVotante {
    
    Coneccion c1 = new Coneccion();

    public ModeVotante() {
        
        c1.crearconeccion();
    }
    
    
    
    public boolean agregarCandidato(Votante cdatos){
        
        //c1.ObtenerCandidatos();
        try{
            
        //ArrayList<String> nombresVotante = new ArrayList<>();
        //String [][] matriz = {{"", "", ""},{"",""}};
        
        String insertar ="INSERT INTO votantes VALUES (?,?,?,?,?)";
        
        PreparedStatement sentencia = this.c1.coneccion.prepareStatement(insertar);
               
        sentencia.setString(1, cdatos.getNumeroDocumento());
        sentencia.setString(2, cdatos.getNombre());
        sentencia.setString(3, cdatos.getTelefono());
        sentencia.setString(4, cdatos.getCorreo());
        sentencia.setString(5, cdatos.getCiudadResidencia());
        
        //ResultSet resultados = sentencia.executeQuery();
        int Resultadoenii= sentencia.executeUpdate();
        
        return Resultadoenii >=1;
        
       }catch (Exception e){
            System.out.println("No ingresoo"+e.getMessage());
            return false;
        }  
    }
    
    public ArrayList<Votante> ObtenerCandidatos(){
        
        try{
            
        ArrayList<Votante> nombresvotantes = new ArrayList<>();
        //String [][] matriz = {{"", "", ""},{"",""}};
        
        String consulta ="SELECT * FROM votantes";
        
        PreparedStatement sentencia = this.c1.coneccion.prepareStatement(consulta);
        
        ResultSet resultados = sentencia.executeQuery();
        
        
        while (resultados.next()){
            
            String nombre = resultados.getString("nombre");
            String numeroDocumento = resultados.getString("id_votante");
            String telefono = resultados.getString("telefono");
            String correo = resultados.getString("correo");
            String CiudadResidencia = resultados.getString("ciudad_residencia");
            
            Votante c3 = new Votante(CiudadResidencia, numeroDocumento, nombre, telefono, correo);
                   
            nombresvotantes.add(c3);
            System.out.println("bien");
            
        }return nombresvotantes;
    }catch (Exception e){
            System.out.println("No conexion"+e.getMessage());
        return null;
        }
    
    }
    
}
