/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_19_10_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class latihan5 {
    public static void main( String[] args ){

 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 int tugas = 0;
 int uts = 0;
 int uas = 0;
 int hasil;



 try{
 System.out.print("nilai tugas:");
 tugas = Integer.parseInt(dataIn.readLine());
 System.out.print("nilai uts:");
  uts = Integer.parseInt(dataIn.readLine());
  System.out.print("nilai uas:");
  uas = Integer.parseInt(dataIn.readLine());
  
 
 }catch( IOException e ){
 System.out.println("Error!");
 }
 hasil = (tugas + uts + uas)/3;
 System.out.print("rata-rata " +hasil );
 if( hasil >= 60 ){
 System.out.println( "   :-)" );
 }

 else{
 System.out.println("    :-(");
 }
 
 } 
}
