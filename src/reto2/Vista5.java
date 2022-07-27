/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia
 */
public class Vista5 extends JFrame {
    
    CtroVotantes cc1;
    private JTable tablecandidatos;
   
    public Vista5(){
    this.cc1 =new CtroVotantes();
         
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setBounds(200,0,600,800);
    //candidato controlador;
    setTitle ("Lista de Votantes inscritos");
        
    ArrayList<Votante> nombresVotantes2 = this.cc1.ObtenerCandidatos();
    //String [][] valores = {{"holi", "ajaja", "ajjaja"},{"fff", "jjjaja", "ajajaja"}};
    tablecandidatos = new JTable();
    //DefaultTableModel modelo = (DefaultTableModel) tablecandidatos.getModel();
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre del Candidato");
    modelo.addColumn("Ciudad");
    modelo.addColumn("Telefono");
    modelo.setRowCount(0);
    for (Votante c:nombresVotantes2){
    Object[] fila = {c.getNombre(), c.getCiudadResidencia(), c.getTelefono()};
    modelo.addRow(fila);
    }
    tablecandidatos.setModel(modelo);
    //System.out.println(nombrescandidatos)
    
    JScrollPane jsp = new JScrollPane(tablecandidatos);
    add(jsp);
    
    
    //c1.ObtenerCandidatos();
    
    setVisible(true);
    
    
    
    }
    
}
