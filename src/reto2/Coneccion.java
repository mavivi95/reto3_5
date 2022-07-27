/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Sofia
 */
public class Coneccion {
    
    String Driver ="com.mysql.cj.jdbc.Driver";
    String Usuario = "root";
    String Contrasena = "";
    String db = "eleccion";
    String url = "jdbc:mysql://localhost:3306/" + db;
    Connection coneccion;
    String consulta ="SELECT * FROM candidato";
    public void crearconeccion (){
        
        try{
            Class.forName(Driver);
            this.coneccion = DriverManager.getConnection(url, Usuario, Contrasena);
            
            if (coneccion != null){
                System.out.println("OK");
            }else {System.out.println("No conexion");}
        }catch (Exception e){
            System.out.println("No conexion"+e.getMessage());
        }
    }
    
    public void ObtenerCandidatos(){
        
        try{
            
        ArrayList<String> nombrescandidatos = new ArrayList<>();
        //String [][] matriz = {{"", "", ""},{"",""}};
        
        String consulta ="SELECT * FROM candidato";
        
        PreparedStatement sentencia = this.coneccion.prepareStatement(consulta);
        
        ResultSet resultados = sentencia.executeQuery();
        
        
        while (resultados.next()){
            
            String nombre = resultados.getString("nombre");
            String partidopol = resultados.getString("partido_politico");
            String mensaje = resultados.getString("mensaje_campaña");
            nombrescandidatos.add(nombre);
            nombrescandidatos.add(partidopol);
            nombrescandidatos.add(mensaje);
            System.out.println(nombrescandidatos);
        }
        
        //String [][] matriz = {{"", "", ""},{"",""}};
        //int parada = nombrescandidatos.size()/3;
        //for (int i=0; i<=nombrescandidatos.size(); i++){
        //    for (int j=0; j<=parada; j++){
        //    matriz[i][j] = nombrescandidatos[i][j];
        //    } 
        //}
        
        }catch (Exception e){
            System.out.println("No conexion"+e.getMessage());
        }
   
    }
}
