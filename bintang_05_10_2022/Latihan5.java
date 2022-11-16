/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_05_10_2022;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Latihan5 {
     public static void main( String[] args ){
 String name = "";
 String alamat = "";
 String jurusan = "";
 name = JOptionPane.showInputDialog("enter word 1");
  alamat = JOptionPane.showInputDialog("enter word 2");
  jurusan = JOptionPane.showInputDialog("enter word 2");

String msg = (" "+ name +" " + alamat +" " + jurusan);


 JOptionPane.showMessageDialog(null, msg);

 } 
}