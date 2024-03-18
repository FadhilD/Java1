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
public class frame2 extends JFrame implements ActionListener{
    JLabel header = new JLabel("Input Penyewaan Mobil");
    JLabel sub = new JLabel("Silakan isi form dibawah !!");
//    JLabel  = new JLabel("");
    JLabel nama = new JLabel("Nama Penyewa");
    JLabel nomor = new JLabel("Nomor Telepon");
    JLabel jenis1 = new JLabel("Jenis Kendaraan");
    JLabel hari = new JLabel("Hari Persewaan");
    JTextField tnama = new JTextField();
    JTextField tnomor = new JTextField();
    JTextField tsewa = new JTextField();
    JRadioButton r1 = new JRadioButton("Lamborgini");
    JRadioButton r2 = new JRadioButton("Ferrari");
    JRadioButton r3 = new JRadioButton("Civic");
    
    
    JButton simpan = new JButton("Simpan");
//    JButton motor = new JButton("Motor");
    
    frame2(){
    setVisible(true);
    setSize(500,480);
    setTitle("Page Sewa Mobil");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        add(sub);
        add(nama);
        add(nomor);
        add(tnama);
        add(tnomor);
        add(r1);
        add(r2);
        add(r3);
        add(jenis1);
        add(hari);
        add(tsewa);
        add(simpan);
        
        ButtonGroup group = new ButtonGroup();
group.add(r1);
group.add(r2);
group.add(r3);
        
        header.setBounds(20, 20, 240, 44);
        sub.setBounds(20, 50, 240, 22);
        nama.setBounds(20, 130, 90, 35);
        nomor.setBounds(20, 180, 90, 35);
        jenis1.setBounds(20, 220, 190, 35);
        hari.setBounds(20, 330, 190, 35);
        
        
        tnama.setBounds(170, 130, 190, 35);
        tnomor.setBounds(170, 180, 190, 35);
        r1.setBounds(170, 220, 95, 35);
        r2.setBounds(170, 250, 65, 35);
        r3.setBounds(170, 280, 65, 35);
        tsewa.setBounds(170, 330, 190, 35);
        simpan.setBounds(120, 380, 190, 35);
        
//        mobil.addActionListener(this);
//        motor.addActionListener(this);
        
        simpan.addActionListener(this);
        simpan.setActionCommand("simpan");

    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "simpan"){          
           String nama = tnama.getText();
String nomor =tnomor.getText();
String sewa =tsewa.getText();
if(r1.isSelected()){
    String jenis = "Lamborgini";
}
else if( r2.isSelected()){
    String jenis = "Ferrari";
}
else if( r3.isSelected()){
    String jenis = "Civic";
}
new frame4(); 
            
            setVisible(false);
            
        }



    }
}
