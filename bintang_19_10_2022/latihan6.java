/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_19_10_2022;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class latihan6 {
     public static void main( String[] args ){
 int tugas = 0;
 int uts = 0;
 int uas = 0;
 int hasil=0;
 tugas =Integer.parseInt(JOptionPane.showInputDialog("enter nilai tugas"));
  uts = Integer.parseInt(JOptionPane.showInputDialog("enter nilai uts"));
  uas = Integer.parseInt(JOptionPane.showInputDialog("enter nilai uas"));
  
   hasil = (tugas + uts + uas)/3;

String msg = (" ");
if( hasil >= 60 ){
 msg= ",:-)   " + hasil;
 }

 else{
 msg= " :-(   " + hasil;
 }


 JOptionPane.showMessageDialog(null, msg);

 } 
}
