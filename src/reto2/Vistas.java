/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Sofia
 */
public class Vistas extends JFrame  implements ActionListener{
    
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JPanel panel1;
    
    public Vistas(){
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        //setSize(1400,1600);
        setBounds(200,0,600,800);
        //setLayout(new java.awt.GridLayout(4, 2, 5, 5));
        panel1 = new JPanel();
        add(panel1);
        JLabel title = new JLabel("Proceso para la elección de Candidatos");
        panel1.add(title);
        panel1.setBounds(new Rectangle(190,5,250,50));
        boton1 = new JButton ("Ingresar Candidato");
        boton1.setForeground(Color.BLACK);
        boton1.setBackground(Color.PINK);
        boton1.setBounds(new Rectangle(210,50,200,50));
        add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton ("Ingresar Votante");
        boton2.setBounds(new Rectangle(210,120,200,50));
        add(boton2);
        boton2.addActionListener(this);
        boton3 = new JButton ("Elecciones Vigentes"); 
        boton3.setBounds(new Rectangle(210,190,200,50));
        add(boton3); 
        boton3.addActionListener(this);
        boton4 = new JButton ("Lista de Candidatos");  
        //boton4.setBounds(new Rectangle(70,5,10,25));
        boton4.setBounds(new Rectangle(210,260,200,50));
        add(boton4); 
        boton4.addActionListener(this);
        boton5 = new JButton ("Lista de votantes");
        boton5.setBounds(new Rectangle(210,330,200,50));
        add(boton5); 
        boton5.addActionListener(this);
        setLayout(null);
        
        //pack();
        //boton3.addActionListener(this);
        setVisible(true);
    }
    
    
    //@Override
    
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()== boton1) {
      Vista2 interfaz2 = new Vista2();
      }
      if (e.getSource()== boton2){  
      Vista3 interfaz3 = new Vista3();
      }
      if (e.getSource()== boton3){
      //Vista4 interfaz4 = new Vista4();
      System.out.println("nnnni");
      }
      if (e.getSource()== boton4){
      Vista4 interfaz4 = new Vista4();
      }
      if (e.getSource()== boton5){
      Vista5 interfaz5 = new Vista5();
      }
      //else {System.out.println("nnnni");
    }
    //@Override 
    
    
}
   
  
    
    
    
    
    
