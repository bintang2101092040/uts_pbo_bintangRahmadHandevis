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
public class Latihan4 {
     public static void main( String[] args ){

 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 String name = "";
 String alamat = "";
 String jurusan = "";



 try{
 System.out.print("enter word 1:");
 name = dataIn.readLine();
 System.out.print("enter word 2:");
 alamat = dataIn.readLine();
  System.out.print("enter word 3:");
 jurusan = dataIn.readLine();
 }catch( IOException e ){
 System.out.println("Error!");
 }
 System.out.print(" " + name );
 System.out.print(" " + alamat );
 System.out.println("  " + jurusan );
 } 
}
