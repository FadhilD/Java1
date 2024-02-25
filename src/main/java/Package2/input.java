/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import java.util.Scanner;

import Package1.*;
/**
 *
 * @author asus
 */
public class input {
  public void manggil() {
    Perkenalan objek1 = new Perkenalan();
    tanya objek2 = new tanya();
    // Package1 objek1 = new Package1();
    objek1.salam();
    objek1.nama();
    objek2.nanya();
  }

public static String InputUser(){

  Scanner inputuser = new Scanner(System.in);
  System.out.println("Masukkan Nama Anda : ");
//  inputuser.close();
  return inputuser.nextLine();
}   
}
