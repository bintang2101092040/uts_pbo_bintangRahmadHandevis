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
public class latihan1_2 {
     public static void main( String[] args ){
         int grade = 0;
 
 
 grade = Integer.parseInt(JOptionPane.showInputDialog("masukan nilai="));
  

String msg = ("");

if( grade >= 90 ){
 msg =  "Excellent!" ;
 }
 else if( (grade < 90) && (grade >= 80)){
 msg = "Good job!" ;
 }
 else if( (grade < 80) && (grade >= 60)){
 msg = "Study harder!" ;
 }
 else{
 msg = "Sorry, you failed.";
 }


 JOptionPane.showMessageDialog(null, msg);

 } 
}
