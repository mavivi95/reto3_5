package reto2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sofia
 */
public class Vista2 extends JFrame implements ActionListener{
    
    CntroCandidato cc1;
    private JButton boton1;
    private JTextField id_Candidato;
    private JTextField nombre;
    private JTextField telefono;
    private JTextField correo;
    private JTextField partidopolitico;
    private JTextField descripcio;
    private JTextField mensaje;
    private JTextField propu;
    
    public Vista2(){
        
        this.cc1 =new CntroCandidato();
              
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(200,0,600,800);
        //JButton boton1 = new JButton ("Ingresar Candidato");
        //JButton boton2 = new JButton ("Ingresar Votante");
        //JButton boton3 = new JButton ("Elecciones Vigentes");
        //frame.getContentPane().add(boton1, BorderLayout.NORTH);
        //frame.getContentPane().add(boton3, BorderLayout.CENTER);
        //frame.getContentPane().add(boton2, BorderLayout.SOUTH);
        JPanel panelCandidato = new JPanel();
        JLabel idCandidato = new JLabel("Documento del candidato");
        id_Candidato = new JTextField(32);
        JLabel name = new JLabel("Nombre");
        nombre = new JTextField(32);
        JLabel ter = new JLabel("Teléfono");
        telefono = new JTextField(32);
        JLabel email = new JLabel("Correo electronico");
        correo = new JTextField(100);
        JLabel pp = new JLabel("Partido Politico");
        partidopolitico = new JTextField(100);
        JLabel descripcion = new JLabel("Descripcion");
        descripcio = new JTextField(500);
        JLabel mns = new JLabel("Mensaje de Campaña");
        mensaje = new JTextField(500);
        JLabel propuestas = new JLabel("Propuestas");
        propu = new JTextField(1000);
        boton1 = new JButton ("Agregar");
        add(boton1);
        boton1.addActionListener(this);
        
        //JLabel ciudad = new JLabel("Ciudad de origen");
        //JTextField ciudad1 = new JTextField(1000);
        
        setLayout(new java.awt.GridLayout(18, 1, 3, 3));
        //frame.getContentPane().add(panelCandidato);
        getContentPane().add(idCandidato);
        getContentPane().add(id_Candidato);
        getContentPane().add(name);
        getContentPane().add(nombre);
        getContentPane().add(ter);
        getContentPane().add(telefono);
        getContentPane().add(email);
        getContentPane().add(correo);
        getContentPane().add(pp);
        getContentPane().add(partidopolitico);
        getContentPane().add(descripcion);
        getContentPane().add(descripcio);
        getContentPane().add(mns);
        getContentPane().add(mensaje);
        getContentPane().add(propuestas);
        getContentPane().add(propu);
        getContentPane().add(boton1);
        setVisible(true);
        //boton1.addActionListener(this);       
    }

    public void actionPerformed(ActionEvent e) {
      if (e.getSource()== boton1) {
          
        //String idCandidato2 = id_Candidato.getText();        
        Candidato candidatos = new Candidato(partidopolitico.getText(), descripcio.getText(), mensaje.getText(), propu.getText(),id_Candidato.getText(),nombre.getText(), telefono.getText(), correo.getText());
        boolean respuesta = this.cc1.agregarCandidato(candidatos);
        candidatos.setDescripcion(descripcio.getText());
        if(respuesta ){
        JOptionPane.showMessageDialog(rootPane,"Candidato Agregado");
        }else{ 
        JOptionPane.showMessageDialog(rootPane,"Candidato No Agregado");
        }
          
      }
      //else {System.out.println("nnnni");
    }
    
}
