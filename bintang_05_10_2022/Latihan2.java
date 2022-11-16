/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintang_05_10_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lenovo
 */
public class Latihan2 {
     public static void main( String[] args ){

 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 int angka1 = 0;
 int angka2 = 0;
 int hasil;



 try{
 System.out.print("angka 1:");
 angka1 = Integer.parseInt(dataIn.readLine());
 System.out.print("angka 2:");
  angka2 = Integer.parseInt(dataIn.readLine());
  
 
 }catch( IOException e ){
 System.out.println("Error!");
 }
 hasil = angka1 + angka2;
 System.out.print("hasil: " +hasil );
 
 } 
}
