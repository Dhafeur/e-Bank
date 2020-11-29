/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author workstation
 */
public class Auth extends JFrame{
    //declaration des objets
    JTextField logintxt=new JTextField();
    JPasswordField mptxt=new JPasswordField();
    
    JLabel l1=new JLabel("Login :");
    JLabel l2=new JLabel("Mot de Passe :");
    
    JButton bok=new JButton("Valider");
    JButton bquitter=new JButton("Quitter");
    JLabel lab = new JLabel();

    public Auth() {
        //configuration de la fenetre
         
        this.setTitle("E-BANK");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500,200);
        this.setVisible(true);
        
        // declaration et configuration des panels
        JPanel p = new JPanel();
        FlowLayout f1 = new FlowLayout();
        p.setBackground(Color.white);
        p.setLayout(f1);
        p.add(bok);
        p.add(bquitter);
        
        JPanel p2 = new JPanel();
        GridLayout b1 = new GridLayout(2, 2);
        p2.setLayout(b1);
        p2.setBackground(Color.white);
        p2.add(l1);
        p2.add(logintxt);
        p2.add(l2);
        p2.add(mptxt);
        
        Panel p3 = new Panel(new FlowLayout());
        p3.setBackground(Color.white);
        p3.add(lab);
       //lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glv/image/auth.jpg")));
        
        
        BorderLayout aa = new BorderLayout();
        this.getContentPane().setLayout(aa);
        this.getContentPane().add("Center",p2);
        this.getContentPane().add("South",p);
        this.getContentPane().add("North",p3);
        
        
        
        this.setBackground(Color.WHITE);
        
        
    }
    public static void main(String[] args) {
        JFrame f= new Auth();
    }
}
