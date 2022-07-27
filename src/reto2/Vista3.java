/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Sofia
 */
public class Vista3 extends JFrame implements ActionListener{
    
    private JTextField id_votante;
    private JTextField nombre;
    private JTextField telefono;
    private JTextField correo;
    private JTextField ciudad;
    CtroVotantes cc1;
    private JButton boton1;
    
    
    
    public Vista3(){
        
        this.cc1 =new CtroVotantes();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(200,0,600,800);
        JPanel panelCandidato = new JPanel();
        setSize(400,600);
        JLabel idCandidato = new JLabel("Documento del votante");
        id_votante = new JTextField(12);
        JLabel name = new JLabel("Nombre");
        nombre = new JTextField(120);
        JLabel ter = new JLabel("Teléfono");
        telefono = new JTextField(32);
        JLabel email = new JLabel("Correo electronico");
        correo = new JTextField(320);
        JLabel ciu = new JLabel("Ciudad residencia");
        ciudad = new JTextField(32);
        boton1 =new JButton("Agregar");
        add(boton1);
        boton1.addActionListener(this);
        
        setLayout(new java.awt.GridLayout(12, 1, 3, 3));
        //frame.getContentPane().add(panelCandidato);
        getContentPane().add(idCandidato);
        getContentPane().add(id_votante);
        getContentPane().add(name);
        getContentPane().add(nombre);
        getContentPane().add(ter);
        getContentPane().add(telefono);
        getContentPane().add(email);
        getContentPane().add(correo);
        getContentPane().add(ciu);
        getContentPane().add(ciudad);
        getContentPane().add(boton1);
        //frame.pack();
        //boton1.addActionListener(this);
        setVisible(true);}
        //boton1.addActionListener(this);       
    
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()== boton1) {
          
        //String idCandidato2 = id_Candidato.getText();        
        Votante vot = new Votante(ciudad.getText(), id_votante.getText(), nombre.getText(), telefono.getText(), correo.getText());
        boolean respuesta = this.cc1.agregarCandidato(vot);
        if(respuesta ){
        JOptionPane.showMessageDialog(rootPane,"Candidato Agregado");
        }else{ 
        JOptionPane.showMessageDialog(rootPane,"Candidato No Agregado");
        }
          
      }
      //else {System.out.println("nnnni");
    }
}
