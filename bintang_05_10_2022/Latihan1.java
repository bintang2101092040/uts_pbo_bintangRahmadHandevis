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
public class Latihan1 {
    public static void main( String[] args ){

 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
 String name = "";
 String alamat = "";
 String jurusan = "";



 try{
 System.out.print("Please Enter Your Name:");
 name = dataIn.readLine();
 System.out.print("alamat:");
 alamat = dataIn.readLine();
  System.out.print("jurusan:");
 jurusan = dataIn.readLine();
 }catch( IOException e ){
 System.out.println("Error!");
 }
 System.out.print("Hello, " + name );
 System.out.print(" di " + alamat );
 System.out.println(" Selamat Datang di " + jurusan );
 } 
}
