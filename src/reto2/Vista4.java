/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia
 */
public class Vista4 extends JFrame{
    
    CntroCandidato cc1;
    private JTable tablecandidatos;
   
    public Vista4(){
    this.cc1 =new CntroCandidato();
     
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setBounds(200,0,600,800);
    //candidato controlador;
    setTitle ("Lista de candidatos inscritos");
        
    ArrayList<Candidato> nombrescandidatos2 = this.cc1.ObtenerCandidatos();
    //String [][] valores = {{"holi", "ajaja", "ajjaja"},{"fff", "jjjaja", "ajajaja"}};
    tablecandidatos = new JTable();
    //DefaultTableModel modelo = (DefaultTableModel) tablecandidatos.getModel();
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre del Candidato");
    modelo.addColumn("Partido politico");
    modelo.addColumn("Mensaje de Campaña");
    modelo.setRowCount(0);
    for (Candidato c:nombrescandidatos2){
    Object[] fila = {c.getNombre(), c.getPartidoPolitico(), c.getMensajeCampaña()};
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
