/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class frame1 extends JFrame implements ActionListener{
    JLabel header = new JLabel("Selamat Datang!!");
    JLabel sub = new JLabel("Silakan pilih jenis kendaraan !!");
    JButton mobil = new JButton("Mobil");
    JButton motor = new JButton("Motor");
    
    frame1(){
    setVisible(true);
    setSize(300,280);
    setTitle("Home Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(sub);
        add(mobil);
        add(motor);
        
        
        header.setBounds(20, 20, 240, 24);
        sub.setBounds(20, 50, 240, 12);
        mobil.setBounds(70, 120, 140, 35);
        motor.setBounds(70, 170, 140, 35);
        
        mobil.addActionListener(this);
        motor.addActionListener(this);
        mobil.setActionCommand("mobil");
        motor.setActionCommand("motor");
        
        
        
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "mobil"){          
            new frame2();
            setVisible(false);
            
        }
        else if (e.getActionCommand() == "motor"){            
            new frame3();
            setVisible(false);
        }
    }
}
