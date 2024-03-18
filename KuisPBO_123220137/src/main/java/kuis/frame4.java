/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Lab Informatika
 */
public class frame4 extends JFrame implements ActionListener {
            JLabel header = new JLabel("Data Penyewaan ");
    
//    JLabel  = new JLabel("");
    JLabel nama = new JLabel("Nama Penyewa");
    JLabel nomor = new JLabel("Nomor Telepon");
    JLabel jenis1 = new JLabel("Jenis Kendaraan");
    JLabel hari = new JLabel("Hari Persewaan");
    JLabel total = new JLabel("Hari Persewaan");
    
    JButton selesai = new JButton("Selesai");
     frame4(){
    setVisible(true);
    setSize(500,480);
    setTitle("Page Data Sewa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        
        add(nama);
        add(nomor);

        add(jenis1);
        add(hari);
        add(selesai);
        add(total);
        
        header.setBounds(20, 20, 240, 44);
        
        nama.setBounds(20, 130, 90, 35);
        nomor.setBounds(20, 180, 90, 35);
        jenis1.setBounds(20, 220, 190, 35);
        hari.setBounds(20, 270, 190, 35);
        total.setBounds(20, 320, 190, 35);
        selesai.setBounds(120, 380, 190, 35);
        
selesai.addActionListener(this);
selesai.setActionCommand("selesai");
     }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getActionCommand() == "selesai"){          
           
            setVisible(false);
    }
    }
}
